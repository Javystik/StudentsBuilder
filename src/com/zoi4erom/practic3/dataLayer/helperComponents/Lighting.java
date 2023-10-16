package com.zoi4erom.practic3.dataLayer.helperComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum Lighting implements FeatureChecker { //підсвітка
     Philips_Hue("Philips Hue","Philips", "white", 120),
     Nanoleaf_LightPanels("Nanoleaf LightPanels","Nanoleaf", "multicolor", 150),
     LIFX_A19("LIFX A19","LIFX", "multicolor", 100),
     TP_Link_Kasa("TP Link Kasa","TP-Link", "white", 70),
     Govee_RGB_LightStrips("Govee RGB LightStrips","Govee", "multicolor", 50);

     private String name;
     private String brand;
     private String color;
     private int cost;

     Lighting(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public Lighting setName(String name) {
          this.name = name;
          return this;
     }

     public String getBrand() {
          return brand;
     }

     public Lighting setBrand(String brand) {
          this.brand = brand;
          return this;
     }

     public String getColor() {
          return color;
     }

     public Lighting setColor(String color) {
          this.color = color;
          return this;
     }

     public int getCost() {
          return cost;
     }

     public Lighting setCost(int cost) {
          this.cost = cost;
          return this;
     }
     public String getAllFeatures(){
          return "Name: " + name +
                  ", brand: " + brand +
                  ", color: " + color +
                  ", cost: " + cost + "$";
     }
}
