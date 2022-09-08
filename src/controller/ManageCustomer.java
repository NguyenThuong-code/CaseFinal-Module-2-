package controller;

import model.*;
import storage.custome.DataFile;
import storage.custome.ReadAndWrite;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageCustomer {
    public static List<Customer> customerList;
    private static Map<String, Double> foodList = ManageFood.restaurantFood;
    private static Map<String , Double> drinkList= ManageBeverage.restaurantBeverage;
    private static List<PaymentMethod> paymentList= MangePayment.paymentMethods;
    private static DataFile readWriteFile = ReadAndWrite.getInstance();

    static {
        customerList = readWriteFile.readFile();
    }

    public void displayCustomer() {
        for (Customer list : customerList
        ) {
            System.out.println(list.toString());
        }
    }

    public static void addCustomerToList(List<Customer> customerList) {
        readWriteFile.writeFile(customerList);
    }

    public void deleteCustomer(List<Customer> customerList, String idTable) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdTable().equals(idTable)) {
                customerList.remove(customerList.get(i));
                readWriteFile.writeFile(customerList);
            } else {
                System.out.println("Id not Fount!");
            }
        }
    }

    //    public void editCustomer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String name = sc.nextLine();
        System.out.println("id Table:");
        String idTable = sc.nextLine();
        System.out.println("Number Person:");
        int num = sc.nextInt();
        System.out.println("Date services");
        System.out.println("Enter day");
        int day = sc.nextInt();
        System.out.println("Enter Month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        boolean check = false;
        RestaurantFood food = null;
        RestaurantBeverage beverage =null;
        PaymentMethod method =null;
        Customer customer=null;
        System.out.println("Enter number food:");
        int numFood = sc.nextInt();
        int i = 0;
        while (i < numFood) {
            System.out.println("Enter food:");
            String nameFood = sc.nextLine();
                if (foodList.containsKey(nameFood)) {
                    check = true;
//                    food= foodList.;
                    i++;
                } else {
                    System.out.println("No have food in list");
                    i++;
                }
        }
        System.out.println("Enter number Drink");
        int numDrink = sc.nextInt();
        int j = 0;
        while(j<numDrink){
            System.out.println("Enter type Drink!");
            String typeDrink = sc.nextLine();
            for(int k =0; k< drinkList.size();k++){
                if(drinkList.containsKey(typeDrink)){
                    check=true;
                    j++;
                }else {
                    System.out.println("No Drink was found in list");
                    j++;
                }
            }
        }
        System.out.println("Enter TypePayment!");
        String payment= sc.nextLine();
        for (int s= 0; s<paymentList.size();s++){
            if(paymentList.get(i).getPayMethod().equalsIgnoreCase(payment)){
                check=true;
                method= paymentList.get(i);
            }
        }
        if (check){
//            customer= new CustomerVip(name, idTable,num,date,);
        }
    }
}