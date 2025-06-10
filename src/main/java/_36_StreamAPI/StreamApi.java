package _36_StreamAPI;

// StreamAPI
/*
* Java 8 도입되었음
* 컬렉션(List, Set)과 배열에 저장된 데이터를 선언함으로 처리하기 위한
  추상화된 반복 프레임 워크
* 필터링, 매핑, 정렬, 집계 등등

* 간결성 -> 가독성 향상(메소드 체이닝) - 메소드.메소드.메소드.
  */

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사","최오","최육","최칠","최팔");
        System.out.println(names);

        // filter() => 말 그대로 어떠한 조건을 통해 거르는 것

        List<String> namesWithKim = names.stream() // 위 선언했던 리스트 - type stream
                .filter(name -> name.startsWith("김")) // boolean 값으로 걸러짐
                .toList(); // stream -> String으로 변환해줌
        System.out.println("namesWithKim : "+ namesWithKim);

        System.out.println();

        List<String> englishNames = Arrays.asList("alice","anya","camel","pascal","yor","spy");
        System.out.println(englishNames);

        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("a"))
//                .map(name -> name.toUpperCase()) // 요소들에게 하나씩 적용시키겠다
                .map(String::toUpperCase) // 직접 접근
                // 내부 요소들에게 각각 메소들르 적용하는 형태

                // () -> , :: 같은 작용
                // But, () -> 는 각각요소를 매개변수로 받아서 매개변수를 참조하여 메소드를 호출

                // ::은 해당 타입 클래스의 메소드를 직접 호출하여 각각 요소에 적용
                .sorted() // 정렬 (과거형)
                .toList(); // String 변환

        System.out.println("result : " + result); // 사실상 걸러냄
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        // 만약에 이름 길이가 3 이상인것만 갯수를 구하면?

        int count = 0;
        for (int i = 0; i < englishNames.size(); i++) { // size() !!
            if(englishNames.get(i).length() >= 5) { // 3 이상인것들만 거름
                count++;
            }
        }
        System.out.println(count);

        long count1 = englishNames.stream()
                .filter(name ->name.length() >= 4)
                .count(); // long으로 반환
        System.out.println("이름 길이가 3 이상인것(stream) : " + count1);


    }
}
