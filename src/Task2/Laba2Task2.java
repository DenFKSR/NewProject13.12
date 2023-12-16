package Task2;

public class Laba2Task2 {
    public static void main(String[] args) {
        Man man = new Man("Vasya", 16, "sailor", 12345 );
    }
}
class Man{
    String name;
    int age;
    String profession;
    int bankAccount;
    boolean materialStatus;

    public Man() {
        this.name = "name";
        this.age = 0;
        this.profession = "profession";
        this.bankAccount = 000;
        this.materialStatus = false;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.profession);
        System.out.println(this.bankAccount);
        System.out.println(this.materialStatus);
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Man(String name, int age, String profession, int bankAccount) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.bankAccount = bankAccount;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.profession);
        System.out.println(this.bankAccount);
    }
}
