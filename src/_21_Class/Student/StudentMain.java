package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student stu = new Student("이슬기", 30, "lsg05h@naver.com","00시00구");
        // this로 넣어줬기때문에 바로 기입 가능 / Main에 생성자

        stu.setName("Lui");
        //setter 때문에 값이 변경 가능


//        stu.name = "이00";
//        stu.age = 30;
//        stu.email = "lsg05h@naver.com";
//        stu.address = "000시000동000호";
        System.out.println(stu.getEmail()); // getter 때문에 찾기(출력) 가능
        System.out.println(stu.getAge());// private도 값이 들어감

        stu.showInfo();










    }
}
