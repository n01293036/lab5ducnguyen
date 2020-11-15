package assignment1.example.lab5ducnguyen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView) findViewById(R.id.maintext1);
        bt=(Button)findViewById(R.id.mainbutton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setVisibility(GONE);
                bt.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                HomeFragment fragment = new HomeFragment();
                fm.beginTransaction().replace(R.id.container,fragment).commit();
            }
        });
    }
}