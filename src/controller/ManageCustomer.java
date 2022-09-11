package controller;

import model.dao.IDiscountBill;
import model.entity.*;
import storage.custome.DataFile;
import storage.custome.ReadAndWrite;

import java.util.Collections;
import java.util.List;

public class ManageCustomer {
    public static List<Customer> customerList;

    private static DataFile readWriteFile = ReadAndWrite.getInstance();

    static {
        customerList = readWriteFile.readFile();
    }

    public void displayCustomerNormal() {
        for (Customer list1 :  customerList
        ) {
            if (list1 instanceof CustomerNormal) {
                System.out.println(list1.toString());
            }
        }
    }

    public void displayCustomerVip() {
        for (Customer list2 :  customerList
        ) {
            if (list2 instanceof CustomerVip) {
                System.out.println(list2.toString());
            }
        }
    }

    public void addCustomerToList(List<Customer> customerList) {
        readWriteFile.writeFile(customerList);
    }

    public void deleteCustomer(List<Customer> customerList, String idTable) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdTable().equals(idTable)) {
                customerList.remove(customerList.get(i));
//                readWriteFile.writeFile(customerList);
            } else {
                System.out.println("Id not Fount!");
            }
        }
    }

        public void editCustomerNormal(String idTable, Customer customer) {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getIdTable().equals(idTable) && customerList.get(i) instanceof CustomerNormal) {
                    customerList.set(i, customer);
                  //  readWriteFile.writeFile(customerList);
                }
            }
        }
    public void editCustomerVip(String idTable, Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdTable().equals(idTable) && customerList.get(i) instanceof CustomerVip) {
                customerList.set(i, customer);
            }
        }
    }

 public void searchCustomerByName(String name){
        for (int i = 0;i<customerList.size();i++){
            if (customerList.get(i).getFullName().equalsIgnoreCase(name)){
                System.out.println(customerList.get(i).toString());
            }
        }
    }
 public void sortCustomerByName(){
     Collections.sort(customerList, new ManageCustomerAlphabet());
     for (Customer list:customerList
          ) {

             System.out.println(list.toString());
     }
 }

 public double getRealMoney(String idTable){
     double total =0;
     for (int i=0; i<customerList.size();i++){
         if(customerList.get(i) instanceof IDiscountBill){
             IDiscountBill discountBill=(IDiscountBill) customerList.get(i);
             if (customerList.get(i).getIdTable().equals(idTable)){
                 total=discountBill.getRealMoney();
             }
         }
     }
     return total;
 }
}