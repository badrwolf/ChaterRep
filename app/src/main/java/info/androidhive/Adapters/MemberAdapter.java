package info.androidhive.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import info.androidhive.R;
import info.androidhive.beans.Member;

/**
 * Created by Erene on 27/12/2017.
 */

public class MemberAdapter extends ArrayAdapter<Member> {

    List<Member> allMembers;
    private Context context;

    public MemberAdapter(Context context, int resource, @NonNull List<Member> allMembers) {
        super(context, resource, resource, allMembers);
        this.allMembers = allMembers;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_members, parent, false);

        ImageView imageMember = (ImageView) convertView.findViewById(R.id.item_members_image);
        TextView tv_school = (TextView) convertView.findViewById(R.id.item_members_school);
        TextView tv_name = (TextView) convertView.findViewById(R.id.item_members_name);
        TextView tv_status = (TextView) convertView.findViewById(R.id.item_members_status);


        imageMember.setBackgroundResource(this.allMembers.get(position).getImageUser());
        tv_school.setText(this.allMembers.get(position).getSchool());
        tv_name.setText(this.allMembers.get(position).getName());
        tv_status.setText(this.allMembers.get(position).getStatus());

        return convertView;

    }
}
