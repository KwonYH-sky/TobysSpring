package springbook.user.domain;

public class User {
    String id;
    String name;
    String paaword;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPaaword() {
        return paaword;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaaword(String paaword) {
        this.paaword = paaword;
    }
}
