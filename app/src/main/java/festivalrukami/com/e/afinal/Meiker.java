package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Meiker extends AppCompatActivity {
Button aboutmeiker,organizacii;
    ImageButton return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meiker);
        return1 = (ImageButton) findViewById(R.id.backfest2);

        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Meiker.this, Festival.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }
    public void meiker (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://project2719596.tilda.ws/page12607381.html"));
        startActivity(browserIntent);
    }
}