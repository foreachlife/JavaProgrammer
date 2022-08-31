package basic.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yy
 * @data 2022/8/14 11:48
 */
public class GenericUtil<T> {

    /**
     *  在类上声明泛型T
     */

    /**
     * 可以用作属性类型
     */
    private T objType;


    public T getObjType() {
        return objType;
    }

    /**
     * @param list
     * @return
     */
    public List<T> copyof(Collection<? extends T> list) {

        List<T> collections = new ArrayList();
        for (T t : list) {
            collections.add(t);
        }
        return collections;
    }

    /**
     * @param list
     * @return
     */
//    public List<T> copyOfTwo(Collection<? super T> list) {
//        List<T> collections = new ArrayList();
//        //下边界通配符 读的类型为T的父类,无法确定具体的泛型,不符合只写不读规则,所以报错
//        for (T t : list) {
//            collections.add(t);
//        }
//        return collections;
//    }

    /**
     * @param target 复制目标集合
     * @param source 复制来源集合
     * @return
     */
    public Collection<? super T> copyOfThree(Collection<? super T> target, Collection<? extends T> source) {

        for (T t : source) {
            target.add(t);
        }
        return target;
    }
}
