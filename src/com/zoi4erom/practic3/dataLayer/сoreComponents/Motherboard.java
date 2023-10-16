package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Motherboard implements FeatureChecker { //материнські плати
     ASUS_ROG_CROSSHAIR_VIII("ASUS", "ROG Crosshair VIII", "ATX", "AM4", 250,250),
     MSI_B450_TOMAHAWK("MSI", "B450 Tomahawk", "ATX", "AM4", 120,700),
     GIGABYTE_AORUS_X570("GIGABYTE", "AORUS X570", "ATX", "AM4", 200,950),
     ASROCK_B550_STEEL_LEGEND("ASRock", "B550 Steel Legend", "ATX", "AM4", 130,250),
     MSI_MAG_B560M("MSI", "MAG B560M", "Micro-ATX", "LGA 1200", 90,550),
     ASUS_PRIME_H410M("ASUS", "PRIME H410M", "Micro-ATX", "LGA 1200", 70, 750);

     private String name;
     private String brand;
     private String model;
     private String formFactor;
     private int socket;
     private int cost;

     Motherboard(String name, String brand, String model, String formFactor, int socket, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.formFactor = formFactor;
          this.socket = socket;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public String getFormFactor() {
          return formFactor;
     }

     public int getSocket() {
          return socket;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Form Factor: " + formFactor +
                  ", Socket: " + socket +
                  ", Price: " + cost + "$";
     }
}
