package _21_Class.WaterBottle;

public class WaterBottle {
    /*문제
    currentWater 현재 물의 양 - private
    메소드
    물채우기(fill) => 최대용량인 1000을 넘을 수 없다.
    물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
     getter를 통해 현재 물벼의 물의 양에 접근할 수 있다.
    **/

    private int currentWater;

    WaterBottle() {
//        System.out.println("현재 물의 양 : " + currentWater + "ml");
    }

    public void fill(int amount ) {
        if ( amount > 0 && currentWater + amount <= 1000 ) {
            currentWater += amount;
            System.out.println(amount + "의 양만큼 물이 채워졌습니다. 현재 물의 양 : " + amount + "ml");
        } else { //false일때
            System.out.println("물이 가득 찼습니다. 현재 물의 양 : " + currentWater + "ml");
        }

    }

    public void drink(int amount) {
        if(amount > 0 && amount <= currentWater) {
            currentWater -= amount;
            System.out.println(amount + "의 양만큼 물을 마셨습니다. 현재 물의 양 : " + currentWater + "ml" );
        } else {
            System.out.println("더이상 물을 마실 수 없습니다. 현재 물의 양 : " + currentWater + "ml");
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }





    }

