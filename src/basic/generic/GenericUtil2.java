package basic.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yy
 * @data 2022/8/14 11:48
 */
public class GenericUtil2<T extends Grandpa> {

    /**
     * 有限制通配符  在类上使用 <T extends Grandpa> 限定泛型只能为Grandpa的子类
     */

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
}
