package model;

import java.time.LocalDate;

public class CustomerVip extends Customer{
    private String idDiscount;

    public CustomerVip(String idDiscount) {
        this.idDiscount = idDiscount;
    }

    public CustomerVip(String fullName, String idTable, int numberPerson, LocalDate dateService, RestaurantFood restaurant, RestaurantBeverage beverage, PaymentMethod payment, String idDiscount) {
        super(fullName, idTable, numberPerson, dateService, restaurant, beverage, payment);
        this.idDiscount = idDiscount;
    }

    public String getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(String idDiscount) {
        this.idDiscount = idDiscount;
    }


    @Override
    public String toString() {
        return "CustomerVip{" +
                super.toString()+
                "idDiscount='" + idDiscount + '\'' +
                '}';
    }

    @Override
    public void CalculateBill() {

    }
}
