lambda表达式-3 练习题

首先定义一个类 DataStructure

```
public class DataStructure {
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    public void printEven() { // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    //定义一个接口,继承Iterator
    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }
    // 内部类实现接口DataStructureIterator
    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }
        public Integer next() {
            Integer retValue = arrayOfInts[nextIndex];
            nextIndex += 2;
            return retValue;
        }
    }
}
```

题目为

- a 定义一个方法名为print(DataStructureIterator iterator). 使用该类的实例调用此方法，
  要实现与方法printEven相同的功能。
- b 定义一个方法print(DataStructureIterator iterator),打印数组中arrayOfInts的奇数
- c 定义一个方法print(java.util.Function<Integer, Boolean> iterator),使用lambda表达式调用打印奇数、偶数
- d 定义两个方法ds.print(DataStructure::isEvenIndex); ds.print(DataStructure::isOddIndex); 打印奇数、偶数

a 参考printEven()定义一个方法print(),入参为接口DataStructureIterator,

```
public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
```

因为我们这里要传入一个具体的实现类. 所以我们要再写个方法获取一个实现类EvenIterator

```
public EvenIterator getEvent() {
        return new EvenIterator();
    }
public static void main(String s[]) {
   DataStructureIterator dataStructureIterator = ds.getEvent();
   ds.print(dataStructureIterator);
   //0 2 4 6 8 10 12 14
}    
```

调用

```

```

b 定义一个方法print(DataStructureIterator iterator),打印数组中arrayOfInts的奇数

```
    public int size() {
        return SIZE;
    }

    public int get(int index) {
        return arrayOfInts[index];
    }
    public static void main(String s[]) {
        DataStructure ds = new DataStructure();

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
        //0 2 4 6 8 10 12 14 
    }
```

关于函数作为方法的入参时,我们写函数时就是要定义好这个函数的计算逻辑。

c 定义一个方法名为print(java.util.Function<Integer, Boolean> iterator),使用lambda表达式调用打印奇数、偶数

```
 public void print(Function<Integer, Boolean> iterator) {
        for (int i = 0; i < SIZE; i++) {
            if (iterator.apply(i)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }

    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        //c 采用函数式写法实现
        ds.print((x) -> {
            if (x % 2 == 0) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        });
    }
    //0 2 4 6 8 10 12 14 
```

d 定义两个方法ds.print(DataStructure::isEvenIndex); ds.print(DataStructure::isOddIndex); 打印奇数、偶数

```
  private static Boolean isOddIndex(Integer integer) {
        if (integer % 2 == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        //d 采用双冒号写法实现
        ds.print(DataStructure::isOddIndex);
        //0 2 4 6 8 10 12 14  
    }
```
