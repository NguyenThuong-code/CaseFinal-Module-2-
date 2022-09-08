package model;

public class MomoPayment extends PaymentMethod{

    public MomoPayment() {
        super("PaymentMomo", "0364951619");

    }
    @Override
    public String toString() {
        return "PaymentMethod{" +
                "payMethod='" + getPayMethod()+ '\'' +
                "phoneNumber= "+getIdNumber()+
                '}';
    }
}
