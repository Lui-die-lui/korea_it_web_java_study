package _22_Interitance;

/*
 super는 부모에게 접근할 수 있는 키워드
자식 클래스에서 "부모님 기능 또는 속성" 접근할때 쓰는 것
super 키워드의 두가지 사용 방식
1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다.
            매개변수 생성자라면 () 매개변수가 포함되는 것
2. super.method() 또는 super.필드명(멤버변수) : 부모클래스의 메소드를 불러올 수 있다.
* */

public class Tiger extends Animal {
    //Animal에게 상속받아 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    //Animal은 부모클래스(슈퍼클래스), Tiger는 자식 클래서(서브클래스)
    // 이때 부모 클래스에는 없는 속성을 따로 추가할 수 있다.
    private  boolean isStriped;

    public  Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객채 생성");
    }

    public Tiger(boolean isStriped) {
        this.isStriped = isStriped;
    }

    public Tiger(String animalName, int animalAge, boolean isStriped) {
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성"); // all
    }

    //getter

    public boolean isStriped() { // boolean 값이라 is
        return isStriped;
    }

    //setter

    public void setStriped(boolean striped) {
        isStriped = striped;
    }


    // 상속 관계에서 부모가 가지고있는 메소드를 자식에서 재정의
    // 부모로붕터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는것
    // 부모 클래스의 메소들르 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의
    @Override
    public void move() {
        super.move(); // 부모의 메소드를 불러옴
        System.out.println(getAnimalName() + "가 움직입니다.");
    }

    public void hunt() {
        System.out.println(getAnimalName() + "가 사냥을 합니다.");
        // 왜 super를 쓰지 않는가?
        // 상속과 메소드에서는 탐색 순서
        // 자식 클래스에서 해당 메소드가 없다면 부모클래스에서 찾는다
    }


}
