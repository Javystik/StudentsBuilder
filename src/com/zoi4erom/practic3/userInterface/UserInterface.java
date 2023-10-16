package com.zoi4erom.practic3.userInterface;

import com.zoi4erom.practic3.businessLogic.CreateComputer;

import java.util.Scanner;

import static com.zoi4erom.practic3.businessLogic.CreateComputer.cost;

public class UserInterface {
     static int choise;
     Scanner in = new Scanner(System.in);
     CreateComputer createComputer = new CreateComputer();
     public void runner(){
          userChoise();
     }
     public void userChoise() {
          while (true) {
               System.out.println("Програма для створення кастомної збірки від Zoi4erom!");
               System.out.println("Для подальшої роботи програми оберіть дію:");
               System.out.println("1) Основні компоненти");
               System.out.println("2) Опційні компоненти");
               System.out.println("3) Створення збірки");
               System.out.println("4) Вихід");
               System.out.print("Ваш вибір: ");

               choise = in.nextInt();
               switch (choise) {
                    case 1:
                         System.out.println("Основні компоненти:");
                         coreComponents();
                         break;
                    case 2:
                         System.out.println("Опційні компоненти:");
                         helperComponents();
                         break;
                    case 3:
                         System.out.println("Створення збірки:");
                         createComputer();
                         break;
                    case 4:
                         return;
               }
          }
     }

     public void coreComponents(){
          createComputer.buildCoreComponents();
     }
     public void helperComponents() {
          while (true) {
               System.out.println("1) Клавіатура");
               System.out.println("2) Миша");
               System.out.println("3) Монітор");
               System.out.println("4) Освітлення");
               System.out.println("5) Динамік");
               System.out.println("6) Повернутися до головного меню");

               System.out.print("Оберіть номер опційного компонента (або 6 для повернення): ");
               int option = in.nextInt();

               if (option == 6) {
                    break;
               }

               switch (option) {
                    case 1:
                         createComputer.buildKeyboard();
                         break;
                    case 2:
                         createComputer.buildMouse();
                         break;
                    case 3:
                         createComputer.buildMonitor();
                         break;
                    case 4:
                         createComputer.buildLighting();
                         break;
                    case 5:
                         createComputer.buildSpeaker();
                         break;
                    default:
                         System.out.println("Недійсний вибір");
               }
          }
     }
     public void createComputer(){
          System.out.println("Ціна вашої кастомної збірки: " + cost + "$" + "\nВибрані вами компоненти:");
          createComputer.buildComputer();
     }
}
