package controller;

import model.entity.Customer;

import java.util.Comparator;

public class ManageCustomerAlphabet implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
       return o1.getFullName().compareTo(o2.getFullName());
    }
}
