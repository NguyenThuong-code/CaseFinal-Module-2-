package model;

public class PaymentMethod {
  private String payMethod;
 private String idNumber;
    public PaymentMethod() {
    }

    public PaymentMethod(String payMethod) {
        this.payMethod=payMethod;
    }

    public PaymentMethod(String payMethod,String idNumber) {
        this.payMethod = payMethod;
        this.idNumber=idNumber;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "payMethod='" + payMethod + '\'' +
                '}';
    }
}
