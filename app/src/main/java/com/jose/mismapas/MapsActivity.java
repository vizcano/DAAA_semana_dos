package com.jose.mismapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static int puntoInteres;
    public static String titulo;
    public static String snippet;
    public static LatLng marcador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle datos = this.getIntent().getExtras();
        puntoInteres = datos.getInt("location");
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        switch (puntoInteres){
            case 1:
                marcador = new LatLng(42.599364578297404, -5.5671811237637066);
                titulo = getResources().getString(R.string.titulo_catedral);
                snippet = getResources().getString(R.string.snippet_catedral);
                break;
            case 2:
                marcador = new LatLng(42.59830925984068, -5.570721304387238);
                titulo = getResources().getString(R.string.titulo_botines);
                snippet = getResources().getString(R.string.snippet_botines);
                break;
            case 3:
                marcador = new LatLng(42.606730578432156, -5.582328228623059);
                titulo = getResources().getString(R.string.titulo_musac);
                snippet = getResources().getString(R.string.snippet_musac);
                break;
            case 4:
                marcador = new LatLng(42.59849386782218, -5.571485398680355);
                titulo = getResources().getString(R.string.titulo_museo);
                snippet = getResources().getString(R.string.snippet_museo);
                break;
        }

        // You can customize the marker image using images bundled with
        // your app, or dynamically generated bitmaps.
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.visit_48))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(marcador).title(titulo).snippet(snippet));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marcador, 13));
    }
}
