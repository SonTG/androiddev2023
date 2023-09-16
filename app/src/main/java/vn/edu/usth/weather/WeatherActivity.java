package vn.edu.usth.weather;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.util.Log;

import vn.edu.usth.weather.databinding.ActivityWeatherBinding;

public class WeatherActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityWeatherBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
        Log.i("Create", "App Created");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("onStart", "App Started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Resume","App Resumed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Pause","App Paused");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Stop","App Stoped");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Destroy","App Destroyed");
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_weather);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
