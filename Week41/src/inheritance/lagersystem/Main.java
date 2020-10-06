package inheritance.lagersystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FoodItem[] foodItems = new FoodItem[10];

        for (int i = 0; i<foodItems.length; i++) {
            foodItems[i] = new FoodItem("Food " + i, Math.random() * 100, new Date());
        }

        for (FoodItem fi: foodItems) {
            System.out.println(fi.toString());
        }


        NonFoodItem[] nonFoodItems = new NonFoodItem[10];

        for (int i = 0; i<nonFoodItems.length; i++) {
            nonFoodItems[i] = new NonFoodItem("NonFood " + i, Math.random() * 100, new String[]{"søm", "plast"});
        }

        for (NonFoodItem nfi: nonFoodItems) {
            System.out.println(nfi.toString());
        }

    }
}
