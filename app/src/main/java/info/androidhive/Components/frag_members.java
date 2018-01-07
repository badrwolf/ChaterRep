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

import info.androidhive.Adapters.MemberAdapter;
import info.androidhive.R;
import info.androidhive.beans.Member;

/**
 * Created by Erene on 25/12/2017.
 */

public class frag_members extends Fragment {

    private frag_members.OnFragmentInteractionListener mListener;

    public frag_members() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frag_members, container, false);
        ListView listView_members = (ListView) view.findViewById(R.id.listView_members);
        MemberAdapter memberAdapter = new MemberAdapter(view.getContext(), R.layout.item_members, testListMember());
        listView_members.setAdapter(memberAdapter);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof frag_members.OnFragmentInteractionListener) {
            mListener = (frag_members.OnFragmentInteractionListener) context;
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

    public List<Member> testListMember() {
        List<Member> listMember = new ArrayList<>();
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "al gahi youssef", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "agoujil saad", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "badr chtibi ", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "chater youssef", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "chahoud marwane", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "Anass CHBANI6", "SASTUT"));
        listMember.add(new Member(R.drawable.ic_person, "ENSA", "fouziya al wardiya", "SASTUT"));
        return listMember;
    }
}
