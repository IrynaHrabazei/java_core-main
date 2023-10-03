package Homework2.task3;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Genger genger;
    private Car car;
    private final ArrayList <Skill> skills = new ArrayList<>();

    public User() {
    }

    public User(int id, String name, String surname, String email, int age, Genger genger, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.genger = genger;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genger getGenger() {
        return genger;
    }

    public void setGenger(Genger genger) {
        this.genger = genger;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", genger=" + genger +
                ", car=" + car +
                ", skills=" + skills +
                '}';
    }
}
