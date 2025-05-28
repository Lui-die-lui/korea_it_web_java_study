package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        // Power 인터페이스
        // on(), off()
        //Tv, Computer, Speaker, LEDLight, Mouse, SmartPhone
        //재정의하고 고유 메소드1개

//        Power[] powers = {new Computer(), new Mouse(), new Tv()};
//        CentralControl centralControl = new CentralControl(powers);
        CentralControl centralControl = new CentralControl(new Power[5]); // 비었음

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new Tv());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new LEDLight());

        centralControl.powerOn();
        centralControl.powerOff();




    }
}
