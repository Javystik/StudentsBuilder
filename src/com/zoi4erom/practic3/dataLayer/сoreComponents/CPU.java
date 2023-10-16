package com.zoi4erom.practic3.dataLayer.сoreComponents;

import com.zoi4erom.practic3.businessLogic.FeatureChecker;

public enum CPU implements FeatureChecker { //процесора
     INTEL("Intel", "Core i9", "3.6 GHz", 8, 16, 500),
     RYZEN("Ryzen", "Ryzen 9 5950X", "4.9 GHz", 16, 32, 450),
     ARM("ARM", "Cortex-A76", "2.8 GHz", 8, 8, 200),
     APPLE_M1("Apple M1", "M1", "3.2 GHz", 8, 8, 600),
     QUALCOMM("Qualcomm", "Snapdragon 888", "2.84 GHz", 8, 24, 300),
     IBM_POWER("IBM Power", "POWER9", "3.8 GHz", 12, 24, 800),
     NVIDIA_TEGRA("NVIDIA Tegra", "X1", "1.9 GHz", 4, 4, 150);

     private String name;
     private String model;
     private String clockSpeed;
     private int cores;
     private int threads;
     private int cost;

     CPU(String name, String model, String clockSpeed, int cores, int threads, int cost) {

          this.name = name;
          this.model = model;
          this.clockSpeed = clockSpeed;
          this.cores = cores;
          this.threads = threads;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getModel() {
          return model;
     }

     public String getClockSpeed() {
          return clockSpeed;
     }

     public int getCores() {
          return cores;
     }

     public int getThreads() {
          return threads;
     }

     public int getCost() {
          return cost;
     }

     public String getAllFeatures() {
          return "Brand: " + name +
                  ", Model: " + model +
                  ", Clock Speed: " + clockSpeed +
                  ", Cores: " + cores +
                  ", Threads: " + threads +
                  ", Price: " + cost + "$";
     }
}
