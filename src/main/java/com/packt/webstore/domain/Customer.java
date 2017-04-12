package com.packt.webstore.domain;

import java.io.Serializable;

/**
 * Created by bipul on 11/4/17.
 */

public class Customer implements Serializable{

    private static final long serialVersionUID = 519120743943282354L;
    private String customerId;
    private String name;
    private String address;
    private long noOfOrdersMade;

    public Customer(){
        super();
    }

    public Customer(String customerId,String name,String address,long noOfOrdersMade){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(long noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }
}


