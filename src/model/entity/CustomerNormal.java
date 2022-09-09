package model.entity;

import model.dao.IDiscountBill;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomerNormal extends Customer implements IDiscountBill, Serializable {
 private Float vat;

    public CustomerNormal(String fullName, String idTable, int numberPerson, RestaurantFood restaurant, RestaurantBeverage beverage, Float vat) {
        super(fullName, idTable, numberPerson, restaurant, beverage);
        this.vat = vat;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    @Override
    public double calculatePrice() {
        double price =0;
       price= getVat()*getNumberPerson()*(getRestaurant().getPriceBuffet()+getBeverage().get().getBeveragePrice());
       return price;
    }

    @Override
    public String toString() {
        return "CustomerNormal{" +
                super.toString()+
                "vat=" + vat +
                '}';

    }

    @Override
    public double discountBill() {
        return 0.1;
    }

    @Override
    public double getRealMoney() {
        return calculatePrice()*discountBill();
    }
}
