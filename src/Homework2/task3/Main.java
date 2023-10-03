package Homework2.task3;

public class Main {
    public static void main(String[] args) {
        User user = new User (1,"kokos", "abricosov", "abricos@kokos.com", 18, Genger.Male, new Car("BMW", 2020, 210));
         user.getSkills().add(new Skill("js", 8));
         user.getSkills().add(new Skill("java", 1));
         user.getSkills().add(new Skill("HTML", 3));
         user.getSkills().add(new Skill("CSS", 4));

        System.out.println(user);


    }
}
