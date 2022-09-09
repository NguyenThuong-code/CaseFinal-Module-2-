package controller;

import model.entity.RestaurantBeverage;
import model.entity.RestaurantFood;
import storage.food.FoodData;
import storage.food.ReadAndWriteFood;

import java.util.ArrayList;
import java.util.List;

;

public class ManageFood {
    private static FoodData foodData= ReadAndWriteFood.getInstance();

    public static List<RestaurantFood> foodList;
    static {
        foodList= foodData.readFile();
    }

    public void displayFoodList(){
        for (RestaurantFood food: foodList
             ) {
            System.out.println(food.toString());
        }
    }

    public void addNewFood(RestaurantFood food){
        foodList.add(food);
        foodData.writeFile(foodList);
    }
    public void editFoodById(int index, RestaurantFood food){
        for (int i=0; i<foodList.size();i++){
            if(index== i){
                foodList.set(index,food);
            }
        }
    }
    public void deleteFoodById(int index){
        foodList.remove(index);
    }

    public void searchFoodByName(String name){
        for (int i= 0; i<foodList.size();i++){
            if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(name)){
                System.out.println(foodList.get(i).toString());
            }
        }

    }
}
