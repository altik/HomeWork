package HomeWork;

/**
 * Created by Rudniev Oleksandr on 08.11.2016.
 */
public class Students extends Person {
    private String group;

    Students(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student name is " + name + ", age is " + age + ", group " + group;
    }
}