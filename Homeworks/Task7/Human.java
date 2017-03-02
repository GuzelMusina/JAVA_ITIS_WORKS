/**
 * Created by Guzel on 22.02.2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.setAge(age);
        this.setName(name);
        this.age = age;
    }

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
        if (age > 1 && age <= 150) {
            this.age = age;

        } else this.age = 1;
    }
}
