package Test;

import java.security.Key;

interface IUSB {
    void openDevice();
    void closeDevice();
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
    public void click(){
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
    public void inPut(){
        System.out.println("键盘输入");
    }
}
public class Computer {
    void openComputer(){
        System.out.println("开启电脑");
    }
    void closeComputer(){
        System.out.println("关闭电脑");
    }
    void device(IUSB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard key=(Keyboard)usb;
            key.inPut();
        }
        usb.closeDevice();
    }
}
class Tset{
    public static void main(String[] args) {
        Computer com=new Computer();
        com.openComputer();
        com.device(new Mouse());
        com.device(new Keyboard());
        com.closeComputer();
    }
}