/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-21
 * Time: 上午10:33
 */
public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        //无法使用person.name进行访问了，
        person.setName("张三");
        System.out.println(person.getName());
    }
}
