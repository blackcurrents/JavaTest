package equal;

public class Test1 {
    private String name;
    private int age;

    public Test1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Test1)){
            return false;
        }
        Test1 test1=(Test1)obj;
        return this.name.equals(test1.name)&&this.age==test1.age;
    }
}

class Tese2{

    public static void main(String[] args) {
        Test1 test1=new Test1("李四",18);
        Test1 test2=new Test1("李四",18);
        System.out.println(test1.equals(test2));
    }
}
