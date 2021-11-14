package models;

public abstract class BasePersonnel {

    private final String name;

    public BasePersonnel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
