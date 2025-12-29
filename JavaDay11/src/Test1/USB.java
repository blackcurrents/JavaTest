package Test1;

public interface USB {
    int a=111;
    void tets();
}
class Test implements USB{
    @Override
    public void tets() {

    }

    public static void main(String[] args) {
        System.out.println(USB.a);
    }
//    USB.a=10;
}
