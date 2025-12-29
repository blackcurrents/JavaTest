package Test2;

import java.security.Key;

interface IUSB {
    void openDevice();
    void closeDevice();
    void doWork();
}
class Mouse implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }

    @Override
    public void doWork(){
        System.out.println("鼠标点击");
    }
}
class Keyboard implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }

    @Override
    public void doWork() {
        System.out.println("键盘输入");
    }
}
public class Computer1 {
    void openComputer(){
        System.out.println("开启电脑");
    }
    void closeComputer(){
        System.out.println("关闭电脑");
    }
    void device(IUSB usb){
        usb.openDevice();
        usb.doWork();
        usb.closeDevice();
    }
}
class Tset{
    public static void main(String[] args) {
        Computer1 com=new Computer1();
        com.openComputer();
        com.device(new Mouse());
        com.device(new Keyboard());
        com.closeComputer();
    }
}