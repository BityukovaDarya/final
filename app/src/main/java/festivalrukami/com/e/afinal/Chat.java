package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chat extends AppCompatActivity {
    ImageButton return1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        return1 = (ImageButton) findViewById(R.id.backfest1);
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Chat.this, Festival.class);
                            startActivity(intent); finish();
                        }
                        catch (Exception e){}
                    }
                }
        );

    }
    public void chat (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://spatial.chat/"));
        startActivity(browserIntent);
    }
}