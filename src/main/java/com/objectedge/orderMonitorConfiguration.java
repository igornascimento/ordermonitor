package com.objectedge;

import com.objectedge.base.Customer;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import java.util.List;

public class orderMonitorConfiguration extends Configuration {

//    @NotEmpty
//    private String database;

    @NotEmpty
    private List<Customer> customers;

//    @JsonProperty
//    public String getDatabase() {
//        return this.database;
//    }
//
//    @JsonProperty
//    public void setDatabase(String database) {
//        this.database = database;
//    }

    @JsonProperty
    public List<Customer> getCustomers() {
        return this.customers;
    }

    @JsonProperty
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
