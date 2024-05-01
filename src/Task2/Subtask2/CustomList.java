package Task2.Subtask2;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    private final List<T> list;
    private final String name;

    public CustomList(ListEntity name) {
        this.name = name.toString();
        list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public void display() {
        System.out.println(name + "s: " + list);
    }
}
