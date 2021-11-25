import Objects.Item;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        calculateBuyItemQ1();
        calculateTripCostQ2();
    }

    private static void calculateBuyItemQ1() {
        Item cock = new Item("cock", 5, 0);
        Item hen = new Item("hen", 3, 0);
        Item chickens = new Item("chickens", 1, 0);

        for (int i = cock.getQuantity(); i <= 20; i++) {
            for (int j = hen.getQuantity(); j <= 33; j++) {
                if (((i * cock.getPrice()) + (j * hen.getPrice()) + (((100 - i - j) / 3) * chickens.getPrice())) == 100
                        && ((100 - i - j) % 3) == 0 // Limit the chickens into three in a pack
                ) {
                    cock.setQuantity(i);
                    hen.setQuantity(j);
                    chickens.setQuantity(100-i-j);
                }
            }
        }
        if (cock.getQuantity() + hen.getQuantity() + chickens.getQuantity() == 100) {
            System.out.println(cock.toString());
            System.out.println(hen.toString());
            System.out.println(chickens.toString());
        }

    }

    private static void calculateTripCostQ2() {
        List<Item> loopList = new ArrayList<>();
        Item car = new Item("car", 500, 0);
        Item bus = new Item("bus", 300, 0);
        Item train = new Item("train", 400, 0);
        Item plane = new Item("plane", 1000, 0);
        loopList.add(car);
        loopList.add(bus);
        loopList.add(train);
        loopList.add(plane);

        Item budget = new Item("budget", 500, 0);

        loopList.forEach(item -> {
            if (item.getPrice() <= budget.getPrice()){
                System.out.println("Xiaoming can choose " + item.getType());
            }
        });

    }
}
