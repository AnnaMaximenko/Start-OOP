package Sem4Homework;

import java.util.Comparator;

public class TaskComporator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o2.getPriorCode() - o1.getPriorCode();
    }

}
