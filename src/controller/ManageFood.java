package controller;

import model.RestaurantFood;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManageFood {
    public static Map<String, Double> restaurantFood = new HashMap<>();
    static {
        restaurantFood.put("Salmon", 120.0);
        restaurantFood.put("Mackerel", 150.0 );
        restaurantFood.put("Tuna", 130.0);
        restaurantFood.put("Anchovy", 140.0);
        restaurantFood.put("EelSoup", 150.0);
        restaurantFood.put("HotPot", 200.0);
        restaurantFood.put("Steak", 170.0);
        restaurantFood.put("Salami", 100.0);
    }
    public static void addNewFood(RestaurantFood nameFood){
        restaurantFood.put(nameFood.getTypeBuffet(),nameFood.getPriceBuffet());
    }
    public static void editFood(String key, Double value){
        restaurantFood.replace(key,value);
    }

    public  static void deleteFood(String key){
        restaurantFood.remove(key);
    }
//   public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.println("Enter key:");
//       String nameFood= sc.nextLine();
//           if(restaurantFood.containsKey(nameFood)){
//               System.out.println("Enter value");
//               Double value= sc.nextDouble();
//               deleteFood(nameFood);
//           }else {
//               System.out.println("Not Contains");
//           }

//       RestaurantFood food= new RestaurantFood(nameFood, value);
//       addNewFood(food);
//       for (Map.Entry m: restaurantFood.entrySet()
//            ) {
//           System.out.println(m.getKey()+ " "+m.getValue());
//       }
//   }
}
