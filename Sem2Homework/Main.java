package Sem2Homework;

import java.util.Scanner;

public class Main extends PeopleOne {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println(
                                "Введите действие:\n1-Распечатать список всех людей\n2-Поиск связей человека по ID\n3-Исследование детей\n4-Запись в файл связей человека по ID\n5-Запись в файл общего списка");
                System.out.println();

                int number = scanner.nextInt();

                RepositoryPeople peoples = new RepositoryPeople();

                peoples.Create(new PeopleOne(1, "Елена", "Котикова", "Кириловна",
                                "Женщина"));
                peoples.Create(new PeopleOne(2, "Николай", "Котиков", "Петрович",
                                "Мужчина"));
                peoples.Create(new PeopleOne(3, "Василий", "Персиков", "Петрович",
                                "Мужчина"));
                peoples.Create(new PeopleOne(4, "Мария", "Персикова", "Николаевна",
                                "Женщина"));
                peoples.Create(new PeopleOne(5, "Екатерина", "Персикова", "Николаевна",
                                "Женщина"));
                peoples.Create(new PeopleOne(6, "Михаил", "Персиков", "Николаевич",
                                "Мужчина"));
                peoples.Create(new PeopleOne(7, "Мария", "Таврикова", "Криловна",
                                "Женщина"));
                peoples.Create(new PeopleOne(8, "Дмитрий", "Тавриков", "Евгеньевич",
                                "Мужчина"));

                RepositoryMerRelation married = new RepositoryMerRelation();

                married.Create(new MarriageRelat(1, 2, 0, 0));
                married.Create(new MarriageRelat(2, 1, 0, 0));
                married.Create(new MarriageRelat(3, 4, 0, 0));
                married.Create(new MarriageRelat(4, 3, 0, 0));

                RepositoryBloodRelation bloodRel = new RepositoryBloodRelation();

                bloodRel.Create(new BloodRelat(1, 3, 4, 0, 0, null));
                bloodRel.Create(new BloodRelat(2, 7, 8, 0, 0, null));

                RepositoryChild children = new RepositoryChild();

                children.Create(new ChildRelations(5, 2, 1, 4, 3, null));
                children.Create(new ChildRelations(6, 2, 1, 4, 3, null));

                Repo repo = new Repo(peoples, married, bloodRel, children);
                Control.ControlTree(number, repo);
                scanner.close();
        }

        public Main(int id, String name, String surname, String patronymic, String gender) {
                super(id, name, surname, patronymic, gender);
        }
}
