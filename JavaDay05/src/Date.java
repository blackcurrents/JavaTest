/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-20
 * Time: 下午12:18
 */
public class Date {
    public int year;
    public int month;
    public int day;

    public void setDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void dayPrint() {
        System.out.println(this.year + "/" + this.month + "/" + this.day);
    }

    public static void main(String[] args) {
        Date date=new Date();
        date.setDay(2000,1,1 );
        date.dayPrint();
    }
}