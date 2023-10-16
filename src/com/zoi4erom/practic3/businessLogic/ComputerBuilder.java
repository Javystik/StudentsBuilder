package com.zoi4erom.practic3.businessLogic;

public class ComputerBuilder {
     private String keyBoard = null;
     private String mouse= null;
     private String monitor= null;
     private String lighting= null;
     private String speaker= null;
     private String CPU= null;
     private String graphicsCard= null;
     private String hardDrive= null;
     private String motherBoard= null;
     private String RAM= null;
     private String powerSupply= null;

     public ComputerBuilder setPowerSupply(String powerSupply) {
          this.powerSupply = powerSupply;
          return this;
     }
     public String getPowerSupply() {
          return powerSupply;
     }

     public ComputerBuilder setKeyBoard(String keyBoard) {
          this.keyBoard = keyBoard;
          return this;
     }

     public ComputerBuilder setMouse(String mouse) {
          this.mouse = mouse;
          return this;
     }

     public ComputerBuilder setMonitor(String motinor) {
          this.monitor = motinor;
          return this;
     }

     public ComputerBuilder setLighting(String lighting) {
          this.lighting = lighting;
          return this;
     }

     public ComputerBuilder setSpeaker(String speaker) {
          this.speaker = speaker;
          return this;
     }

     public ComputerBuilder setCPU(String CPU) {
          this.CPU = CPU;
          return this;
     }

     public ComputerBuilder setGraphicsCard(String graphicsCard) {
          this.graphicsCard = graphicsCard;
          return this;
     }

     public ComputerBuilder setHardDrive(String hardDrive) {
          this.hardDrive = hardDrive;
          return this;
     }

     public ComputerBuilder setMotherBoard(String motherBoard) {
          this.motherBoard = motherBoard;
          return this;
     }

     public ComputerBuilder setRAM(String RAM) {
          this.RAM = RAM;
          return this;
     }

     public String getKeyBoard() {
          return keyBoard;
     }

     public String getMouse() {
          return mouse;
     }

     public String getMotinor() {
          return monitor;
     }

     public Computer build(){
          return new Computer(this);
     }

     public String getMonitor() {
          return monitor;
     }

     public String getLighting() {
          return lighting;
     }

     public String getSpeaker() {
          return speaker;
     }

     public String getCPU() {
          return CPU;
     }

     public String getGraphicsCard() {
          return graphicsCard;
     }

     public String getHardDrive() {
          return hardDrive;
     }

     public String getMotherBoard() {
          return motherBoard;
     }

     public String getRAM() {
          return RAM;
     }
}