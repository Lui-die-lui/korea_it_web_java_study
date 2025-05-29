package _10_While;

public class While { // 잘 모르겠음 
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 참일 경우 계속 반복
        // while (조건) { - 조건이 참일때 계속 반복
        //      반복할 코드
        // }

        // for문 - 횟수 중심
        // while문 - 조건 중심

        //1~5까지 출력
        int num = 1;
        while(num <= 5) {
            System.out.println(num);
            num++; // 조건을 변화시키기 위한 증가(값을 멈추기 위한 필수)  출력된 값 +1
        }
         // 10에서 거꾸로 1까지
        num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--; //출력된 값 -1
        }

//        //짝수만 출력 (1~10)
            num = 1;
            while (num <= 10) {
                if (num % 2 == 0){ //나누기 2를 하고 나머지 0 = 짝수
                    System.out.println(num);
                    }
                num ++;
            }

            // 1~100까지 누적합
            int sum = 0;
            num = 1;
            while (num <= 100) {
                sum += num;
                num++;
            }
            System.out.println("합계는" + sum);
        }

}

