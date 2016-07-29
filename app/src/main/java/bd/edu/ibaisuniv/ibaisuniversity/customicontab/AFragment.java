package bd.edu.ibaisuniv.ibaisuniversity.customicontab;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment implements ListView.OnItemSelectedListener{

    ListView list;
    String[] item= {"Fragment d","Fragment e","Fragment f","Fragment g","Fragment h"};

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        ListView lv =(ListView)view.findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, item);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment mfragmen=null;
                switch ((int) id) {
                    case 0: {
                        mfragmen = new DFragment();
                        break;
                    }
                    case 1: {
                        mfragmen = new EFragment();
                        break;
                    }
                    default: {
                        mfragmen = new FFragment();
                        break;
                    }
                }
                fragmentHandler(mfragmen);
            }
        });


        return view;
    }

    public void fragmentHandler(Fragment fragment){
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.testFrame, fragment).addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
