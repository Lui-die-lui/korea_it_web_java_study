package _31_Generic.WildCard.LowerBoundedWildcard;

import _31_Generic.WildCard.UnBoundedWildcard.Box;

public class SuperWildcard {
    // 하한 경계 와일드카드 : dog 또는 dog의 상위 타입만 허용
    public static void putDog(Box<? super dog> box) { //(Box<? super Inteager > box)
        box.setItem(new dog()); // 쓰기는 가능
//        dog dog = box.getItem(); // 읽기는 안됨

        Object obj = box.getItem(); // 읽을수는 있으나 object로 반환됨

        System.out.println("obj : " + obj);
    }

}
