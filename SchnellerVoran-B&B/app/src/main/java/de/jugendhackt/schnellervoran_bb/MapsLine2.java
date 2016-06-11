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
    private static final LatLng V1 = new LatLng(50.974745,
            7.014628);
    private static final LatLng V2 = new LatLng(50.980109, 7.016961);
    private static final LatLng V4 = new LatLng(50.977707, 7.032540);
    private static final LatLng V3 = new LatLng(50.975564, 7.025623);
    private static final LatLng V5 = new LatLng(50.976648, 7.035207);
    private static final LatLng V6 = new LatLng(50.978585, 7.039700);
    private static final LatLng V7 = new LatLng(50.982036, 7.043635);
    private static final LatLng V8 = new LatLng(50.988029, 7.041970);
    private static final LatLng V9 = new LatLng(50.988001, 7.041007);
    private static final LatLng V10 = new LatLng(50.991857, 7.043104);
    private static final LatLng V11 = new LatLng(50.994145, 7.040630);
    private static final LatLng V12 = new LatLng(50.997205, 7.045466);
    private static final LatLng V13 = new LatLng(50.998891, 7.034354);
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.916820, 6.900012))
                .title("Haltestelle")
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
                .position(new LatLng( 50.975564, 7.025623))
                .title("Haltestelle")
                .snippet("Am Springborn")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.976648, 7.035207))
                .title("Haltestelle")
                .snippet("Eddaweg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.978585, 7.039700))
                .title("Haltestelle")
                .snippet("Jasminweg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.982036, 7.043635))
                .title("Haltestelle")
                .snippet("Sigwinstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.988029, 7.041970))
                .title("Haltestelle")
                .snippet("Birkenweg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.988001, 7.041007))
                .title("Haltestelle")
                .snippet("Höhscheider Weg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.991857, 7.043104))
                .title("Haltestelle")
                .snippet("Lippeweg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.994145, 7.040630))
                .title("Haltestelle")
                .snippet("Imbacher Weg")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.997205, 7.045466))
                .title("Haltestelle")
                .snippet("Leuchterstraße")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng( 50.998891, 7.034354))
                .title("Haltestelle")
                .snippet("Mutzbach")
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

