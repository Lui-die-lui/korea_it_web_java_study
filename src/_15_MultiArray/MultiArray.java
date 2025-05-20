package _15_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열)

        // 영화관 좌석
        //A1 ~ A5
        //B1 ~ B5
        //C1 ~ C5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"}; //alt 누른채로 drag
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //3 X 5
        // [[],[],[],[]]
        String[][] seats = new  String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
//                {0, 1, 2, 3, 4}
        };
        //B3출력
        System.out.println(seats[1][2]);
        //C4출력
        System.out.println(seats[2][3]);

        //첫줄에 3칸, 두번째줄에 4칸, 세번째줄에 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"}, //빈 공간이 아니라 공간 자체가 없음
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2 [1][1]);

    }
}
