package info.androidhive.Components;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import info.androidhive.Adapters.InfoAdapter;
import info.androidhive.R;
import info.androidhive.beans.Info;

/**
 * Created by Erene on 25/12/2017.
 */

public class frag_info extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_info, container, false);
        ListView listView_info = (ListView) view.findViewById(R.id.listView_info);
        InfoAdapter infoAdapter = new InfoAdapter(view.getContext(), R.layout.item_info, testListInfo());
        listView_info.setAdapter(infoAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public List<Info> testListInfo() {
        List<Info> listInfo = new ArrayList<>();
        String text = "If you et to the top of a mountain find a bigger one and keep moving forward";
        listInfo.add(new Info("Info1", text));
        listInfo.add(new Info("Info2", text));
        listInfo.add(new Info("Info3", text));
        listInfo.add(new Info("Info4", text));
        listInfo.add(new Info("Info5", text));
        listInfo.add(new Info("Info6", text));
        return listInfo;
    }

}
