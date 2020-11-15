package assignment1.example.lab5ducnguyen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.GONE;

public class HomeFragment extends Fragment {
    Button send;
    EditText luuten;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        luuten = v.findViewById(R.id.luutenne);
        send = v.findViewById(R.id.nextbutton);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //save and send data
                Bundle bundle = new Bundle();
                bundle.putString("key",luuten.getText().toString());
                
                //Pass frag
                NextFragment1 nextFragment = new NextFragment1();
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