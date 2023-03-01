package Sem4Homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Start {
        public static void main(String[] args) {
                TaskRepository one = new TaskRepository();

                Task task1 = CreateTask.getUnit()
                                .setId(1)
                                .setDescription("Работа 1")
                                .setCreator("Иванов Иван Иванович")
                                .setDedlain(LocalDate.of(2023, 05, 03))
                                .setPriority(3)
                                .create();

                Task task2 = CreateTask.getUnit()
                                .setId(2)
                                .setDescription("Уборка")
                                .setCreator("Петров Петр Петрович")
                                .setDedlain(LocalDate.of(2023, 04, 10))
                                .setPriority(1)
                                .create();

                Task task3 = CreateTask.getUnit()
                                .setId(3)
                                .setDescription("Приготовить обед")
                                .setCreator("Петров Петр Петрович")
                                .setDedlain(LocalDate.of(2023, 03, 06))
                                .setPriority(2)
                                .create();

                one.add(task1);
                one.add(task2);
                one.add(task3);

                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите действие:\n" +
                                "1-Создать задачу\n" +
                                "2-Распечатать список всех задач\n" +
                                "3-Сортировка задач поприоритету\n" +
                                "4-Поиск задачи по ID" +
                                "\n5-Запись в CSV-файл" +
                                "\n6-Запись в XML-файл" +
                                "\n7-Запись в JSON-файл");

                int number = scanner.nextInt();

                Interfase.Control(number, one);

                scanner.close();
        }

}
