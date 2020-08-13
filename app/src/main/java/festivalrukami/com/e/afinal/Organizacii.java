package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Organizacii extends AppCompatActivity {
    ImageButton btPrevious,btnext;
    ImageSwitcher imageSwitcher;
    int imageList[] = {R.drawable.meik1,R.drawable.meik2,R.drawable.meik3,R.drawable.meik4,R.drawable.meik5};
    int count = imageList.length;
    int currentIndex=0;
ImageButton return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizacii);
        return1 = (ImageButton) findViewById(R.id.backfest2);
        btPrevious =  findViewById(R.id.bt_previous);
        btnext =  findViewById(R.id.bt_next);
        imageSwitcher =  findViewById(R.id.image_switcher);


        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        LinearLayout.LayoutParams.FILL_PARENT,
                        LinearLayout.LayoutParams.FILL_PARENT));
                return imageView;
            }
        });
        imageSwitcher.setImageResource(imageList[0]);

        btPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageSwitcher.setInAnimation(Organizacii.this, R.anim.from_right);
                imageSwitcher.setOutAnimation(Organizacii.this, R.anim.to_left);
                --currentIndex;
                if (currentIndex < 0)
                    currentIndex = imageList.length-1;
                imageSwitcher.setImageResource(imageList[currentIndex]);
            }
        });
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageSwitcher.setInAnimation(Organizacii.this, R.anim.from_left);
                imageSwitcher.setOutAnimation(Organizacii.this, R.anim.to_right);
                currentIndex++;
                if (currentIndex == count)
                    currentIndex = 0;
                imageSwitcher.setImageResource(imageList[currentIndex]);
            }
        });
        return1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Organizacii.this, Festival.class);
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