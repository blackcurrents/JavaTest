/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-23
 * Time: 上午2:20
 */
class Base {
    int a=10;
    int b=20;
}
class Derived extends Base{
    int a=30;
}
public class Method{
    public static void main(String[] args) {
        Derived d1=new Derived();
        System.out.println(d1.a+d1.b);
    }
}
//成员变量访问遵循就近原则，自己有优先自己的，如果没有则向父类中找。