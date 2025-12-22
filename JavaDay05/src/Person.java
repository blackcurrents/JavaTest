/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-21
 * Time: 上午10:23
 */
public class Person {
    private String name;
    //private 修饰成员变量 现在它只能在类内调用了
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Sleep() {

    }
}
