package _32_Collections.strList;

// Collection
// 여러 객체를 모아놓는 것(내부 class type)
// List -> 순서가 있는 데이터의 집합, 중복된 요소를 허락함
// ArrayList, LinkedList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class strList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>(); // 방법1 - 크기 지정 x
//        // element 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A"); // 중복허용

        List<String> strList1 = new ArrayList<>(Arrays.asList("A","B","A")); // 방법2 - 생성과 동시에 값 넣기

        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

        String[] strArray = new String[2];
        strArray[0] = "000";
        strArray[1] = "222";

        // 출력
        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strList1);
        System.out.println(strList2);

        // 특정 element위 포함 여부 -> contains() 메소드 사용 -> return boolean
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함 여부 : " + isContains1);

        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부 : " + isContains2);

        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + isContains3);
        // String의 경우 char들이 '순서대로' 나열된 것이기 때문에 char하나가 포함된
        // contains로 부분검색이 가능하나
        // searchElem2의 경우는 element가 완전히 일치하는지를 확인하기 때문에
        // 위와 같은 결과가 나온다

        //특정 element를 삭제 -> remove() => return boolean
        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removeResult1);
        System.out.println(strList2);

        // list의 정렬 -> 배열과 동일
        Collections.sort(strList2); // 변수 자체에 있는 값을 정렬 시키기 때문에 재 대입 X - 마찬가지로 원본 리스트를 정렬시킴
        System.out.println("정렬된 strList : " + strList2);

        // 역순 정렬
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("역순 정렬된 strList : " + strList2);

        // 일반 for문 순회
        for (int i = 0; i < strList2.size(); i++) { // list에서는 size
            System.out.println(strList2.get(i) + "언어"); // get 사용
        }

        System.out.println();

        //향상된 for문 순회
        for (String lang : strList2) {
            System.out.println(lang + "언어");
        }







    }
}
