package _21_Class.Student;

public class Student {

        private String name;
        private int age;
        private String email;
        private String address;


        //private일때 값을 넣는 방법

        //1.생성자
        Student(String name, int age, String email, String address) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.address = address;
        }


        //alt + insert 바로 생성 가능


        //2.setter - 메소드를 통해서 클래스로 접근 / 수정/값을 넣는 것, 각각이 하나의 메소드

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //가져와서 값을 보기 getter

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    // 접근 제어자
    // public - 어디서든 접근 가능 = 많이씀*
    // default - 같은 패키지에서만 접근 (명시를 따로 하지않으면 default)
    // protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
    // private - 해당 클래스 내부에서만 접근 가능 // 정보 은닉 = 가장 많이씀*





        // 클래스의 메소드 => 기능
        public void showInfo() {
            System.out.println("이름 : " + name );

            System.out.println(" 나이 : " + age );

            System.out.println(" 이메일 : " + email );

             System.out.println(" 주소 : " + address );
        }



}
