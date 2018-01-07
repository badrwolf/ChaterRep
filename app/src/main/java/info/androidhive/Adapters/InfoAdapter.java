package info.androidhive.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import info.androidhive.R;
import info.androidhive.beans.Info;


/**
 * Created by Erene on 27/12/2017.
 */

public class InfoAdapter extends ArrayAdapter<Info> {

    List<Info> allInfo;
    private Context context;

    public InfoAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Info> allInfo) {
        super(context, resource, allInfo);
        this.allInfo = allInfo;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_info, parent, false);

        TextView textView_infoTitle = (TextView) convertView.findViewById(R.id.item_info_title);
        textView_infoTitle.setText(this.allInfo.get(position).getTitle());

        TextView textView_infoText = (TextView) convertView.findViewById(R.id.item_info_infoText);
        textView_infoText.setText(this.allInfo.get(position).getTextInfo());

        return convertView;
    }
}
