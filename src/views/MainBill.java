package views;

import controller.ManageBeverage;
import controller.ManageCustomer;
import controller.ManageFood;
import model.entity.*;
import model.factory.FactoryCustomer;


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
        while (true) {
            System.out.println("Application to Manage Restaurant!");
            System.out.println("Enter a:To work with Food");
            System.out.println("Enter b:To work with Drink");
            System.out.println("Enter c:To work with Customer");
            System.out.println("Enter d:To exit!");
            String line = sc.nextLine();
            switch (line) {
                case "a": {
                    System.out.println("Enter 1:To display Food:");
                    System.out.println("Enter 2:To add Food to List:");
                    System.out.println("Enter 3:To edit Food in list");
                    System.out.println("Enter 4:To remove Food In list");
                    System.out.println("Enter 5:To search Food In List");
                    String type1 = sc.nextLine();
                    switch (type1) {
                        case "1": {
                            mf.displayFoodList();
                            break;
                        }
                        case "2": {
                            RestaurantFood food = addComponentFood(sc);
                            mf.addNewFood(food);
                            break;
                        }
                        case "3": {
                            editComponentsFood(sc);
                            break;
                        }
                        case "4": {
                            System.out.println("Enter position you want to delete:");
                            int index = sc.nextInt();
                            mf.deleteFoodById(index);
                            break;
                        }
                        case "5": {
                            System.out.println("Enter name that u want to find Food!");
                            String name = sc.nextLine();
                            mf.searchFoodByName(name);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "b": {
                    System.out.println("Enter 1:To display List Drink");
                    System.out.println("Enter 2:To add Drink In List");
                    System.out.println("Enter 3:To Edit Dink In List");
                    System.out.println("Enter 4:To delete Drink in List");
                    System.out.println("Enter 5:To search Drink in List");
                    String type2 = sc.nextLine();
                    switch (type2) {
                        case "1": {
                            mb.displayBeverage();
                            break;
                        }
                        case "2": {
                            addComponentsDrink(sc);
                            break;
                        }
                        case "3": {
                            editComponentsDrink(sc);
                            break;
                        }
                        case "4": {
                            System.out.println("Enter position you want to delete:");
                            int index = sc.nextInt();
                            mb.deleteBeverageById(index);
                            break;
                        }
                        case "5": {
                            System.out.println("Enter name that u want to find Drink!");
                            String name = sc.nextLine();
                            mb.searBeverageByName(name);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "c": {
                    System.out.println("Enter 1:To display customer List");
                    System.out.println("Enter 2:To add customer to List");
                    System.out.println("Enter 3:To Edit customer in List");
                    System.out.println("Enter 4:To delete customer in List");
                    System.out.println("Enter 5:To search customer in List");
                    System.out.println("Enter 6:To sort customer by name");
                    System.out.println("Enter 7:To Calculate bill for Customer");
                    String type3 = sc.nextLine();
                    switch (type3) {
                        case "1": {
                            System.out.println("Enter a: To display customer List Normal");
                            System.out.println("Enter b: To display Customer List VIP");
                            String type4 = sc.nextLine();
                            switch (type4) {
                                case "a": {
                                    mc.displayCustomerNormal();
                                    break;
                                }
                                case "b": {
                                    mc.displayCustomerVip();
                                    break;
                                }
                                default:
                                    System.out.println("Invalid");
                                    break;
                            }
                            break;
                        }
                        case "2": {
                            System.out.println("Enter a: To add customer List Normal");
                            System.out.println("Enter b: To add customer List Vip");
                            String type5 = sc.nextLine();
                            switch (type5) {
                                case "a": {
                                    addCustomerNormalComponents(sc);
                                    break;
                                }
                                case "b": {
                                    addCustomerVipComponents(sc);
                                    break;
                                }
                                default:
                                    System.out.println("Invalid");
                                    break;
                            }
                            break;
                        }
                        case "3": {
                            System.out.println("Enter a: To edit Normal Customer");
                            System.out.println("Enter b: To edit Vip Customer");
                            String type6 = sc.nextLine();
                            switch (type6) {
                                case "a": {
                                    editComponentsNormalCustomer(sc);
                                    break;
                                }
                                case "b": {
                                    editComponentVipCustomer(sc);
                                    break;
                                }
                                default:
                                    System.out.println("Invalid");
                                    break;
                            }
                            break;
                        }
                        case "4": {
                            System.out.println("Enter Id table that u want to delete!");
                            String idTab = sc.nextLine();
                            mc.deleteCustomer(customerList, idTab);
                            break;
                        }
                        case "5": {
                            System.out.println("Enter name that u want to find Customer !");
                            String name = sc.nextLine();
                            mc.searchCustomerByName(name);
                            break;
                        }
                        case "6":{
                            mc.sortCustomerByName();
                            break;
                        }
                        case "7":{
                            System.out.println("Enter id table!");
                            String table=sc.nextLine();
                            System.out.println( "The amount of money that u must be pay is:" +mc.getRealMoney(table));
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
    private static void editComponentVipCustomer(Scanner sc) {
        System.out.println("Enter index to edit");
        String idTab = sc.nextLine();
        System.out.println("Enter FullName:");
        String nameCustom = sc.nextLine();
        System.out.println("Enter IdTable:");
        String idTable = sc.nextLine();
        System.out.println("Enter number Person");
        int numCustom = sc.nextInt();
        System.out.println("Enter type Buffet");
        sc.nextLine();
        String typeBuffet = sc.nextLine();
        System.out.println("Enter drink!");
        String typeDrink = sc.nextLine();
        System.out.println("Enter Number Discount:");
        Float discount = sc.nextFloat();
        CustomerVip customerVip = null;
        RestaurantFood food = null;
        RestaurantBeverage drink = null;
        boolean check = false;
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
                check = true;
                food = foodList.get(i);
            }
        }
        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
                check = true;
                drink = drinkList.get(i);
            }
        }
        if (check) {
            customerVip = FactoryCustomer.getCustomerVip(nameCustom, idTable, numCustom, food, drink, discount);
            mc.editCustomerVip(idTab,customerVip);
        }
    }

    private static void editComponentsNormalCustomer(Scanner sc) {
        System.out.println("Enter idTable to edit");
        String idTab = sc.nextLine();
        System.out.println("Enter FullName:");
        String nameCustom = sc.nextLine();
        System.out.println("Enter IdTable:");
        String idTable = sc.nextLine();
        System.out.println("Enter number Person");
        int numCustom = sc.nextInt();
        System.out.println("Enter type Buffet");
        sc.nextLine();
        String typeBuffet = sc.nextLine();
        System.out.println("Enter drink!");
        String typeDrink = sc.nextLine();
        System.out.println("Enter Number VAT:");
        Float vat = sc.nextFloat();
        CustomerNormal customerNormal = null;
        CustomerVip customerVip = null;
        RestaurantFood food = null;
        RestaurantBeverage drink = null;
        boolean check = false;
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
                check = true;
                food = foodList.get(i);
            }
        }
        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
                check = true;
                drink = drinkList.get(i);
            }
        }
        if (check) {
            customerNormal = FactoryCustomer.getCustomerNormal(nameCustom, idTable, numCustom, food, drink, vat);
            mc.editCustomerNormal(idTab, customerNormal);
        }
    }

    private static void editComponentsFood(Scanner sc) {
        System.out.println("Enter position you want to edit:");
        int position = sc.nextInt();
        System.out.println("Enter Food Name:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Price Food:");
        Double price= sc.nextDouble();
        RestaurantFood food= new RestaurantFood(name, price);
        mf.editFoodById(position,food);
    }

    private static void editComponentsDrink(Scanner sc) {
        System.out.println("Enter position you want to edit:");
        int position = sc.nextInt();
        System.out.println("Enter Drink Name:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Price Drink:");
        Double price= sc.nextDouble();
        RestaurantBeverage drink = new RestaurantBeverage(name, price);
        mb.editBeverageById(position,drink);
    }

    private static void addComponentsDrink(Scanner sc) {
        System.out.println("Enter Drink Name:");
        String name = sc.nextLine();
        System.out.println("Enter Price Drink:");
        Double price= sc.nextDouble();
        RestaurantBeverage drink = new RestaurantBeverage(name, price);
        mb.addNewBeverage(drink);
    }

    private static void addCustomerVipComponents(Scanner sc) {
        System.out.println("Enter FullName:");
        String nameCustom = sc.nextLine();
        System.out.println("Enter IdTable:");
        String idTable = sc.nextLine();
        System.out.println("Enter number Person");
        int numCustom = sc.nextInt();
        System.out.println("Enter type Buffet");
        sc.nextLine();
        String typeBuffet = sc.nextLine();
        System.out.println("Enter drink!");
        String typeDrink = sc.nextLine();
        System.out.println("Enter Number Discount:");
        Float discount = sc.nextFloat();
        CustomerVip customerVip = null;
        RestaurantFood food = null;
        RestaurantBeverage drink = null;
        boolean check = false;
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
                check = true;
                food = foodList.get(i);
            }
        }
        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
                check = true;
                drink = drinkList.get(i);
            }
        }
        if (check) {
            customerVip = FactoryCustomer.getCustomerVip(nameCustom, idTable, numCustom, food, drink, discount);
            customerList.add(customerVip);
            mc.addCustomerToList(customerList);
        }
    }

    private static void addCustomerNormalComponents(Scanner sc) {
        System.out.println("Enter FullName:");
        String nameCustom = sc.nextLine();
        System.out.println("Enter IdTable:");
        String idTable = sc.nextLine();
        System.out.println("Enter number Person");
        int numCustom = sc.nextInt();
        System.out.println("Enter type Buffet");
        sc.nextLine();
        String typeBuffet = sc.nextLine();
        System.out.println("Enter drink!");
        String typeDrink = sc.nextLine();
        System.out.println("Enter Number VAT:");
        Float vat = sc.nextFloat();
        CustomerNormal customerNormal = null;
        CustomerVip customerVip = null;
        RestaurantFood food = null;
        RestaurantBeverage drink = null;
        boolean check = false;
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getTypeBuffet().equalsIgnoreCase(typeBuffet)) {
                check = true;
                food = foodList.get(i);
            }
        }
        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).getBeverageName().equalsIgnoreCase(typeDrink)) {
                check = true;
                drink = drinkList.get(i);
            }
        }
        if (check) {
            customerNormal = FactoryCustomer.getCustomerNormal(nameCustom, idTable, numCustom, food, drink, vat);
            customerList.add(customerNormal);
            mc.addCustomerToList(customerList);
        }
    }

    private static RestaurantFood addComponentFood(Scanner sc) {
        System.out.println("Enter type Buffet");
        String typeFood= sc.nextLine();
        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        RestaurantFood food= new RestaurantFood(typeFood, price);
        return food;
    }
}
