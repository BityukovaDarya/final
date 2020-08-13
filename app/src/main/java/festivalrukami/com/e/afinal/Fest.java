package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Fest extends AppCompatActivity {
Button aboutfest, organization;
        ImageButton return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fest);
        aboutfest = (Button) findViewById(R.id.aboutfest);
        organization = (Button) findViewById(R.id.organizator);
        return1 = (ImageButton) findViewById(R.id.backfest2);
        aboutfest.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".MoreaboutFest");
                        startActivity(intent);
                    }
                }
        );
        organization.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Organization");
                        startActivity(intent);
                    }
                }
        );
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Fest.this, MainActivity.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }
}