package Wuwu;

public class Person {
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person的构造方法");
    }
    {
        System.out.println("Person的实例代码块");
    }
    static {
        System.out.println("Person的静态代码块");
    }
}
