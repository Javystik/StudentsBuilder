package com.zoi4erom.practic3.businessLogic;

public class Computer {
     private String keyBoard;
     private String mouse;
     private String monitor;
     private String lighting;
     private String speaker;
     private String CPU;
     private String graphicsCard;
     private String hardDrive;
     private String motherBoard;
     private String RAM;
     private String powerSupply;

     Computer(ComputerBuilder computerBuilder) {
          this.keyBoard = computerBuilder.getKeyBoard();
          this.mouse = computerBuilder.getMouse();
          this.monitor = computerBuilder.getMotinor();
          this.lighting = computerBuilder.getLighting();
          this.speaker = computerBuilder.getSpeaker();
          this.CPU = computerBuilder.getCPU();
          this.graphicsCard = computerBuilder.getGraphicsCard();
          this.hardDrive = computerBuilder.getHardDrive();
          this.motherBoard = computerBuilder.getMotherBoard();
          this.RAM = computerBuilder.getRAM();
          this.powerSupply = computerBuilder.getPowerSupply();
     }
     Computer() {
          throw new RuntimeException("Клас Computer має бути створений за допомогою білдера.");
     }

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("CPU: ").append(CPU).append("\nGraphics Card: ").append(graphicsCard).append("\nHard Drive: ").append(hardDrive)
                  .append("\nMotherboard: ").append(motherBoard).append("\nRAM: ").append(RAM).append("\nPowerSupply: ").append(powerSupply);

          if (keyBoard != null) {
               sb.append("\nKeyboard: ").append(keyBoard);
          }
          if (mouse != null) {
               sb.append("\nMouse: ").append(mouse);
          }
          if (monitor != null) {
               sb.append("\nMonitor: ").append(monitor);
          }
          if (speaker != null) {
               sb.append("\nSpeaker: ").append(speaker);
          }
          if (lighting != null) {
               sb.append("\nLighting: ").append(lighting);
          }

          return sb.toString();
     }
}
