package shade1;

public abstract class Shape {
    public abstract void draw();
    abstract void calArea();
    public double  getArea(){
        return area;
    }
    protected double area;
}
class Rect extends Shape{
    private double length;
    private double width;

    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void calArea() {
    area=width*length;
    }

    @Override
    public void draw() {
        System.out.println("这是一个长"+length+"宽"+width+"的矩形");
    }
}
abstract class Cycle extends Shape{
    @Override
    public void draw() {

    }
}
class Tset extends Cycle{
    @Override
    void calArea() {

    }
}