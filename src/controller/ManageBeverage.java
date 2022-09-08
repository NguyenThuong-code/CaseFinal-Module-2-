package controller;

import model.RestaurantBeverage;

import java.util.HashMap;
import java.util.Map;

public class ManageBeverage {
    public static Map<String,Double> restaurantBeverage= new HashMap<>();

    static {
        restaurantBeverage.put("Wine", 100.0);
        restaurantBeverage.put("Juice", 80.0);
        restaurantBeverage.put("Cocktail", 40.0);
        restaurantBeverage.put("Beer", 60.0);
        restaurantBeverage.put("Tea", 50.0);
    }
    public void addNewBeverage(RestaurantBeverage beverage){
        restaurantBeverage.put(beverage.getBeverageName(), beverage.getBeveragePrice());
    }
    public void editBeverage(String key, Double value){
        restaurantBeverage.replace(key, value);
    }
    private void deleteBeverage(String key){
        restaurantBeverage.remove(key);
    }

}
