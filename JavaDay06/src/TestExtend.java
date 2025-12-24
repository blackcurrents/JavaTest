/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-23
 * Time: 上午2:02
 */
class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println(this.name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉");
    }
}

class Doge extends Animal {
    void bark() {
        System.out.println(this.name + "汪汪汪");
    }
}

class cat extends Animal {
    void mew() {
        System.out.println(this.name + "喵喵喵");
    }
}

public class TestExtend {
    public static void main(String[] args) {
        Doge dog = new Doge();
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.eat();
        dog.bark();
        dog.sleep();
    }
}