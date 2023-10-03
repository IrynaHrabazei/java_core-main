package Homework2.task1;

public class Laptop extends PC{
    private int weight;

    public Laptop() {
    }

    public Laptop(int weight) {
        this.weight = weight;
    }

    public Laptop(int CPus, int RAM, double monitor, int weight) {
        super(CPus, RAM, monitor);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                '}' + super.toString();
    }

}
