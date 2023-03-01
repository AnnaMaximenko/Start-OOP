package Sem4Homework;

import java.util.Scanner;

public class Interfase extends Start {

    public static void Control(int number, TaskRepository repo) {
        Scanner scanner = new Scanner(System.in);

        switch (number) {
            case 1:
                System.out.println("Ввод новой задачи:");
                repo.addTask();
                break;
            case 2:
                System.out.println("Список задач:");
                repo.print();
                break;
            case 3:
                System.out.println("Список задач по приоритету:");
                repo.sortByPrior();
                repo.print();
                break;
            case 4:
                System.out.println("Введите ID задачи:");
                int num = scanner.nextInt();
                System.out.println(repo.getTask(num - 1));
                break;
            case 5:
                System.out.println("Идёт запись в CSV-файл:");
                repo.setWritable(new SaveCsv());
                repo.saveOne();
                System.out.println("Данные записаны");
                break;
            case 6:
                System.out.println("Идёт запись в XML-файл:");
                repo.setWritable(new SaveXml());
                repo.saveOne();
                System.out.println("Данные записаны");
                break;
            case 7:
                System.out.println("Идёт запись в JSON файл:");
                repo.setWritable(new SaveJson());
                repo.saveOne();
                System.out.println("Данные записаны");
                break;
        }
    }
}
