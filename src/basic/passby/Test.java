package basic.passby;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(22);
        user.setName("zhangsan");
        changeUser(user);
        System.out.println(user);
    }

    private static void changeUser(User user) {
//            user=new User();
        user.setName("lisi");
        user.setAge(18);
    }


    public static void changeStr(String str) {
        str = "def";
    }

    ;
}
