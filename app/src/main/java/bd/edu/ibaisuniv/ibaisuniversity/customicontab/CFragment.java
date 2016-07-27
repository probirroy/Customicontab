package bd.edu.ibaisuniv.ibaisuniversity.customicontab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CFragment extends Fragment {

    TextView text_one;
    View rootview;
    public CFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c, container, false);


        TextView text = (TextView) view.findViewById(R.id.text_one);
        text.setText(getResources().getString(R.string.large_text));

        return view;
    }

}
