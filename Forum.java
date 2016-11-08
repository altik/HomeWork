package HomeWork;

/**
 * Created by Rudniev Oleksandr on 08.11.2016.
 */

import java.util.ArrayList;

public class Forum {

    public static void main(String[] args) {
        ArrayList<Person> staffList = new ArrayList<Person>();
        staffList.add(new Students("Алексей Проконин", 19, "У-12"));
        staffList.add(new Students("Борис Годунов", 21, "У-12"));
        staffList.add(new Students("Владмири Белочкин", 20, "У-18"));
        staffList.add(new Students("Григорий Лепс", 18, "У-12"));
        staffList.add(new Students("Дмитрий Даль", 22, "У-13"));
        staffList.add(new Students("Eгор Жрунь", 19, "У-11"));
        staffList.add(new Students("Жанна Жбань", 17, "У-11"));
        staffList.add(new Students("Зинаида Постернак", 18, "У-11"));
        staffList.add(new Students("Ирина Оглобля", 18, "У-15"));
        staffList.add(new Students("Кира Баркова", 17, "У-18"));
        staffList.add(new Teacher("Инокентий Размутякин", 46, "Философия"));
        staffList.add(new Teacher("Федор Куприянов", 46, "Окультизм"));

        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
    }

}
