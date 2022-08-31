package basic.lambda;

import java.util.function.Function;

/**
 * @author yy
 * @data 2022/8/30 22:58
 */
public class DataStructure {


    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public EvenIterator getEvent() {
        return new EvenIterator();
    }

    public int size() {
        return SIZE;
    }

    public int get(int index) {
        return arrayOfInts[index];
    }

    public static void main(String s[]) {

        /**
         * 题目为
         * - a 定义一个方法名为print(DataStructureIterator iterator). 使用该类的实例调用此方法，
         *   要实现与方法printEven相同的功能。
         * - b 定义一个方法名为print(DataStructureIterator iterator),打印数组中arrayOfInts的奇数
         * - c 定义一个方法名为print(java.util.Function<Integer, Boolean> iterator),使用lambda表达式调用打印奇数、偶数
         * - d 定义两个方法ds.print(DataStructure::isEvenIndex); ds.print(DataStructure::isOddIndex); 打印奇数、偶数
         */
        DataStructure ds = new DataStructure();

        //a 因为我们这里要传入一个具体的实现类. 所以我们要再写个方法getEvent()获取一个实现类EvenIterator
        DataStructureIterator dataStructureIterator = ds.getEvent();
        ds.print(dataStructureIterator);
        //b 直接采用匿名类实现DataStructureIterator
        ds.print(new DataStructureIterator() {
            private int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return (nextIndex <= ds.size() - 1);
            }

            @Override
            public Integer next() {
                int retValue = ds.get(nextIndex);
                nextIndex += 2;
                return retValue;
            }
        });
        //c 采用函数式写法实现
        ds.print((x) -> {
            if (x % 2 == 0) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        });

        //d 采用双冒号写法实现
        ds.print(DataStructure::isOddIndex);
    }

    private static Boolean isOddIndex(Integer integer) {
        if (integer % 2 == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void print(Function<Integer, Boolean> iterator) {
        for (int i = 0; i < SIZE; i++) {
            if (iterator.apply(i)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}