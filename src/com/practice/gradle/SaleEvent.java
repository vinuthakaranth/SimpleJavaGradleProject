package com.practice.gradle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SaleEvent {

    private String id;
    private String streetAddress;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SaleEvent{" +
                "id='" + id + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setId("100");
        saleEvent.setStreetAddress("123 Westcott.");
        saleEvent.setCity("NewYork");

        System.out.println(saleEvent.toString());

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(saleEvent);
        System.out.println(json);
    }
}
