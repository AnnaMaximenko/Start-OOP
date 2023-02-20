package Sem2Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

    }

    public static void Control(int number, Repo repo) {

        switch (number) {
            case 1:
                System.out.println("Общий список:");
                var res = repo.readPeopleList();
                System.out.println(res);
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите ID");
                int num = scanner.nextInt();
                if (num < 3) {
                    System.out.println("Генеалогическое древо: ");
                    PrintTree(num, repo);
                    break;

                } else {
                    System.out.println(
                            "Ой, недостаточно людей для выполнения вашей просьбыю Приложение в разработке! Выберите 1 или 2:)");
                    break;
                }
        }

    }

    public static void PrintTree(int number, Repo repo) {
        System.out.println(repo.Read(number));
        System.out.println("Партнер: " + repo.Read(repo.ReadPartner(number)));
        System.out.println("Мама: " + repo.Read(repo.ReadMother(number)));
        System.out.println("Папа: " + repo.Read(repo.ReadFather(number)));
        ArrayList<Integer> listChildren = repo.ReadChildMother(number);

        for (Integer integer : listChildren) {
            System.out.println("Ребенок: " + repo.Read(integer));
        }
    }
}
