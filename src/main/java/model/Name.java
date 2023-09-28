package model;

public class Name {
    private String name;

    public Name(String name) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
    }
}
