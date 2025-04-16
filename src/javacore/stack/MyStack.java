package javacore.stack;

import java.util.ArrayList;

public class MyStack<T> {
    ArrayList<T> arrayList = new ArrayList<>();

    public boolean push(T data) {
        return arrayList.add(data);
    }

    public T pop () {
        return arrayList.remove(arrayList.size()-1);
    }

    public T peek() {
        if (this.size() > 0) {

            return arrayList.get(arrayList.size()-1);
        }
        return null;
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public int size() {
        return arrayList.size();
    }
}
