package model;

public class CardPayment extends PaymentMethod{

    public CardPayment() {
        super("PaymentCard", "2100045679821");
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "payMethod='" + getPayMethod() + '\'' +
                "idCard= "+getIdNumber()+
                '}';
    }
}
