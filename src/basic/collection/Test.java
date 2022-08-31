package basic.collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author yy
 * @data 2022/8/13 21:03
 */
public class Test {

    /**
     * 集合
     *
     * @param args
     */
    public static void main(String[] args) {


        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.addIfAbsent("abc");
    }
}
