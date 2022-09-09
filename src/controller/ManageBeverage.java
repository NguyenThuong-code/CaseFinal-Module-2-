package controller;


import model.entity.RestaurantBeverage;
import storage.beverage.BeverageData;
import storage.beverage.ReadAndWriteBeverage;


import java.util.ArrayList;
import java.util.List;


public class ManageBeverage {
    private static BeverageData beverageData= ReadAndWriteBeverage.getInstance();

    public static List<RestaurantBeverage> beverageList;

    static {
        beverageList= beverageData.readFile();
    }


    public void displayBeverage(){
        for (RestaurantBeverage list:beverageList
             ) {
            System.out.println(list.toString());
        }
    }
    public  void addNewBeverage(RestaurantBeverage drink){
        beverageList.add(drink);
        beverageData.writeFile(beverageList);
    }
    public void editBeverageById( int pos, RestaurantBeverage drink){
       for (int i=0; i< beverageList.size();i++){
           if (pos==i){
               beverageList.set(pos,drink);
           }
       }
    }
    public void deleteBeverageById(int index){
        beverageList.remove(index);
    }

    public void searBeverageByName(String name){
        for (int i = 0; i< beverageList.size();i++){
            if (beverageList.get(i).getBeverageName().equalsIgnoreCase(name)){
                System.out.println(beverageList.get(i).toString());
            }
        }
    }
}
