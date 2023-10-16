package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum PowerSupply implements FeatureChecker { //блок живлення
     CORSAIR_RM850X("CORSAIR_RM850X","Corsair", "RM850X", "850W", "80+ Gold", 150),
     EVGA_SUPERNOVA_750("CORSAIR_RM850X","EVGA", "SuperNOVA 750", "750W", "80+ Platinum", 170),
     SEASONIC_FOCUS_PLUS_GOLD_650("CORSAIR_RM850X","Seasonic", "Focus Plus Gold 650", "650W", "80+ Gold", 100),
     THERMALTAKE_TOUGHPOWER_GRAND_RGB_850("CORSAIR_RM850X","Thermaltake", "Toughpower Grand RGB 850", "850W", "80+ Platinum", 200),
     COOLER_MASTER_MWE_750_GOLD("CORSAIR_RM850X","Cooler Master", "MWE 750 Gold", "750W", "80+ Gold", 120);

     private String name;
     private String brand;
     private String model;
     private String wattage;
     private String efficiency;
     private int cost;

     PowerSupply(String name, String brand, String model, String wattage, String efficiency, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.wattage = wattage;
          this.efficiency = efficiency;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public void setWattage(String wattage) {
          this.wattage = wattage;
     }

     public void setEfficiency(String efficiency) {
          this.efficiency = efficiency;
     }

     public void setCost(int cost) {
          this.cost = cost;
     }

     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public String getWattage() {
          return wattage;
     }

     public String getEfficiency() {
          return efficiency;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Wattage: " + wattage +
                  ", Efficiency: " + efficiency +
                  ", Cost: " + cost + "$";
     }
}
