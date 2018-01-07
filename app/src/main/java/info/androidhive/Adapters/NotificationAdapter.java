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
import info.androidhive.beans.Notification;

/**
 * Created by Erene on 27/12/2017.
 */

public class NotificationAdapter extends ArrayAdapter<Notification> {

    List<Notification> allNotifications;
    private Context context;

    public NotificationAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Notification> allNotifications) {
        super(context, resource, allNotifications);
        this.allNotifications = allNotifications;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_news, parent, false);

        TextView tv_date = (TextView) convertView.findViewById(R.id.item_news_date);
        TextView tv_notificationText = (TextView) convertView.findViewById(R.id.item_news_notificationText);
        TextView tv_title = (TextView) convertView.findViewById(R.id.item_news_title);

        tv_title.setText(this.allNotifications.get(position).getTitle());
        tv_notificationText.setText(this.allNotifications.get(position).getTextNotification());
        tv_date.setText(this.allNotifications.get(position).getDate());

        return convertView;
    }
}
