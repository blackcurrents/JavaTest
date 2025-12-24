/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-22
 * Time: 下午4:27
 */
public class Student {
    public String name;
    public String gender;
    public int age;
    public static String classroom="101";

    // 静态成员定义（带初始化）
    private static int num = 10;
    static {
        System.out.println("静态代码块执行，num=" + num); // 输出：静态代码块执行，num=0（默认值）
        num = 20;
    }
    public static String getClassroom(){
        return classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Student.classroom);//直接通过类名访问
        Student s1=new Student();
        Student  s2=new Student();
        Student s3=new Student();
        System.out.println(s1.classroom );//也可通过对象访问
        System.out.println(Student.getClassroom());//直接通过类名访问
        System.out.println(s1);
    }
}
