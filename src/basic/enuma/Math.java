package basic.enuma;

/**
 * @author yy
 * @data 2022/8/14 0:28
 */
public enum Math implements Operator {

    /**
     * 加法
     */
    PLUS {
        public double apply(double x, double y) {
            return x + y;
        }
    };

//    public abstract double apply(double x, double y);

    @Override
    public String toString() {

        ordinal();
        return super.toString();
    }
}
