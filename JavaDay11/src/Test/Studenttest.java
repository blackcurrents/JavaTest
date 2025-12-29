package Test;

import java.util.Comparator;

class Student1 {
     String name;
     int score;

    public Student1(String name, int score) {
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
}
class ScoreComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.score-o2.score;
    }
}
class NameComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Studenttest{
    public static void main(String[] args) {
        Student1 stu1=new Student1("张三",80);
        Student1 stu2=new Student1("李四",90);
        ScoreComparator scoreComparator=new ScoreComparator();
        System.out.println( scoreComparator.compare(stu1,stu2));
    }
}