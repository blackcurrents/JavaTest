import java.security.PublicKey;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-22
 * Time: 上午11:11
 */
public class Date1 {
    public int year;
    public int month;
    public int day;
    public Date1(){
        this(1999,1,1);//只能在第一行
        System.out.println("调用了1构造方法");
        this.dayPrint();
    }
    public Date1(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
        System.out.println("调用了2构造方法");
    }

    public void dayPrint(){
        System.out.println(this.year+"/"+this.month+"/"+this.day);
    }
    public static void main(String[] args) {
        Date1 d1=new Date1();
        Date1 d2=new Date1(2000,1,1);
    }
}
