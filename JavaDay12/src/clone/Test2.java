package clone;
class Money implements Cloneable{
    public double m=19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test2 implements Cloneable {
    Money money=new Money();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Test2 clone=(Test2)super.clone();
        clone.money=(Money)this.money.clone();
        return clone;
    }
}
class Test3{
    public static void main(String[] args)throws CloneNotSupportedException {
        Test2 test2=new Test2();
        Test2 test3=(Test2)test2.clone();
        System.out.println(test2.money.m);
        System.out.println(test3.money.m);
        test2.money.m=200;
        System.out.println(test2.money.m);
        System.out.println(test3.money.m);
    }
}
