package _36_StreamAPI;

import _28_Static.Person.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 브랜드 키워드 입력받기 => 스트림 필터 이용해서 키워드 브랜드 뽑아내고 리스트에 담기
// 뽑아온 브랜드 상품들 출력 없으면 없다고 출력

public class StreamApiExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.asList
                ("애플 아이폰 15 pro", "애플 맥북 프로 M3",
                        "애플 아이패드 에어 5세대", "삼성 갤럭시 S24 울트라",
                        "삼성 갤럭시 Z 플립 5", "삼성 갤럭시 탭 S9","엘지 울트라기어 게이밍 모니터");

        System.out.print("브랜드 입력 : ");
        String sc = scanner.nextLine();


        if(sc.equalsIgnoreCase("apple")) {
            sc = "애플";
        } else if (sc.equalsIgnoreCase("samsung")) {
            sc = "삼성";
        } else if (sc.equalsIgnoreCase("lg")) {
            sc = "엘지";
        }

        String keyword = sc;
//
//        List<String> result = products.stream()
//                .filter(products -> products.contains())


        List<String> result = products.stream()
                .filter(product -> product.contains(keyword))
                .toList();


        if (sc.equals("삼성")) {
            List<String> product = products.stream()
                    .filter(name -> name.startsWith("삼성"))
                    .toList();
            System.out.println(sc + " = " + product);
        } else if (sc.equals("애플")) {
            List<String> product = products.stream()
                    .filter(name->name.startsWith("애플"))
                    .toList();
            System.out.println(sc + " = " + product );
        }  else if (sc.equals("엘지")) {
            List<String> product = products.stream()
                    .filter(name->name.startsWith("엘지"))
                    .toList();
            System.out.println(sc + " = " + product );
        } else {
            System.out.println("상품이 없습니다.");
        }



//   .filter(name ->name.startsWith("삼성"))
//                .filter(name -> name.startsWith("엘지"))

        System.out.println(keyword + " 브랜드 상품 목록");
        if(result.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        } else {
            result.forEach(System.out::println);
        }


    }
}
