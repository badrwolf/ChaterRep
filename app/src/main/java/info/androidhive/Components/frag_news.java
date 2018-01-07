package info.androidhive.Components;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.Adapters.NotificationAdapter;
import info.androidhive.R;
import info.androidhive.beans.Notification;

/**
 * Created by Erene on 25/12/2017.
 */

public class frag_news extends Fragment {


    private frag_news.OnFragmentInteractionListener mListener;

    public frag_news() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frag_news, container, false);
        ListView listView_news = (ListView) view.findViewById(R.id.listView_news);
        NotificationAdapter newsAdapter = new NotificationAdapter(view.getContext(), R.layout.item_news, listTestNotification());
        listView_news.setAdapter(newsAdapter);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof frag_news.OnFragmentInteractionListener) {
            mListener = (frag_news.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public List<Notification> listTestNotification() {
        List<Notification> listNews = new ArrayList<>();
        listNews.add(new Notification("titre 1", "01/01/2018", "textNotification1"));
        listNews.add(new Notification("Title2", "01/01/2018", "textNotification2"));
        listNews.add(new Notification("Title3", "01/01/2018", "textNotification3"));
        listNews.add(new Notification("Title4", "01/01/2018", "textNotification4"));
        listNews.add(new Notification("Title5", "01/01/2018", "textNotification5"));

        return listNews;
    }
}
