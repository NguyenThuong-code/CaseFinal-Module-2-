package model;

public class RestaurantFood {
    private String typeFood;
    private Double priceBuffet;

    public RestaurantFood() {
    }

    public RestaurantFood(String typeFood, Double priceBuffet) {
        this.typeFood = typeFood;
        this.priceBuffet = priceBuffet;
    }

    public String getTypeBuffet() {
        return typeFood;
    }

    public void setTypeBuffet(String typeBuffet) {
        this.typeFood = typeBuffet;
    }

    public Double getPriceBuffet() {
        return priceBuffet;
    }

    public void setPriceBuffet(Double priceBuffet) {
        this.priceBuffet = priceBuffet;
    }
}
