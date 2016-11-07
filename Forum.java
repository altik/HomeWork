package HomeWork;

/**
 * Created by Rudniev Oleksandr on 07.11.2016.
 */
import java.util.ArrayList;

public class Forum {

    public static void main(String[] args) {
        ArrayList<Person> studList = new ArrayList<Person>();
        studList.add(new Students("Алексей Проконин", 19, "У-12"));
        studList.add(new Students("Борис Годунов", 21, "У-12"));
        studList.add(new Students("Владмири Белочкин", 20, "У-18"));
        studList.add(new Students("Григорий Лепс", 18, "У-12"));
        studList.add(new Students("Дмитрий Даль", 22, "У-13"));
        studList.add(new Students("Eгор Жрунь", 19, "У-11"));
        studList.add(new Students("Жанна Жбань", 17, "У-11"));
        studList.add(new Students("Зинаида Постернак", 18, "У-11"));
        studList.add(new Students("Ирина Оглобля", 18, "У-15"));
        studList.add(new Students("Кира Баркова", 17, "У-18"));
        studList.add(new Teacher("Инокентий Размутякин", 46, "Философия"));

        for (int i = 0; i < studList.size(); i++) {
            System.out.println(studList.get(i));
        }
    }

}
