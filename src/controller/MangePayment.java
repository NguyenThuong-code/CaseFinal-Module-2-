package controller;

import model.CardPayment;

import model.MomoPayment;
import model.PaymentMethod;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangePayment {
    public static List<PaymentMethod> paymentMethods= new ArrayList<>();
    public static CardPayment card = new CardPayment();
    public static MomoPayment momo= new MomoPayment();
    static {
        paymentMethods.add(momo);
        paymentMethods.add(card);
        paymentMethods.add(new PaymentMethod("CashPayment"));
    }
public static void addNewMethodPayment(PaymentMethod payment){
        paymentMethods.add(payment);
}
public static void editPaymentMethod(int index, PaymentMethod payment){
    paymentMethods.set(index,payment);
}

public static  void  removePaymentMethod(int index){
        paymentMethods.remove(index);
}

//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter index:");
//        int index= sc.nextInt();
//        System.out.println("Enter method:");
//        sc.nextLine();
//        String payment = sc.nextLine();
//        System.out.println("Enter id Number:");
//        String idNumber= sc.nextLine();

//       for (int i=0; i<paymentMethods.size();i++){
//           if (index==i){
//              removePaymentMethod(index);
//           }
//           System.out.println(paymentMethods.get(i).toString());
//       }
//    }
}
