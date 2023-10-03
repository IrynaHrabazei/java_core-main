package Homework2.task1;

public class Ultrabook extends Laptop{
    private int width;

    public Ultrabook() {
    }

    public Ultrabook(int width) {
        this.width = width;
    }

    public Ultrabook(int weight, int width) {
        super(weight);
        this.width = width;
    }

    public Ultrabook(int CPus, int RAM, double monitor, int weight, int width) {
        super(CPus, RAM, monitor, weight);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "width=" + width +
                '}' + super.toString();
    }
}
