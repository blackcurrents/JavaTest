import java.security.PublicKey;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-22
 * Time: 上午9:29
 */
public class Dog {
    public String name;
    public String color;
    public int age;
    public void bark(){
        System.out.println(name+"汪汪汪");
    }
    public void wag(){
        System.out.println(name+"摇尾巴");
    }

    public static void main(String[] args) {
        Dog dogh=new Dog();
        dogh.name="大黄";
        dogh.age=5;
        dogh.color="黄色";
        dogh.bark();
        dogh.wag();
        System.out.println("==============");
        Dog dogs=new Dog();
        dogs.name="二黄";
        dogs.age=6;
        dogs.color="黄色";
        dogs.bark();
        dogs.wag();
    }
}
