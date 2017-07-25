package android.myapplicationdev.com.knowyourfacts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {


    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_2, container, false);

        Button btnChange = (Button)view.findViewById(R.id.btnChange);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] androidColors = getResources().getIntArray(R.array.androidcolors);
                int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
                view.setBackgroundColor(randomAndroidColor);
            }
        });
        return view;
    }

}
