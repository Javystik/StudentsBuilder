package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum HardDrive implements FeatureChecker { //жорсткі диски
     SAMSUNG_970_EVO("SAMSUNG 970 EVO","Samsung", "970 EVO", "NVMe SSD", 1000, 220),
     WESTERN_DIGITAL_BLACK("WESTERN DIGITAL BLACK","Western Digital", "Black", "HDD", 4000, 150),
     SEAGATE_BARRACUDA("SEAGATE BARRACUDA","Seagate", "Barracuda", "HDD", 2000, 100),
     KINGSTON_A2000("KINGSTON A2000","Kingston", "A2000", "NVMe SSD", 500, 80),
     CRUCIAL_MX500("CRUCIAL MX500","Crucial", "MX500", "SATA SSD", 1000, 120),
     TOSHIBA_P300("TOSHIBA P300","Toshiba", "P300", "HDD", 3000, 90);

     private String name;
     private String brand;
     private String model;
     private String type;
     private int capacityGB;
     private int cost;

     HardDrive(String name, String brand, String model, String type, int capacityGB, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.type = type;
          this.capacityGB = capacityGB;
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

     public String getType() {
          return type;
     }

     public int getCapacityGB() {
          return capacityGB;
     }

     public int getPrice() {
          return cost;
     }


     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Name: " + name +
                  ", Brand: " + brand +
                  ", Model: " + model +
                  ", Type: " + type +
                  ", Capacity: " + capacityGB + " GB" +
                  ", Price: " + cost + "$";
     }
}
