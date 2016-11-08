package HomeWork;

/**
 * Created by Rudniev Oleksandr on 08.11.2016.
 */
public class Teacher extends Person {

    private String profession;
    protected Teacher(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher name is " + name + ", age is " + age + ", profession is a " + profession;
    }

}