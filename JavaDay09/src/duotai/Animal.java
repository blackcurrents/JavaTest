package duotai;

class Animal {
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println(name+"吃饭");
    }
}

class Cat extends Animal {
    public Cat(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"吃鱼");
    }
}

class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"啃骨头");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AnimalTest {
    public static void eat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {
    Cat cat=new Cat("猫",2);
    Dog dog=new Dog("狗",1);
    System.out.println(dog);
    eat(cat);
    eat(dog);
    }
}

