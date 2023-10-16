package com.zoi4erom.practic3.dataLayer.helperComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Speaker implements FeatureChecker { //динаміки
     Bose_Companion_2("Bose Companion 2", "Bose", "black", 360),
     Logitech_Z623("Logitech Z623", "Logitech", "black", 450),
     Creative_Pebble("Creative Pebble", "Creative", "white", 400),
     JBL_Flip_5("JBL Flip 5", "JBL", "blue", 120),
     Harman_Kardon_Onyx_Studio("Harman Kardon Onyx Studio", "Harman Kardon", "black", 500);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Speaker(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getColor() {
          return color;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
