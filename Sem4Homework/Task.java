package Sem4Homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String date;
    private String time;
    private LocalDate dedlain;
    private String creator;

    private String description;
    private int priority;
    // private static int count;

    // static {
    // count = 0;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        return date;
    }

    public String setDate(String localDate) {
        return localDate;
    }

    public String getTime() {
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        return time;
    }

    public String setTime(String time) {
        return time;
    }

    public LocalDate getDedlain() {
        return dedlain;
    }

    public void setDedlain(LocalDate dedlain) {
        this.dedlain = dedlain;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return switch (priority) {
            case 1 -> "приоритет низкий";
            case 2 -> "приоритет средний";
            case 3 -> "приоритет высокий";
            default -> "приоритет не установлен";
        };
    }

    public int getPriorCode() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "№" + getId() + '.' + "описание: " + getDescription() +
                ", автор: " + getCreator() +
                ", время добавления: " + getTime() +
                ", дата добавления: " + getDate() +
                ", дедлайн: " + getDedlain() +
                ", важность: " + getPriority();
    }

}
