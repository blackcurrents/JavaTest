package clone;

public class Test implements Cloneable {
    private String add;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 class test1{
    public static void main(String[] args)throws CloneNotSupportedException {
    Test test  =new Test();
    Test test1=(Test)test.clone();
        System.out.println(test==test1);
    }
}
