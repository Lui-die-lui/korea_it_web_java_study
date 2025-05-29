package _27_Bean;

public class Main {
    public static void main(String[] args) {

    // UserEntity
    // UserId, username, age, email -> private
    // 기본생성자 하나 만들기
    // getter / setter

    // toString 오버라이드해서 정보 모두 출력되도록

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("000");
        userEntity.setEmail("lsg05h@naver.com");
        userEntity.setAge(00);

        System.out.println(userEntity);

//        public UserEntity() {
//
//       }

        UserEntityLombok userEntityLombok = new UserEntityLombok();











    }
}
