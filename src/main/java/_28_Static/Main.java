package _28_Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(KoreaItStudent.static_curriculum); // 클래스 수준에서 바로 접근 가능 - 객체 생성x
        System.out.println(KoreaItStudent.getstatic());
//        KoreaItStudent koreaItStudent = new KoreaItStudent("lsg",)??


        // 클래스 수준(인스터스 수준이 아니라)에서 변수를 정의하거나 메소드를 선언할 때 사용
        // static으로 선언된 변수다 메소드는 클래스의 인스턴스에 속하지 않음
        // 클래스 자체에 속하게 됨
        // 이는 인스턴스를 생성하지 않고 접근이 가능하다
        // 이런 점에서 인스턴스 변수나 메소드 차이가 있다.
        // 특징
        // 클래스 수준의 변수 및 메소드 - static 변수와 메소드는 클래스 로드 시 메모리에 할당
        // 공유 - 모든 인스턴스가 동일한 static 변수에 접근, 따라서 데이터를 공유하거나 상태를 저장핼때 유용

    }
}
