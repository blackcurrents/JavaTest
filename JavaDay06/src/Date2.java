/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-22
 * Time: 下午4:13
 */
import java.util.Date;//导入包名
import java.util.*;
public class Date2 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        java.util.Date date1=new java.util.Date();//很麻烦
        System.out.println(date.getTime());
    }
}
