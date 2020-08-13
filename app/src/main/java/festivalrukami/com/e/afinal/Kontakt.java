package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Kontakt extends AppCompatActivity {
    ImageButton return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);
        return1 = (ImageButton) findViewById(R.id.backfest2);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Kontakt.this, Festival.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }

    public void vkontakte(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kvantoriumtomsk.ru"));
        startActivity(browserIntent);
    }

    public void telegram (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rukami_bot?start=666"));
        startActivity(browserIntent);
    }
}
