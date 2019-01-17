package com.objectedge;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import java.util.List;

public class orderMonitorConfiguration extends Configuration {

    @NotEmpty
    private String database;

    @NotEmpty
    private List<String> customers;

    @JsonProperty
    public String getDatabase() {
        return this.database;
    }

    @JsonProperty
    public void setDatabase(String database) {
        this.database = database;
    }

    @JsonProperty
    public List<String> getCustomers() {
        return this.customers;
    }

    @JsonProperty
    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

}
