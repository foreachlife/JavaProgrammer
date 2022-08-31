package basic.enuma.enumMap;

/**
 * @author yy
 * @data 2022/8/14 1:11
 */
public class Plant {


    public enum LifeCycle{ ANNUAL,PERENNIAL,BIENNIAL}

    final String name;
    final LifeCycle lifecycle;

    public Plant(String name, LifeCycle lifecycle) {
        this.name = name;
        this.lifecycle = lifecycle;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", lifecycle=" + lifecycle +
                '}';
    }

    public String getName() {
        return name;
    }

    public LifeCycle getLifecycle() {
        return lifecycle;
    }
}
