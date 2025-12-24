package Miao;

class Base {
    public void method1(){
        System.out.println("调用了method1");
    }
    public void method2(int a){
        System.out.println(a+"调用了method2");
    }
}
class Base3 extends Base{
    public void method2(){
        System.out.println("调用了method3");
    }
    public void method1(){
        System.out.println("调用了method4");
        super.method1();
    }

    public static void main(String[] args) {
        Base3 b=new Base3();
        b.method1();
        b.method2(3);
    }
}

