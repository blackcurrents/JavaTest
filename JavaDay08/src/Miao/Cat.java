package Miao;

public class Cat {
    public Cat(){
        System.out.println("构造方法1");
    }
}
class Dog extends Cat{
    public Dog(){
        System.out.println("构造方法2");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
    }
}

