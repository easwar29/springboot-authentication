package com.test.authentication.domain;

import java.util.List;

public class Account {

    private String name;

    private String description;

    private List<Customer> customers;

    private String aggregatedRevenue;

    private String ownedBy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getAggregatedRevenue() {
        return aggregatedRevenue;
    }

    public void setAggregatedRevenue(String aggregatedRevenue) {
        this.aggregatedRevenue = aggregatedRevenue;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }
}
