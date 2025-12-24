
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import jdk.internal.dynalink.beans.StaticClass;

public class Animal {
    protected String name;
    protected int age;
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
}

