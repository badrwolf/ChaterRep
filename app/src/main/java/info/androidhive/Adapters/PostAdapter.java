package info.androidhive.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
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
import info.androidhive.beans.Post;

/**
 * Created by Erene on 27/12/2017.
 */

public class PostAdapter extends ArrayAdapter<Post> {

    List<Post> allPosts;
    private Context context;

    public PostAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Post> allPosts) {
        super(context, resource, allPosts);
        this.allPosts = allPosts;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_post, parent, false);

        ImageView imageView_ImageProfile = (ImageView) convertView.findViewById(R.id.item_home_image);
        TextView tv_name = (TextView) convertView.findViewById(R.id.item_home_name);
        TextView tv_date = (TextView) convertView.findViewById(R.id.item_home_date);
        ;
        TextView tv_postText = (TextView) convertView.findViewById(R.id.item_home_post);
        ;

        imageView_ImageProfile.setBackgroundResource(this.allPosts.get(position).getImageProfile());
        tv_name.setText(this.allPosts.get(position).getName());
        tv_date.setText(this.allPosts.get(position).getDate());
        tv_postText.setText(this.allPosts.get(position).getPostText());

        return convertView;
    }
}
