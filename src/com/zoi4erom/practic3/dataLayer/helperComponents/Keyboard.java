package com.zoi4erom.practic3.dataLayer.helperComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Keyboard implements FeatureChecker { //клавіатура
     Corsair_K95_Platinum("Corsair K95 Platinum","Corsair", "black", 500),
     Logitech_GPro_X("Logitech GPro X","Logitech", "white", 980),
     Razer_BlackWidow("Razer BlackWidow","Razer", "black", 420),
     SteelSeries_Apex_Pro("SteelSeries Apex Pro","SteelSeries", "white", 740),
     ASUS_ROG_Strix_Flare("ASUS ROG Strix Flare","ASUS", "black", 1500);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Keyboard(String name, String brand, String color, int cost){
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
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

     public String getName() {
          return name;
     }

     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}