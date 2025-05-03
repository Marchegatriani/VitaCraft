package model;

public class Profile {
    private String name;
    private String title;
    private String summary;

    public Profile(String name, String title, String summary) {
        this.name = name;
        this.title = title;
        this.summary = summary;
    }

    // Getter & Setter

    @Override
    public String toString() {
        return name + " - " + title + "\n" + summary;
    }

}