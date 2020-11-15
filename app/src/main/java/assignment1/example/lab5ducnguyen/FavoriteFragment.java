package assignment1.example.lab5ducnguyen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FavoriteFragment extends Fragment {
    TextView display;
    Button backbutton;
    public FavoriteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_favorite, container, false);

        //display last data from last frag
        display=v.findViewById(R.id.displaymaune);
        Bundle bundle2 = this.getArguments();
        String data= bundle2.getString("mau");
        display.setText("Ok, "+data+" is your favorite colour!");

        backbutton = v.findViewById(R.id.finishbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });

        return v;
    }
}