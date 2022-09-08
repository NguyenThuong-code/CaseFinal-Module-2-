package model;

import java.time.LocalDate;

public class CustomerNormal extends Customer {
 private Float vat;

    public CustomerNormal(Float vat) {
        this.vat = vat;
    }

    public CustomerNormal(String fullName, String idTable, int numberPerson, LocalDate dateService, RestaurantFood restaurant,RestaurantBeverage beverage, PaymentMethod payment, Float vat) {
        super(fullName, idTable, numberPerson, dateService, restaurant, beverage, payment);
        this.vat = vat;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "CustomerNormal{" +
                super.toString()+
                "vat=" + vat +
                '}';
    }

    @Override
    public void CalculateBill() {

    }
}
