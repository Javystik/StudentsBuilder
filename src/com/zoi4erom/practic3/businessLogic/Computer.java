package com.zoi4erom.practic3.businessLogic;

public class Computer {
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
