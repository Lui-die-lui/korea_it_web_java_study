package _10_While;

public class DoWhile {
    public static void main(String[] args) {
        //반복문 - do whine
        //일단 한번 실행 후 조건 검사
        // -> 조건에 상관없이
        // do {
        // 반복할 코드
        // } while (조건);

        //1~5까지 출력 최초에 한번은 실행한다
        int i = 1;
        i=10; // 10 나옴 아래 문장 값 나오지 x

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

    }
}
