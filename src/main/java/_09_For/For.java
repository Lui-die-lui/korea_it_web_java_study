package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 = for
        // for ( 선언 ; 조건 ; 증감 ) {
        // 반복될 코드
        // }

//        for (int i = 0 ; i < 10 ; i++ ) {
//            System.out.println("안녕" + i );
//        }
//        for (int i = 0; i < 50 ; i++) {
//            System.out.println("ㅎㅇ");
//        }

         // 짝수만 출력
        for (int i = 0 ; i <= 10 ; i += 2 ) {
            System.out.println(i);
        }

        for (int i = 2; i <= 10 ; i++) {
            if (i % 2 == 0) { // i를 2로 나눴을때 값이 0
                System.out.println(i);
            }
        }

        // 10 ~ 1 까지 거꾸로 출력
        for (int i = 10 ; i > 0  ; i--) {
            System.out.println(i);
        }
        
        // 문제 -> 1 ~ 100까지 다 더한 값을 출력
        int sum = 0; // sum = + 더하기 값
        for (int i = 1 ; i <= 100 ; i++) { //  1부터 ; 100보다 작거나 같은 값 ; +1 )
            sum += i; // 0 값에 계속 더해짐 0 + 1 , 1 + 2 , 3 + 3 ... 더해지는 값이 100이 될 때 까지 sum = sum + i; 를 줄인 표기
        }
        System.out.println(sum); // 더해진 sum 값 출력





    }
}
