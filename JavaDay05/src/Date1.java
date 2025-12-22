import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-20
 * Time: 下午3:52
 */
public class Date1 {
    public int year;
    public int month;
    public int day;
    public Date1(int year,int month,int day ){
        this.year=year;
        this.month=month;
        this.day=day;
        System.out.println("Date1(int,int,int)被调用了");
    }
    public Date1(){
        this(1999,1,1);
        System.out.println("也被调用");
    }
    public void datePrint(){
        System.out.println(year+"/"+month+"/"+day);
    }

    public static void main(String[] args) {
      Date1 d=new Date1(2000,1,1);
      d.datePrint();
      Date1 d2=new Date1();
      d2.datePrint();
    }
}

