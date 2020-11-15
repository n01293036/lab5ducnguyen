package assignment1.example.lab5ducnguyen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AgeFragment extends Fragment {
    TextView display;
    EditText luumau;
    Button next;
    public AgeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_age, container, false);

        //display last data from last frag
        display=v.findViewById(R.id.displaytuoine);
        Bundle bundle1 = this.getArguments();
        String data= bundle1.getString("age");
        display.setText("Ok, so you are "+data+" years old. What is your favorite colour?");

        //save agedata
        luumau=v.findViewById(R.id.luutuoine);

        //pass to next fragment
        next = v.findViewById(R.id.nextbutton2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save age data
                Bundle bundle = new Bundle();
                bundle.putString("mau",luumau.getText().toString());

                //Pass frag
                FavoriteFragment nextFragment = new FavoriteFragment();
                nextFragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.container,nextFragment).commit();
                /*FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, nextFragment);
                transaction.commit();*/
            }
        });

        return v;
    }
}