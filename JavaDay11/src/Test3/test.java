package Test3;

class Student implements Cloneable{
    public String name;
    public int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class test{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student=new Student(7,"张三");
        Student student1=(Student)student.clone();
        System.out.println(student);
        System.out.println(student1);
    }
}
