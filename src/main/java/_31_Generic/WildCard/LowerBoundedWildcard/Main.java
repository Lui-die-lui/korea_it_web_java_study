package _31_Generic.WildCard.LowerBoundedWildcard;

import _31_Generic.WildCard.UnBoundedWildcard.Box;
import _21_Class.Dog.Dog;

public class Main {
    public static void main(String[] args) {

        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();

        SuperWildcard.putDog(animalBox); // ok  dog 보다 상위 Animal 이기 때문에 가능



    }
}
