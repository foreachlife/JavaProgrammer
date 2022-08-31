package basic.enuma;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * @author yy
 * @data 2022/8/14 0:08
 */
public enum Person {
    // 管理员
    ADMINISTRATOR("Admin", 1),
    // 用户
    USER("user", 2);

    private String name;
    private Integer code;

    Person(String name, Integer code) {
        this.name = name;
        this.code = code;
        Optional.ofNullable(name);

    }

    public Person getValue(Integer code) {
        for (Person person : values()) {
            if (person.getCode().equals(code)) {
                return person;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
