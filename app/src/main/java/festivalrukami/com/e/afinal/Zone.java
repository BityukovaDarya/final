package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Zone extends AppCompatActivity {
    ImageButton encelad, venera, pluton, cerera, triron, titan, mars;
    TextView textView;
    ImageButton return1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);
        encelad = (ImageButton) findViewById(R.id.encelad);
        venera = (ImageButton) findViewById(R.id.venera);
        pluton = (ImageButton) findViewById(R.id.pluton);
        cerera = (ImageButton) findViewById(R.id.Cerera);
        triron= (ImageButton) findViewById(R.id.Triton);
        titan = (ImageButton) findViewById(R.id.titan);
        mars = (ImageButton) findViewById(R.id.mars);
        textView = (TextView) findViewById(R.id.textView4);


        encelad.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
     textView.setText(R.string.encelad);
    }
});
        venera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.venera);
            }
        });
        pluton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.pluton);
            }
        });
        cerera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.cerera);
            }
        });
        triron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.triton);
            }
        });
        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.titan);
            }
        });
        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.mars);
            }
        });

        return1 = (ImageButton) findViewById(R.id.backfest2);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Zone.this, Festival.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );
    }
}