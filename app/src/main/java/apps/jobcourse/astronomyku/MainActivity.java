package apps.jobcourse.astronomyku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout btn_moon, btn_galaxy, btn_sky, btn_sun, btn_planet, btn_landscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_moon = findViewById(R.id.moon);
        btn_galaxy = findViewById(R.id.galaxy);
        btn_sky = findViewById(R.id.sky);
        btn_sun = findViewById(R.id.sun);
        btn_planet = findViewById(R.id.planet);
        btn_landscape = findViewById(R.id.landscape);

        btn_moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomoon = new Intent(MainActivity.this,MoonActivity.class);
                startActivity(gotomoon);

            }
        });
    }
}