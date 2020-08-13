package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

public class Meropr extends AppCompatActivity {
    ImageButton return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meropr);
        return1 = (ImageButton) findViewById(R.id.backfest2);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Meropr.this, Festival.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }
}