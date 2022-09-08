package model;

import java.time.LocalDate;
import java.util.Optional;

public  abstract  class Customer {
    private String fullName;
    private String idTable;
    private int numberPerson;
    private LocalDate dateService;
    private RestaurantFood restaurant;
    private PaymentMethod payment;
    private RestaurantBeverage beverage;
    public Customer() {
    }

    public Customer(String fullName, String idTable, int numberPerson, LocalDate dateService, RestaurantFood restaurant,RestaurantBeverage beverage, PaymentMethod payment) {
        this.fullName = fullName;
        this.idTable = idTable;
        this.numberPerson = numberPerson;
        this.dateService = dateService;
        this.restaurant = restaurant;
        this.beverage=beverage;
        this.payment=payment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws IllegalArgumentException{
        if (fullName.length()<3)
            throw new IllegalArgumentException("Name cannot be less than 3!");
        this.fullName = fullName;
    }

    public String getIdTable() {
        return idTable;
    }

    public void setIdTable(String idTable)throws IllegalArgumentException {
        if (idTable.length()<2&&idTable.length()>5)
            throw new IllegalArgumentException("Id Table cannot less than 2 and larger than 5");
        this.idTable = idTable;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public LocalDate getDateService() {
        return dateService;
    }

    public void setDateService(LocalDate dateService) {
        this.dateService = dateService;
    }

    public RestaurantFood getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantFood restaurant) {
        this.restaurant = restaurant;
    }

    public Optional<RestaurantBeverage> getBeverage() {
        return Optional.ofNullable(beverage);
    }

    public void setBeverage(RestaurantBeverage beverage) {
        this.beverage = beverage;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }
    public abstract void CalculateBill();



    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +
                ", idTable='" + idTable + '\'' +
                ", numberPerson=" + numberPerson +
                ", dateService=" + dateService +
                ", restaurant=" + restaurant +
                ", paymentMethod"+ payment
               ;
    }



}
