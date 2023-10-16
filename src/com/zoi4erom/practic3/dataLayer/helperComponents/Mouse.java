package com.zoi4erom.practic3.dataLayer.helperComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Mouse implements FeatureChecker { //мишка
     Logitech_GPro_X("Logitech GPro X","Logitech", "purple", 1280),
     Razer_DeathAdder("Razer DeathAdder","Razer", "black", 380),
     SteelSeries_Rival("SteelSeries Rival","SteelSeries", "black", 480),
     Corsair_Dark_Core("Corsair Dark Core","Corsair", "dark", 980),
     Microsoft_IntelliMouse("Microsoft IntelliMouse","Microsoft", "white", 780);
     private String name;
     private String brand;
     private String color;
     private int cost;

     Mouse(String name, String brand, String color, int cost){
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
                  " | brand: " + brand +
                  " | color: " + color +
                  " | cost: " + cost + "$";
     }
}
