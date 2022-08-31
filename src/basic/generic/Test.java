package basic.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yy
 * @data 2022/8/13 21:01
 */
public class Test {

    /**
     * 泛型
     * <p>
     * 1
     * <? extends T>：上边界通配符，即?是继承自T的任意子类型，遵守只读不写
     * <? super T>：下边界通配符，即?是T的任意父类型，遵守只写不读
     * 2
     * 有限制边界符:
     * 上边界通配符 与 有限制边界符 没有任何关系 不需要遵循上边界通配符的原则 也没有super的写法
     * <T extends Grandpa> != <? extends Grandpa>
     */

    public static void main(String[] args) {

        //上通配符边界 所有类必须是Number的子类
        List<? extends Number> list = new ArrayList<>();
        list = new ArrayList<Integer>();
        list = new ArrayList<Long>();
        //list = new ArrayList<Object>();

        //下通配符边界 所有类必须是Number的父类
        List<? super Integer> list1 = new ArrayList<>();
        list1 = new ArrayList<Object>();
        list1 = new ArrayList<Number>();

        //无通配符 任意类型
        List<?> list2 = new ArrayList<>();

        //
        GenericUtil genericUtil = new GenericUtil();
        genericUtil.copyof(list);

        //将一个集合添加到另外一个集合中,采用上边界通配符 与 下边界通配符
        List<Son> sons = new ArrayList<>();
        List<Father> fathers = new ArrayList<>();
        List<Grandpa> grandpas = new ArrayList<>();
        genericUtil.copyOfThree(fathers, sons);
        genericUtil.copyOfThree(grandpas, sons);

        //有限边界通配符
        GenericUtil2<Grandpa> genericUtil2 = new GenericUtil2();
        genericUtil2.copyof(fathers);
    }
}
