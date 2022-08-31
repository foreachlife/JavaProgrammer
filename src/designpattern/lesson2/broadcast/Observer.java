package designpattern.lesson2.broadcast;

/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public interface Observer {


    /**
     *  观测数据更新
     */
    public void  update(String message);
}
