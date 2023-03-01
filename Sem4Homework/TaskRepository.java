package Sem4Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskRepository extends Task {
    public static Scanner input = new Scanner(System.in);
    List<Task> tasks = new ArrayList<>();
    Writable writable;

    public static Task addTask() {
        System.out.println("Новая задача в планнере. Введите ID: ");
        int id = input.nextInt();
        System.out.println("Введите описание: ");
        String des = input.next();
        System.out.println("Введите фамилию автора: ");
        String name = input.next();
        System.out.println("Введите дедлайн");
        String date = input.next();
        String[] arr = date.split(",");
        LocalDate ded = LocalDate.of(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        System.out.println("Установите приоритет: 1 - низкий, 2 - средний, 3 - высокий");
        String prior = input.next();
        int priority = 0;
        if (prior.equals("1") | prior.equals("2") | prior.equals("3")) {
            priority = Integer.parseInt(prior);
        } else {
            System.out.println("Ошибка ввода, приоритет не установлен");
        }
        System.out.println("Задача создана");

        return CreateTask.getUnit()
                .setId(id)
                .setDescription(des)
                .setCreator(name)
                .setDate(date)
                .setTime(date)
                .setDedlain(ded)
                .setPriority(priority)
                .create();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    // public void print() {
    // for (Task task : tasks) {
    // System.out.printf(
    // "№ %d описание: %s, автор: %s,время добавления: %s, дата добавления: %s,
    // дедлайн: %s, важность: %s\n",
    // task.getId(), task.getDescription(),
    // task.getCreator(), task.getTime(), task.getDate(), task.getDedlain(),
    // task.getPriority());
    // }
    // }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public void sortByPrior() {
        Comparator<Task> dedlain = new TaskComporator();
        tasks.sort(dedlain);
    }

    public void print() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void setWritable(Writable writable) {
        this.writable = writable;
    }

    public void save() {
        writable.save(this);
    }

    public void saveOne() {
        for (Task task : tasks) {
            writable.save(task + "\n");
        }
    }
}
