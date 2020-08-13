package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Festival extends AppCompatActivity {
    ImageButton partner, meropr,kontakt, chat, zone, meiker, btn_fest, program;
            Button konkurs;
ImageButton return1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);
        partner = (ImageButton) findViewById(R.id.partner);
        meropr = (ImageButton) findViewById(R.id.meropr);
        kontakt = (ImageButton) findViewById(R.id.kontakt);
        chat= (ImageButton) findViewById(R.id.chat);
        zone = (ImageButton) findViewById(R.id.zone);
        meiker = (ImageButton) findViewById(R.id.meiker);
        btn_fest  = (ImageButton) findViewById(R.id.btn_fest);
        program = (ImageButton) findViewById(R.id.program);
        konkurs = (Button) findViewById(R.id.konkurs);
        partner.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Partner");
                        startActivity(intent);
                    }
                }
        );
        meropr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Meropr");
                        startActivity(intent);
                    }
                }
        );
       kontakt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Kontakt");
                        startActivity(intent);
                    }
                }
        );
     chat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Chat");
                        startActivity(intent);
                    }
                }
        );
        zone.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Zone");
                        startActivity(intent);
                    }
                }
        );
        meiker.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Meiker");
                        startActivity(intent);
                    }
                }
        );
        btn_fest.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Fest");
                        startActivity(intent);
                    }
                }
        );
        program.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Program");
                        startActivity(intent);
                    }
                }
        );

        konkurs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (".Konkurs");
                        startActivity(intent);
                    }
                }
        );

        return1 = (ImageButton) findViewById(R.id.backfest2);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Festival.this, MainActivity.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }
}