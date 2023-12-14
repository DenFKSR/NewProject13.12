package Task2;

public class Laba2Task2 {
    public static void main(String[] args) {
        Man man = new Man();
        man.setName("Vitaly");
        man.setAge(12);
        System.out.println(man);
    }
}
class Man {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("возраст не может быть отрицательным");
            return;
        }
        this.age = age;
    }

public Man() {
 }
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return getName() + ", " + getAge();
    }
}
