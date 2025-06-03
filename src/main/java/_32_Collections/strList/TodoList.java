//package _32_Collections.strList;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class TodoList {
//    public static void main(String[] args) {
//        // 문제 - TodoList
//        /*
//         * 1. todoList를 담을 리스트 생성, 스캐너 객체도 하나 생성
//         * 2. 사용자에게 todo를 입력받을건데 몇개 입력할건지 count변수에 입력받기
//         * 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
//         * 4. 향상된 for문을 이용, todoList 출력하기 o
//         * 5. todoList 출력한 뒤 특정 todo를 포함여부를 확인하기 위해서 serchTodo라는 변수에
//         *    찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기
//         * 6. 포함 여부 확인후 삭제할 todo입력받아서 deleteTodo에 대입해두고 삭제 후 성공여부 출력 o
//         * 7. todo들 정렬하고 전체 출력 o
//         * 8. 이번엔 역순으로 정렬하고 전체출력 o
//         * 9. 전체 todo들의 갯수 출력 */
//
//        // 객체 생성
//        List<String> todo = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // 사용자에게 todo를 입력받을건데 몇개 입력할건지 count변수에 입력받기
//        int count = Integer.parseInt(scanner.nextLine());
//
//        // count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
//        for (int i = 0; i < count; i++) {
//            System.out.print((i + 1) + "할 일을 몇개 입력하시겠습니까? : ");
//            String todo = scanner.nextLine();
//            todo
//        }
//
//
//        System.out.println("전체 todo 출력하기");
//        for (String todo : ) {
//
//        }
//        //향상된 for문 순회
//        for (String str : todo) {
//            System.out.println("todolist : " + str);
//        }
//
//        System.out.println();
//
//
//        System.out.println("포함 여부를 확인할 todo를 입력해주세요 : ");
//        String searchTodo = scanner.nextLine();
//        boolean searchResult = todoList.contains(searchTodo);
//        System.out.println("->\"" + searchTodo + "\" 포함여부 : " + searchResult);
//
//        System.out.println("삭제할 todo를 입력해주세요 : ");
//        String deleteTodo
//
//        // 찾기
//        String searchTodo = " 1 ";
//        boolean isContains1 = todo.contains(searchTodo);
//        System.out.println(searchTodo + "의 포함 여부 : " + isContains1);
//
//        System.out.println();
//
//        // 삭제 여부
//        String removeElem = " 5 다음주 할 일 ";
//        boolean removeResult = todo.remove(removeElem);
//        System.out.println(removeElem +"의 삭제 여부 : " + removeResult);
//        System.out.println(todo);
//
//        System.out.println();
//
//        // 배열과 동일한 정렬
//        Collections.sort(todo);
//        System.out.println("정렬된 todoList : " + todo);
//
//        System.out.println();
//
//        // 역순 정렬
//        Collections.sort(todo, Collections.reverseOrder());
//        System.out.println("역순 정렬된 todoList : " + todo);
//
//
//
////    전체 todo 갯수
//        System.out.println("전체 todoList 갯수 : " + );
//
//
//
//
//
//
//
//
//
//    }
//}
