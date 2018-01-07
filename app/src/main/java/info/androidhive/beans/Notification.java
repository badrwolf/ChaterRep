package info.androidhive.beans;

/**
 * Created by Erene on 27/12/2017.
 */

public class Notification {

    String title;
    String date;
    String textNotification;

    public Notification(String title, String date, String textNotification) {
        this.title = title;
        this.date = date;
        this.textNotification = textNotification;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTextNotification() {
        return textNotification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTextNotification(String textNotification) {
        this.textNotification = textNotification;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", textNotification='" + textNotification + '\'' +
                '}';
    }
}
