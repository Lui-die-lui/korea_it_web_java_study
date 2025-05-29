package _22_Interitance;

// Animal 상속
// 부모 생성자 호출해서 객체 생성과 동시에 속성값 넣을 수 있도록 생성자 만들고
// getter setter
// getAnimalName -> 제 이름은 ___ 입니다.
// getAnimalAge -> 올해 제 나이는 __ 이고, 내년에는 __ 입니다.
// move -> 사람이 두 발로 걷습니다.
// read(String bookName) -> ___ 이 책이름 을 읽습니다.

// Main에서 객체생성 후 전부 써보기

public class Human extends Animal {
    public Human(String animaName, int animalAge) {
        super(animaName, animalAge);
    }


    @Override
    public  String getAnimalName() {
        return "제 이름은 " + super.getAnimalName() + "입니다";
    } //super 명시 없을 시, 스텍오버플로우 오류 남

    public  int getAnimalAge() {
        System.out.println("제 나이는 " + super.getAnimalAge() + "살 이고, 내년에는 " + (super.getAnimalAge()+1) + "입니다.");
        return super.getAnimalAge();
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookName) {
        System.out.println(super.getAnimalName() + "이 " + bookName +"을 읽습니다.");
    }
}

//  private String bookName;
//
//    public  Human() {
//        System.out.println("속성이 정해지지 않은 사람 객채 생성");
//    }
//
//    public Human(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public Human(String animalName, int animalAge, String bookName) {
//        super(animalName, animalAge);
//        this.bookName = bookName;
//    }
//
//    //getter
//
//    public String getBookName() {
//        return bookName;
//    }
//
//
//    //setter
//
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    // 상속 관계에서 부모가 가지고있는 메소드를 자식에서 재정의
//    // 부모로붕터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는것
//    // 부모 클래스의 메소들르 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의
//    @Override
//    public void move() {
//        super.move(); // 부모의 메소드를 불러옴
//        System.out.println("사람이 두 발로 걷습니다.");
//    }
//
//
//
//    public Human(String animalName, int animalAge) {
//        System.out.println();
//    }
//
//    public void read() {
//        System.out.println(getAnimalName() + "이(가)" + bookName + "을 읽습니다." );
//        // 왜 super를 쓰지 않는가?
//        // 상속과 메소드에서는 탐색 순서
//        // 자식 클래스에서 해당 메소드가 없다면 부모클래스에서 찾는다
//    }
//}
