package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .name("000")
                .age(30)
                .email("lsg05h@naver.com")
                .build();
    }

}
