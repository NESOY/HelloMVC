package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NESOY on 2017-01-10.
 */
public class CustomerService {
    private Map<String, Customer> customers;

    public CustomerService() {
        this.customers = new HashMap<String, Customer>();

        addCustomer( new Customer("id001","Alice","alice.hansung.ac.kr"));
        addCustomer( new Customer("id002","Alice2","alice2.hansung.ac.kr"));
        addCustomer( new Customer("id003","Alice3","alice3.hansung.ac.kr"));
        addCustomer( new Customer("id004","Alice4","alice4.hansung.ac.kr"));
        addCustomer( new Customer("id005","Alice5","alice5.hansung.ac.kr"));
    }

    public void addCustomer(Customer customer){
        customers.put(customer.getId(),customer);
    }
    public Customer findCustomer(String id){
        if(id != null) {
            return this.customers.get(id.toLowerCase());
        }
        else{
            return null;
        }
    }
}
