package Test;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface Iswim {
    void swim();
}

interface Irun {
    void run();
}

interface Ifly {
    void fly();
}

class Cat extends Animal implements Irun {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "在跑步");
    }
}

class Frog extends Animal implements Irun, Iswim {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "在游泳");
    }

    @Override
    public void run() {
        System.out.println(this.name + "在跑步");
    }
}
class Robot implements Irun{
    public Robot(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void run() {
        System.out.println(name +"在跑步");
    }
}

class AnimalTest{
    public static void walk(Irun irun){
        irun.run();
    }

    public static void main(String[] args) {
        Animal animal=new Cat("小猫");
        walk((Irun)animal);
        Animal animal1=new Frog("青蛙");
        walk((Irun) animal1);
        Robot robot=new Robot("机器人");
        walk(robot);
    }
}