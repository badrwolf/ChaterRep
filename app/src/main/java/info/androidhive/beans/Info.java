package info.androidhive.beans;

/**
 * Created by Erene on 27/12/2017.
 */

public class Info {
    String title;
    String textInfo;

    public Info(String title, String textInfo) {
        this.title = title;
        this.textInfo = textInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    @Override
    public String toString() {
        return "Info{" +
                "title='" + title + '\'' +
                ", textInfo='" + textInfo + '\'' +
                '}';
    }
}
