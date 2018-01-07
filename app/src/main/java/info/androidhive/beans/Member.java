package info.androidhive.beans;

/**
 * Created by Erene on 27/12/2017.
 */

public class Member {
    private Integer imageUser;
    private String school;
    private String name;
    private String status;

    public Member(Integer imageUser, String school, String name, String status) {
        this.imageUser = imageUser;
        this.school = school;
        this.name = name;
        this.status = status;
    }

    public Integer getImageUser() {
        return imageUser;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setImageUser(Integer imageUser) {
        this.imageUser = imageUser;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "imageUser=" + imageUser +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
