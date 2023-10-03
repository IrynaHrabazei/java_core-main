package Homework2.task1;

public class PC {
    private int CPus;
    private int RAM;
    private double monitor;

    public PC() {
    }

    public PC(int CPus, int RAM, double monitor) {
        this.CPus = CPus;
        this.RAM = RAM;
        this.monitor = monitor;
    }

    public int getCPus() {
        return CPus;
    }

    public void setCPus(int CPus) {
        this.CPus = CPus;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getMonitor() {
        return monitor;
    }

    public void setMonitor(double monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "CPus=" + CPus +
                ", RAM=" + RAM +
                ", monitor=" + monitor +
                '}';
    }
}
