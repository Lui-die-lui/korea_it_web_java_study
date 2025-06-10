package _35_Lambda;

// 1. 스캐너 객체 선언, 입력 받아서 저장할 Map 선언(String, Integer)
// 2. 상품을 입력할 갯수를 count로 입력받기 (nextInt)
// 3. count만큼 반복해서 상품명(키)과 가격(값)으로 입력받고 map에 추가

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LambdaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너
        Map<String, Integer> productMap = new HashMap<>(); // 맵

        // 입력할 상품 개수 받기

        System.out.print("입력할 상품의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거 (nextInt 후 nextLine 사용 시 필수)


        // count만큼 상품명과 가격 입력받아 Map에 저장

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 상품명: ");
            String name = scanner.nextLine();

            System.out.print((i + 1) + "번째 가격: ");
            int price = Integer.parseInt(scanner.nextLine());
//
//            System.out.print((i + 1) + "번째 가격: ");
//            int price = scanner.nextInt();
//            scanner.nextLine();


            productMap.put(name, price);
        }


//        String productName;
//        Integer productPrice;
//
//        System.out.print("상품명 : ");
//        String name = scanner.nextLine().trim();
//
//        System.out.print("가격 : ");
//        int price = Integer.parseInt(scanner.nextLine());
//          *parseInt nextInt 차이?

//        productMap.put(name, price);

        System.out.println("[상품목록]");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + "원");
        }

        System.out.println("[상품 목록]");
        productMap.forEach((name,price) ->
                System.out.println("상품명 : " + name + ", 가격 : " + price)); // 맵에서 forEach 람다 사용


    }
}
