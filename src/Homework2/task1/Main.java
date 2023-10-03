package Homework2.task1;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8,16,16.4,2);
        System.out.println(laptop);
        Ultrabook ultrabook = new Ultrabook(8,32,16,1, 2);
        System.out.println(ultrabook);
        Workstation workstation= new Workstation(8,32,18,1,VideoCard.NVIDIA);
        System.out.println(workstation);


    }
}