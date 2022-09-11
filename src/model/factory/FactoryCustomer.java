package model.factory;

import model.entity.*;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactoryCustomer implements Serializable {
    private static final String ID_TABLE_VIP_REGEX="[V][I][P]\\d{2}";
    private static final String ID_TABLE_NORMAL_REGEX="[N][M]\\d{2}";

    public static boolean validateIdVip(String regex){
        Pattern pattern=Pattern.compile(ID_TABLE_VIP_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateIdNormal(String regex){
        Pattern pattern= Pattern.compile(ID_TABLE_NORMAL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
    public static CustomerVip getCustomerVip(String fullName, String idTable, int numberPerson, RestaurantFood restaurant, RestaurantBeverage beverage, Float amountDiscount){
        CustomerVip customerVip;
        if (validateIdVip(idTable)){
            customerVip = new CustomerVip();
        }else {
            throw new IllegalArgumentException("The Id Table not match with Customer!");
        }
        customerVip.setFullName(fullName);
        customerVip.setIdTable(idTable);
        customerVip.setNumberPerson(numberPerson);
        customerVip.setRestaurant(restaurant);
        customerVip.setBeverage(beverage);
        customerVip.setAmountDiscount(amountDiscount);
        return customerVip;
    }
    public static CustomerNormal getCustomerNormal(String fullName, String idTable, int numberPerson, RestaurantFood restaurant, RestaurantBeverage beverage, Float vat){
        CustomerNormal customerNormal;
        if (validateIdNormal(idTable)){
            customerNormal= new CustomerNormal();
        }else {
            throw new IllegalArgumentException("The Id Table not match with Customer!");
        }
        customerNormal.setFullName(fullName);
        customerNormal.setIdTable(idTable);
        customerNormal.setNumberPerson(numberPerson);
        customerNormal.setRestaurant(restaurant);
        customerNormal.setBeverage(beverage);
        customerNormal.setVat(vat);
        return customerNormal;
    }

}
