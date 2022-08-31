package effectivejava.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack {


    private int size;
    private Object[] elements;
    private static final int DEFAULT_SIZE = 16;

    Stack() {
        elements = new Object[DEFAULT_SIZE];
    }


    public Object pop() {
        return elements[--size];
    }

    public void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


    public void put(Object obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.put("aa");
        for (int i = 0; i < 1000; i++) {
        }
        for (int i = 0; i < 1000; i++) {
        }
        stack.pop();
        stack.put("bb");
        System.out.println(stack.toString());

    }
}
