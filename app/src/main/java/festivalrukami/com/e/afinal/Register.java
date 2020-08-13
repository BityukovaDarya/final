package festivalrukami.com.e.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    EditText txt_email,last_name,n_name;
    Button btn_reg, back;
    DatabaseReference reff;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txt_email=(EditText)findViewById(R.id.txt_email);
        last_name=(EditText)findViewById(R.id.last_name);
        n_name=(EditText)findViewById(R.id.n_name);
        btn_reg=(Button) findViewById(R.id.kontakt);
        back=(Button) findViewById(R.id.back);
        user = new User();
        reff=FirebaseDatabase.getInstance().getReference().child("User");
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setName(n_name.getText().toString().trim());
                user.setLast_name(last_name.getText().toString().trim());
                user.setEmail(txt_email.getText().toString().trim());
                reff.push().setValue(user);
                Toast.makeText(Register.this,"Вы успешно зарегистрировались на фестиваль!",Toast.LENGTH_LONG).show();
            }
        });
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {   Intent intent = new Intent (Register.this, MainActivity.class);
                            startActivity(intent); finish();
                        }
                    catch (Exception e){}
                    }
                }
        );
    }
}