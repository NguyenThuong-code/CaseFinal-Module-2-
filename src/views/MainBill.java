package views;

import controller.ManageBeverage;
import controller.ManageCustomer;
import controller.ManageFood;
import model.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBill {
    public static List<RestaurantBeverage> drinkList = ManageBeverage.beverageList;
    public static ManageBeverage mb = new ManageBeverage();
    public static List<RestaurantFood> foodList= ManageFood.foodList;
    public static  ManageFood mf= new ManageFood();
    public static List<Customer> customerList= ManageCustomer.customerList;
    public static ManageCustomer mc= new ManageCustomer();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        while (true){
//            System.out.println("Application to Manage Restaurant!");
//            System.out.println("Enter a:To work with Food");
//            System.out.println("Enter b:To work with Drink");
//            System.out.println("Enter c:To work with Customer");
//            System.out.println("Enter d:To exit!");
//
//            String line = sc.nextLine();
//            switch (line){
//                case "a":{
//                    System.out.println("Enter 1:To display Food:");
//                    System.out.println("Enter 2:To add Food to List:");
//                    System.out.println("Enter 3:To edit Food in list");
//                    System.out.println("Enter 4:To remove Food In list");
//                    String type1 = sc.nextLine();
//                    switch (type1){
//                        case "1":{
//                            mf.displayFoodList();
//                            break;
//                        }
//                        case "2":{
//                            System.out.println("Enter type Buffet");
//                            String typeFood= sc.nextLine();
//                            System.out.println("Enter Price:");
//                            double price =sc.nextDouble();
//                            RestaurantFood food= new RestaurantFood(typeFood, price);
//                            mf.addNewFood(food);
//                            break;
//                        }
//                        case "3":{
//                            System.out.println("Enter position you want to edit:");
//                            int position = sc.nextInt();
//                            System.out.println("Enter Drink Name:");
//                            sc.nextLine();
//                            String name = sc.nextLine();
//                            System.out.println("Enter Price Drink:");
//                            Double price= sc.nextDouble();
//                            RestaurantFood food= new RestaurantFood(name, price);
//                            mf.editFoodById(position,food);
//                            break;
//                        }
//                        case "4":{
//                            System.out.println("Enter position you want to delete:");
//                            int index = sc.nextInt();
//                            mf.deleteFoodById(index);
//                            break;
//                        }
//                        default:
//                            System.out.println("Invalid");
//                            break;
//                    }
//                    break;
//                }
//                case "b":{
//                    System.out.println("Enter 5:To display List Drink");
//                    System.out.println("Enter 6:To add Drink In List");
//                    System.out.println("Enter 7:To Edit Dink In List");
//                    System.out.println("Enter 8:To delete Drink in List");
//                    String type2= sc.nextLine();
//                    switch (type2){
//                        case "5":{
//                            mb.displayBeverage();
//                            break;
//                        }
//                        case "6":{
//                            System.out.println("Enter Drink Name:");
//                            String name = sc.nextLine();
//                            System.out.println("Enter Price Drink:");
//                            Double price= sc.nextDouble();
//                            RestaurantBeverage drink = new RestaurantBeverage(name, price);
//                            mb.addNewBeverage(drink);
//                            break;
//                        }
//                        case "7":{
//                            System.out.println("Enter position you want to edit:");
//                            int position = sc.nextInt();
//                            System.out.println("Enter Drink Name:");
//                            sc.nextLine();
//                            String name = sc.nextLine();
//                            System.out.println("Enter Price Drink:");
//                            Double price= sc.nextDouble();
//                            RestaurantBeverage drink = new RestaurantBeverage(name, price);
//                            mb.editBeverageById(position,drink);
//                            break;
//                        }
//                        case "8":{
//                            System.out.println("Enter position you want to delete:");
//                            int index = sc.nextInt();
//                            mb.deleteBeverageById(index);
//                            break;
//                        }
//                        default:
//                            System.out.println("Invalid");
//                            break;
//                    }
//                    break;
//                }
//                case "c":{
//                    System.out.println("Enter 9:To display customer List");
//                    System.out.println("Enter 10:To add customer to List");
//                    System.out.println("Enter 11:To Edit customer in List");
//                    System.out.println("Enter 12:To delete customer in List");
//                    String type3 = sc.nextLine();
//                    switch (type3){
//                        case "9":{
//                            System.out.println("Enter a: To display customer List Normal");
//                            System.out.println("Enter b: To display Customer List VIP");
//                            String type4 =sc.nextLine();
//                            switch (type4){
//                                case "a":{
//                                   mc.displayCustomerNormal();
//                                   break;
//                                }
//                                case "b":{
//                                    mc.displayCustomerVip();
//                                    break;
//                                }
//                                default:
//                                    System.out.println("Invalid");
//                                    break;
//                            }
//                            break;
//                        }
//                        case "10":{
//                            System.out.println("Enter a: To add customer List Normal");
//                            System.out.println("Enter b: To add customer List Vip");
//                            String type5 = sc.nextLine();
//                            switch (type5) {
//                                case "a": {
//                                    System.out.println("Enter FullName:");
//                                    String nameCustom = sc.nextLine();
//                                    System.out.println("Enter IdTable:");
//                                    String idTable = sc.nextLine();
//                                    System.out.println("Enter number Person");
//                                    int numCustom = sc.nextInt();
//                                    System.out.println("Enter type Buffet");
//                                    sc.nextLine();
//                                    String typeBuffet = sc.nextLine();
//                                    System.out.println("Enter drink!");
//                                    String typeDrink = sc.nextLine();
//                                    System.out.println("Enter Number VAT:");
//                                    Float vat = sc.nextFloat();
//                                    CustomerNormal customerNormal = null;
//                                    CustomerVip customerVip = null;
//                                    RestaurantFood food = null;
//                                    RestaurantBeverage drink = null;
//                                    boolean check = false;
//                                    for (int i = 0; i < foodList.size(); i++) {
//                                        if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
//                                            check = true;
//                                            food = foodList.get(i);
//                                        }
//                                    }
//                                    for (int i = 0; i < drinkList.size(); i++) {
//                                        if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
//                                            check = true;
//                                            drink = drinkList.get(i);
//                                        }
//                                    }
//                                    if (check) {
//                                        customerNormal = new CustomerNormal(nameCustom, idTable, numCustom, food, drink, vat);
//                                        customerList.add(customerNormal);
//                                        mc.addCustomerToList(customerList);
//                                    }
//                                    break;
//                                }
//                                case "b": {
//                                    System.out.println("Enter FullName:");
//                                    String nameCustom = sc.nextLine();
//                                    System.out.println("Enter IdTable:");
//                                    String idTable = sc.nextLine();
//                                    System.out.println("Enter number Person");
//                                    int numCustom = sc.nextInt();
//                                    System.out.println("Enter type Buffet");
//                                    sc.nextLine();
//                                    String typeBuffet = sc.nextLine();
//                                    System.out.println("Enter drink!");
//                                    String typeDrink = sc.nextLine();
//                                    System.out.println("Enter Number Discount:");
//                                    Float discount = sc.nextFloat();
//                                    CustomerVip customerVip = null;
//                                    RestaurantFood food = null;
//                                    RestaurantBeverage drink = null;
//                                    boolean check = false;
//                                    for (int i = 0; i < foodList.size(); i++) {
//                                        if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
//                                            check = true;
//                                            food = foodList.get(i);
//                                        }
//                                    }
//                                    for (int i = 0; i < drinkList.size(); i++) {
//                                        if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
//                                            check = true;
//                                            drink = drinkList.get(i);
//                                        }
//                                    }
//                                    if (check) {
//                                        customerVip = new CustomerVip(nameCustom, idTable, numCustom, food, drink, discount);
//                                        customerList.add(customerVip);
//                                        mc.addCustomerToList(customerList);
//                                    }
//                                    break;
//                                }
//                                default:
//                                    System.out.println("Invalid");
//                                    break;
//                            }
//                            break;
//                        }
//                        case "11":{
//                            System.out.println("Enter a: To edit Normal Customer");
//                            System.out.println("Enter b: To edit Vip Customer");
//                            String type6= sc.nextLine();
//                            switch (type6) {
//                                case "a": {
//                                    System.out.println("Enter index to edit");
//                                    String idTab = sc.nextLine();
//                                    System.out.println("Enter FullName:");
//                                    String nameCustom = sc.nextLine();
//                                    System.out.println("Enter IdTable:");
//                                    String idTable = sc.nextLine();
//                                    System.out.println("Enter number Person");
//                                    int numCustom = sc.nextInt();
//                                    System.out.println("Enter type Buffet");
//                                    sc.nextLine();
//                                    String typeBuffet = sc.nextLine();
//                                    System.out.println("Enter drink!");
//                                    String typeDrink = sc.nextLine();
//                                    System.out.println("Enter Number VAT:");
//                                    Float vat = sc.nextFloat();
//                                    CustomerNormal customerNormal = null;
//                                    CustomerVip customerVip = null;
//                                    RestaurantFood food = null;
//                                    RestaurantBeverage drink = null;
//                                    boolean check = false;
//                                    for (int i = 0; i < foodList.size(); i++) {
//                                        if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
//                                            check = true;
//                                            food = foodList.get(i);
//                                        }
//                                    }
//                                    for (int i = 0; i < drinkList.size(); i++) {
//                                        if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
//                                            check = true;
//                                            drink = drinkList.get(i);
//                                        }
//                                    }
//                                    if (check) {
//                                        customerNormal = new CustomerNormal(nameCustom, idTable, numCustom, food, drink, vat);
//                                        mc.editCustomerNormal(idTab, customerNormal);
//                                    }
//                                    break;
//                                }
//                                case "b":{
//                                    System.out.println("Enter index to edit");
//                                    String idTab = sc.nextLine();
//                                    System.out.println("Enter FullName:");
//                                    String nameCustom = sc.nextLine();
//                                    System.out.println("Enter IdTable:");
//                                    String idTable = sc.nextLine();
//                                    System.out.println("Enter number Person");
//                                    int numCustom = sc.nextInt();
//                                    System.out.println("Enter type Buffet");
//                                    sc.nextLine();
//                                    String typeBuffet = sc.nextLine();
//                                    System.out.println("Enter drink!");
//                                    String typeDrink = sc.nextLine();
//                                    System.out.println("Enter Number Discount:");
//                                    Float discount = sc.nextFloat();
//                                    CustomerVip customerVip = null;
//                                    RestaurantFood food = null;
//                                    RestaurantBeverage drink = null;
//                                    boolean check = false;
//                                    for (int i = 0; i < foodList.size(); i++) {
//                                        if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
//                                            check = true;
//                                            food = foodList.get(i);
//                                        }
//                                    }
//                                    for (int i = 0; i < drinkList.size(); i++) {
//                                        if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
//                                            check = true;
//                                            drink = drinkList.get(i);
//                                        }
//                                    }
//                                    if (check) {
//                                        customerVip = new CustomerVip(nameCustom, idTable, numCustom, food, drink, discount);
//                                        mc.editCustomerVip(idTab,customerVip);
//                                    }
//                                    break;
//                                }
//                                default:
//                                    System.out.println("Invalid");
//                                    break;
//                            }
//                            break;
//                        }
//                        case "12":{
//                            System.out.println("Enter Id table that u want to delete!");
//                            String idTab= sc.nextLine();
//                            mc.deleteCustomer(customerList,idTab);
//                            break;
//                        }
//
//                    }
//                    break;
//                }
//                default:
//                    System.out.println("Invalid");
//                    break;
//            }
//        }


    }
}
