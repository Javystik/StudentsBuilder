package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum GraphicsCard implements FeatureChecker { //відеокарти
     NVIDIA_GEFORCE_RTX_3090("NVIDIA GEFORCE RTX 3090","NVIDIA", "GeForce RTX 3090", "24 GB GDDR6X", 1695, 3500),
     AMD_RADEON_RX_6900_XT("AMD RADEON RX 6900 XT","AMD", "Radeon RX 6900 XT", "16 GB GDDR6", 2015, 1200),
     ASUS_ROG_STRIX_GTX_1660_TI("ASUS ROG STRIX GTX 1660 TI","ASUS", "ROG Strix GTX 1660 Ti", "6 GB GDDR6", 1500, 350),
     MSI_GAMING_X_TRIO_RTX_3080("MSI GAMING X TRIO RTX 3080","MSI", "Gaming X Trio RTX 3080", "10 GB GDDR6X", 1710, 800),
     GIGABYTE_AORUS_RX_5700_XT("GIGABYTE AORUS RX 5700 XT","GIGABYTE", "AORUS RX 5700 XT", "8 GB GDDR6", 1905, 450);

     private String name;
     private String brand;
     private String model;
     private String memory;
     private int baseClock;
     private int cost;

     GraphicsCard(String name, String brand, String model, String memory, int baseClock, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.memory = memory;
          this.baseClock = baseClock;
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

     public String getMemory() {
          return memory;
     }

     public int getBaseClock() {
          return baseClock;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Memory: " + memory +
                  ", Base Clock: " + baseClock + " MHz" +
                  ", Price: " + cost + "$";
     }
}
