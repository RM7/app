package de.jugendhackt.schnellervoran_bb;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;


public class MapsLine2 extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private MarkerOptions options = new MarkerOptions();
    private ArrayList<LatLng> latlngs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_line2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    private static final LatLng V1 = new LatLng(50.916820, 6.900012);
    private static final LatLng V2 = new LatLng(50.918678, 6.902601);
    private static final LatLng V3 = new LatLng(50.919712, 6.904642);
    private static final LatLng V4 = new LatLng(50.924308, 6.907359);
    private static final LatLng V5 = new LatLng(50.924156, 6.912056);
    private static final LatLng V6 = new LatLng(50.925985, 6.915895);
    private static final LatLng V7 = new LatLng(50.927947, 6.918456);
    private static final LatLng V8 = new LatLng(50.930548, 6.922762);
    private static final LatLng V9 = new LatLng(50.931121, 6.929169);
    private static final LatLng V10 = new LatLng(50.933040, 6.934353);
    private static final LatLng V11 = new LatLng(50.935530, 6.931992);
    private static final LatLng V12 = new LatLng(50.936176, 6.939421);
    private static final LatLng V13 = new LatLng(50.935778, 6.947712);
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.916820, 6.900012))
                .title("Endstation")
                .snippet("Deckstein")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.918678, 6.902601))
                .title("Haltestelle")
                .snippet("Koppensteinstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.919712, 6.904642))
                .title("Haltestelle")
                .snippet("Freiligrathstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.924308, 6.907359))
                .title("Haltestelle")
                .snippet("Krieler Straße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.924156, 6.912056))
                .title("Haltestelle")
                .snippet("Gleuler Straße / Gürtel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.925985, 6.915895))
                .title("Haltestelle")
                .snippet("Leiblplatz")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.927947, 6.918456))
                .title("Haltestelle")
                .snippet("Geibelstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.930548, 6.922762))
                .title("Haltestelle")
                .snippet("Hildegardis-Krankenhaus")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.931121, 6.929169))
                .title("Haltestelle")
                .snippet("WiSo-Fakultät")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.933040, 6.934353))
                .title("Haltestelle")
                .snippet("Roonstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.935530, 6.931992))
                .title("Haltestelle")
                .snippet("Moltkestraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.936176, 6.939421))
                .title("Haltestelle")
                .snippet("Rudolfplatz")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.935778, 6.947712))
                .title("Endstation")
                .snippet("Neumarkt")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        addLines();
    }
    private void addLines() {

        mMap
                .addPolyline((new PolylineOptions())
                        .add(V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,V13).width(5).color(Color.BLUE)
                        .geodesic(true));
        // move camera to zoom on map
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(V1,
                13));
    }

}

