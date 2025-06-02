package _31_Generic.WildCard.UpperBoundedWildcard;

import _31_Generic.WildCard.UnBoundedWildcard.Box;

public class Main {
    public static void main(String[] args) {
        Box<dog> dogBox = new Box<>();
        dogBox.setItem(new dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());

//        Box<Date> dateBox = new Box<>();
//        dateBox.setItem(new Date());



        ExtendsWildcard.makeSound(dogBox);
        ExtendsWildcard.makeSound(catBox);
        ExtendsWildcard.makeSound(animalBox);
//        ExtendsWildcard.makeSound(dateBox);




    }
}
