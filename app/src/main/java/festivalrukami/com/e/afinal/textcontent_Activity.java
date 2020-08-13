package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class textcontent_Activity extends AppCompatActivity {
    private TextView text_content;
    private int category = 0;
    private int position = 0;
    ImageButton return1;
    private int [] array_partners = {R.string.admin,R.string.techno,R.string.DIY,R.string.obrazov,R.string.semya,R.string.molodezh,R.string.information};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textcontent);
        text_content = findViewById(R.id.textView7);
        reciveIntent();
        return1 = (ImageButton) findViewById(R.id.backfest2);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (textcontent_Activity.this, Partner.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );

    }

   private void  reciveIntent (){
       Intent i = getIntent();
       if (category == 0 && position == 0){text_content.setText(R.string.admin);}
       else {text_content.setText(R.string.techno);}


   }


}