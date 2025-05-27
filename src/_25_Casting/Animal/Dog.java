package _25_Casting.Animal;

public class Dog extends Animal{

    @Override
    public void speak() { // 수정 후 override
        System.out.println("멍멍");
    }

    public void wagTail() {
        System.out.println("꼬리를 흔든다.");
    }
}
