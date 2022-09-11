package model.entity;



import model.dao.IDiscountBill;

import java.io.Serializable;


public class CustomerVip extends Customer implements IDiscountBill, Serializable {
    private Float amountDiscount;

    public CustomerVip() {
    }

    public CustomerVip(Float amountDiscount) {
        this.amountDiscount = amountDiscount;
    }

    public CustomerVip(String fullName, String idTable, int numberPerson, RestaurantFood restaurant, RestaurantBeverage beverage, Float amountDiscount) {
        super(fullName, idTable, numberPerson, restaurant, beverage);
        this.amountDiscount = amountDiscount;
    }

    public Float getAmountDiscount() {
      return   amountDiscount;
    }

    public void setAmountDiscount(Float amountDiscount) {
        this.amountDiscount = amountDiscount;
    }


    @Override
    public double calculatePrice() {
        double price=0;
       price= getAmountDiscount()*getNumberPerson()*(getRestaurant().getPriceBuffet()+getBeverage().get().getBeveragePrice());
        return price;
    }

    @Override
    public String toString() {
        return "CustomerVip{" +
                super.toString()+
                "numberDiscount='" + amountDiscount + '\'' +
                '}';
    }


    @Override
    public double discountBill() {
        return 0.2;
    }

    @Override
    public double getRealMoney() {
        return calculatePrice()*discountBill();
    }
}
