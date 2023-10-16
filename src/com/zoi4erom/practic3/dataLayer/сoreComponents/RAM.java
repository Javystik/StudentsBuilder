package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum RAM implements FeatureChecker { //оперативна память
     CORSAIR_VENGEANCE("Corsair", "Vengeance", "DDR4", "32GB", 3200, 150, 650),
     KINGSTON_HYPERX("Kingston", "HyperX", "DDR4", "16GB", 3600, 80, 200),
     CRUCIAL_BALLISTIX("Crucial", "Ballistix", "DDR4", "32GB", 3000, 120,270),
     G_SKILL_RIPJAWS("G.Skill", "Ripjaws", "DDR4", "64GB", 3600, 200,390),
     SAMSUNG_DDR4("Samsung", "DDR4", "DDR4", "8GB", 2400, 50,450),
     HYNIX_SODIMM("Hynix", "SODIMM", "DDR4", "16GB", 2666, 70,890);

     private String name;
     private String brand;
     private String series;
     private String type;
     private int capacity;
     private int speed;
     private int cost;

     RAM(String name, String brand, String series, String type, int capacity, int speed, int cost) {
          this.name = name;
          this.brand = brand;
          this.series = series;
          this.type = type;
          this.capacity = capacity;
          this.speed = speed;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSeries() {
          return series;
     }

     public String getType() {
          return type;
     }

     public int getCapacity() {
          return capacity;
     }

     public int getSpeed() {
          return speed;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Series: " + series +
                  ", Type: " + type +
                  ", Capacity: " + capacity +
                  ", Speed: " + speed + " MHz" +
                  ", Price: " + cost + "$";
     }
}