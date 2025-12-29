package test;
class B{
    public B(){
        fun();
    }
    public void fun(){
        System.out.println("调用了B的构造方法");
    }
}
class D extends B{
    public int num=1;
    public void fun(){
        System.out.println("调用了D的构造"+num);
    }
}
public class Test {
    public static void main(String[] args) {
        D d=new D();
    }
}
