package shape;

class Shape {
    public void draw(){
        System.out.println("hua tuxing");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("♦");
    }
}
class Cycle extends Shape{
    public void draw(){
        System.out.println("圆");
    }
}
class Trangle extends Shape{
    public void draw(){
        System.out.println("△");
    }
}
public class Draw{
    public static void draw(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape[] shapes={new Cycle(),new Rect(),new Trangle()};
        for(Shape shape:shapes){
            draw(shape);
        }
    }
}
