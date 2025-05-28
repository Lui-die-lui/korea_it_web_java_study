package _26_Objects;

public class Main {
    public static void main(String[] args) {
        // 모든 클래스는 Object클래스를 상속받고 있다. - 중요!

        Teacher teacher1 = new Teacher("이동윤","코리아IT");
        Teacher teacher2 = new Teacher("이동윤", "코리아IT");

        System.out.println(teacher1); // toString 생략 되어있음
        System.out.println(teacher1.equals(teacher2)); // 1,2 값을 동일하게 입력해도 Override 안하면 false / hash,equals Override 할 경우, true
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());//equals가 성립이 되려면 hashcode가 같아야함

    }
}
