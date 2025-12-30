package string1;

public class String1 {
    static class Student {
        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        String str="Hello";
        String str1="HELLO";
        String str3="Hello1";
        String str4="你好";
        System.out.println(str.equals(str1));
        System.out.println(str.compareTo(str3));
        System.out.println(str.compareTo(str4));
        System.out.println(str.compareToIgnoreCase(str1));
        String s="aaabbbbcccdddeeeffff";
        System.out.println(s.charAt(3));//3是数组下标
        System.out.println(s.indexOf('c'));
        System.out.println(s.indexOf('c',9));
        System.out.println(s.indexOf("cdd"));
        System.out.println(s.indexOf("bcc",6));
        System.out.println(s.lastIndexOf('d'));
        String s1=String.valueOf(new Student("张三",18));
        System.out.println(s1);

    }
}
