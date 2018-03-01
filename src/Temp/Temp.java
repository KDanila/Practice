package Temp;

import java.util.LinkedList;
import java.util.ListIterator;

public class Temp {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Task t1 = new Task("1", 9);
        Task t2 = new Task("2", 3);
        Task t3 = new Task("3", 2);
        Task t4 = new Task("4", 1);
        Task t5 = new Task("5", 5);
    }
}

class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}


class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int numOfInput;
        boolean flag = false;
        int priority = task.getPriority();
        ListIterator<Task> lit = tasks.listIterator();
        if (tasks.size() == 0) {
            tasks.add(task);
        } else {
            while (lit.hasNext()) {
                Task t = lit.next();
                if (t.getPriority() <= priority) {
                    numOfInput = lit.previousIndex();
                    flag = false;
                }
            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}


