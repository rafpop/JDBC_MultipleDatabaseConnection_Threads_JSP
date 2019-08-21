package model;

public class Car {

    private int id;
    private String branch;
    private String model;

    public Car() {

    }

    public Car(int id, String branch, String model) {
        super();
        this.id = id;
        this.branch = branch;
        this.model = model;

    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "branch='" + branch + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
