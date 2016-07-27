package bd.edu.ibaisuniv.ibaisuniversity.customicontab;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment implements View.OnClickListener{

    Button btn_angry_btn1,btn_angry_btn2,btn_angry_btn3;

    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        btn_angry_btn1 = (Button) view.findViewById(R.id.angry_btn1);
        btn_angry_btn1.setOnClickListener(this);


        return view;
    }

    public void showBFragmentButton(View v)
    {
        ((MainActivity)getActivity()).openFragment(new DFragment());
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.angry_btn1:
                showBFragmentButton(view);
                break;

            default:
                break;
        }
    }
}
