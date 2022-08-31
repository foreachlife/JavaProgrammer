package basic.lambda;

/**
 * @author yy
 * @data 2022/8/29 23:50
 */
public class Test {


    private static int[] array;

    private static int size = 14;

    Test() {
        array = new int[size];
    }

    void printArray(PrintSomething something) {
        for (int i = 0; i < size; i++) {
            if (something.check() == Boolean.TRUE) {
                System.out.println(i);
            }
        }
    }

    private static class InnerClass implements PrintSomething {

        private int length;

        @Override
        public Boolean check() {
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {



    }


}

@FunctionalInterface
interface PrintSomething<T> {
    /**
     * 输出
     */
    T check();
}
