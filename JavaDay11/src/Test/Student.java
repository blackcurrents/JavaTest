package Test;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if(this.score>o.score){
            return 1;
        }else if(this.score<o.score){
            return -1;
        }else{
            return 0;
        }
    }

}
class test{
    public static void main(String[] args) {
        Student[] students = {new Student("张三", 50), new Student("李四", 60), new Student("王五", 70), new Student("赵六", 80)};
        System.out.println(students[1].compareTo(students[2]));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
