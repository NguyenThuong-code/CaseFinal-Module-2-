package model.entity;

import java.io.Serializable;

public class RestaurantBeverage implements Serializable {
  private String beverageName;
  private Double beveragePrice;

    public RestaurantBeverage() {
    }

    public RestaurantBeverage(String beverageName, Double beveragePrice) {
        this.beverageName = beverageName;
        this.beveragePrice = beveragePrice;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public Double getBeveragePrice() {
        return beveragePrice;
    }

    public void setBeveragePrice(Double beveragePrice) {
        this.beveragePrice = beveragePrice;
    }

    @Override
    public String toString() {
        return "RestaurantBeverage{" +
                "beverageName='" + beverageName + '\'' +
                ", beveragePrice=" + beveragePrice +
                '}';
    }
}
