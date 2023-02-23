package Sem2Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    /**
     * @param number
     * @param repo
     */
    public static void ControlTree(int number, Repo repo) {
        Scanner scanner = new Scanner(System.in);

        switch (number) {
            case 1:
                System.out.println("Общий список:");
                var res = repo.readPeopleList();
                System.out.println(res);
                break;
            case 2:
                System.out.println("Введите ID");
                int num = scanner.nextInt();
                if (num < 3) {
                    System.out.println("Генеалогическое древо: ");
                    PrintTree(num, repo);
                    break;
                } else {
                    System.out.println(
                            "Ой, недостаточно людей для выполнения вашей просьбы Приложение в разработке! Выберите 1 или 2:)");
                    break;
                }
            case 3:
                System.out.println("Введите ID");
                int n = scanner.nextInt();

                if (n < 3) {
                    System.out.println("Идёт запись древа в файл...");
                    SavingTreeID(n, repo);
                    System.out.println("Файл записан");
                    break;
                } else {
                    System.out.println(
                            "Ой, недостаточно людей для выполнения вашей просьбы Приложение в разработке! Выберите 1 или 2:)");
                    break;

                }
            case 4:
                System.out.println("Идёт запись общего списка в файл...");
                Saving(repo);
                System.out.println("Файл записан");
                break;
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

    public static void SavingTreeID(int number, Repo repo) {
        try (FileWriter writer = new FileWriter("tree.txt", false)) {

            writer.write(repo.Read(number).toString() + "\n");
            writer.write("Партнер: " + repo.Read(repo.ReadPartner(number)) + "\n");
            writer.write("Мама: " + repo.Read(repo.ReadMother(number)) + "\n");
            writer.write("Папа: " + repo.Read(repo.ReadFather(number)) + "\n");
            ArrayList<Integer> listChildren = repo.ReadChildMother(number);
            for (Integer integer : listChildren) {
                writer.write("Ребенок: " + repo.Read(integer) + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Saving(Repo repo) {

        try (FileWriter writer = new FileWriter("tree.txt", false)) {
            var res = repo.readPeopleList();

            writer.write(res + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
