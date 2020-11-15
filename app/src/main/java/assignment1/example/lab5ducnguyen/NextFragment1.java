package assignment1.example.lab5ducnguyen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NextFragment1 extends Fragment {
    TextView displayname;
    EditText luutuoi;
    Button next;

    public NextFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_next1, container, false);
        
        //display last data from last frag
        displayname=v.findViewById(R.id.showname);
        Bundle bundle = this.getArguments();
        String data = bundle.getString("key");
        displayname.setText("Hello "+data+". How old are you?");

        //save agedata
        luutuoi=v.findViewById(R.id.luutuoine);

        
        //pass to next fragment
        next = v.findViewById(R.id.nextbutton1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save age data
                Bundle bundle = new Bundle();
                bundle.putString("age",luutuoi.getText().toString());

                //Pass frag
                AgeFragment nextFragment = new AgeFragment();
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