package demo2;

import demo1.Test;

public class Test1 extends Test {
    public int b;
    public int c;
    public void Func(){
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println(t.a);
    }
}
