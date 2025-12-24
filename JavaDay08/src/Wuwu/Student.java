package Wuwu;

public class Student extends Person {
    public String name;
    public int age;
    public Student(String name,int age){
        super(name,age);
        this.name=name;
        this.age=age;
        System.out.println("Student的构造方法");
    }
    {
        System.out.println("Student的实例代码块");
    }
    static {
        System.out.println("Studen的静态代码块");
    }

}
