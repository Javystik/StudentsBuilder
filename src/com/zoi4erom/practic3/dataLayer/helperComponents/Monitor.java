package com.zoi4erom.practic3.dataLayer.helperComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Monitor implements FeatureChecker { //монітор
     ASUS_TUF_GAMING("ASUS TUF Gaming", "ASUS", "27-inch", "1920x1080", 520),
     DELL_UltraSharp("DELL UltraSharp", "DELL", "24-inch", "2560x1440", 380),
     LG_UltraGear("LG UltraGear", "LG", "32-inch", "3840x2160", 800),
     HP_Pavilion("HP Pavilion", "HP", "27-inch", "1920x1080", 250),
     Acer_Predator("Acer Predator", "Acer", "35-inch", "3440x1440", 950);

     private String name;
     private String brand;
     private String size;
     private String resolution;
     private int cost;

     Monitor(String name, String brand, String size, String resolution, int cost) {
          this.name = name;
          this.brand = brand;
          this.size = size;
          this.resolution = resolution;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSize() {
          return size;
     }

     public String getResolution() {
          return resolution;
     }

     public int getCost() {
          return cost;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + size +
                  ", resolution: " + resolution +
                  ", cost: " + cost + "$";
     }
}
