package jiekou;

public interface Ijiekou {
    public abstract void method();
    abstract void method1();
    public void method2();
    void method3();
}
abstract class Test implements Ijiekou{
    @Override
    public void method() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
class Test1 extends Test{
    @Override
    public void method() {
        super.method();
    }

    @Override
    public void method3() {

    }
}