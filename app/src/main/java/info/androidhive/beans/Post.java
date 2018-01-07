package info.androidhive.beans;

/**
 * Created by Erene on 27/12/2017.
 */

public class Post {
    Integer ImageProfile;
    String name;
    String date;
    String postText;

    public Post(Integer imageProfile, String name, String date, String postText) {
        ImageProfile = imageProfile;
        this.name = name;
        this.date = date;
        this.postText = postText;
    }

    public Integer getImageProfile() {
        return ImageProfile;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPostText() {
        return postText;
    }

    public void setImageProfile(Integer imageProfile) {
        ImageProfile = imageProfile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "Post{" +
                "ImageProfile=" + ImageProfile +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", postText='" + postText + '\'' +
                '}';
    }
}
