package Sem4Homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CreateTask {
    private static CreateTask unit;
    Task task;
    int count = 1;

    public static CreateTask getUnit() {
        if (unit == null)
            unit = new CreateTask();
        unit.init();
        return unit;
    }

    private CreateTask() {
    }

    private void init() {
        task = new Task();

        task.setId(count);
        task.setDescription("");
        task.setCreator("");
    }

    public CreateTask setId(int id) {
        task.setId(id);
        return this;
    }

    public CreateTask setDescription(String description) {
        task.setDescription(description);
        return this;
    }

    public CreateTask setCreator(String creator) {
        task.setCreator(creator);
        return this;
    }

    public CreateTask setDate(String date) {
        task.setDate(date);
        return this;
    }

    public CreateTask setTime(String time) {
        task.setTime(time);
        return this;
    }

    public CreateTask setDedlain(LocalDate dedlain) {
        task.setDedlain(dedlain);
        return this;
    }

    public CreateTask setPriority(int priority) {
        task.setPriority(priority);
        return this;
    }

    public Task create() {
        return task;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
