package Sem1Homework.Tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();

        People first = new People(1, "Николай", "Бабушкин", "Викторович", "Мужчина",
                LocalDate.of(1990, 12, 6), null,
                "Формовщик", "Екатеринбург", "Среднее");

        People second = new People(2, "Екатерина", "Бабушкина", "Кириловна",
                "Женщина", LocalDate.of(1995, 07, 13),
                null,
                "Секретарь", "Екатеринбург", "Высшее");

        first.addmarriageRelations(new marriageRelations(1, 2, 0, 0));

        second.addmarriageRelations(new marriageRelations(2, 1, 0, 0));

        peoples.add(second);
        peoples.add(first);

        People third = new People(3, "Мария", "Котикова", "Евгеньевна", "Женщина", LocalDate.of(1996, 07, 13), null,
                null, null, null);

        third.addmarriageRelations(new marriageRelations(3, 4, 0, 0));

        peoples.add(third);

        print(peoples);

        merried(first, third);

    }

    public static void merried(People first, People second) {
        List<marriageRelations> peoplesfirst = new ArrayList<>();
        peoplesfirst.addAll(first.readmeriageRelations());
        List<marriageRelations> peoplessecond = new ArrayList<>();
        peoplessecond.addAll(second.readmeriageRelations());
        int mer = 0;

        for (int i = 0; i < peoplesfirst.size(); i++) {
            mer = peoplesfirst.get(i).getPartnerId();
        }

        if (second.getId().equals(mer)) {
            System.out.println("Эта пара муж и жена");
        } else {
            System.out.println("Эта пара не семья");
        }

    }

    public static void print(List<People> peoples) {
        for (People c : peoples) {
            System.out.println(c);
        }
    }

}
