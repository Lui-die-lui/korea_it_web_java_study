//package _29_Builder.Computer;
//
//
//import lombok.Builder;
//
//@Builder
//public class Computer {
//
//    //필수
//    public final String cpu;
//    private final int ram;
//
//    //선택
//    private int storage;
//    private boolean hasWifi;
//    private boolean hasBluetooth;
//
//    private Computer(Builder builder) {
//        this.cpu = builder.cpu;
//        this.ram = builder.ram;
//        this.storage = builder.storage;
//        this.hasWifi = builder.hasWifi;
//        this.hasBluetooth = builder.hasBluetooth;
//
//    }
//
//    public Builder(String cpu, int ram) {
//        this.cpu = cpu;
//        this.ram = ram;
//    }
//
//    public Builder storage(int storage) {
//        this.storage = storage;
//        return this;
//    }
//
//    public Builder hasWifi(boolean hasWifi) {
//        this.hasWifi = hasWifi;
//        return this;
//    }
//
//    public Builder storage(boolean hasBluetooth) {
//        this.hasBluetooth = hasBluetooth;
//        return this;
//    }
//
////ㅅㅂ...
//
//    public Computer build() {
//        return new Computer(this); // builder 내 정보를 Member 변수 내로 넣어줌
//
//    }
//
//
//    private Computer() {
//
//    }
//
//    public void spec() {
//        System.out.println("CPU : " + cpu);
//        System.out.println("RAM : " + ram);
//        System.out.println("Storage : " + storage);
//        System.out.println("WIFI : " + hasWifi);
//        System.out.println("CPU : " + cpu);
//    }
//}
