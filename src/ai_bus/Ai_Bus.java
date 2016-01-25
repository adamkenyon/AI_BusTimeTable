/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_bus;

import java.util.Random;

/**
 *
 * @author 1314798
 */
public class Ai_Bus {

    static int[][] busRoutesArray = new int[3][5];
    static int passengerNumber = 100;
    static int routeOneTotal = 0;
    static int routeTwoTotal = 0;
    static int routeThreeTotal = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createRoutes();
        createPassengers();
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(busRoutesArray[x][y]);
            }
            System.out.print(" / ");
        }
    }

    public static void createRoutes() {
        //3 Routes
        createStops(0);
        createStops(1);
        createStops(2);
    }

    public static void createStops(int routeNumber) {
        //5 Stops
        /*
         Stop type 0 = Low Population (75 decrease)    
         Stop type 1 = Medium Population (No Change)
         Stop type 2 = High Population (75 increase)
         */
        for (int i = 0; i < 5; i++) {
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(3);
            busRoutesArray[routeNumber][i] = randomInt;

        }
    }

    public static void createPassengers() {
        for (int y = 0; y < 5; y++) {
            if (busRoutesArray[0][y] == 0) {
                routeOneTotal = routeOneTotal + (passengerNumber - 75);
            } else if (busRoutesArray[0][y] == 1) {
                routeOneTotal = routeOneTotal + passengerNumber;
            } else if (busRoutesArray[0][y] == 2) {
                routeOneTotal = routeOneTotal + (passengerNumber + 75);
            }
            if (busRoutesArray[1][y] == 0) {
                routeTwoTotal = routeTwoTotal + (passengerNumber - 75);
            } else if (busRoutesArray[1][y] == 1) {
                routeTwoTotal = routeTwoTotal + passengerNumber;
            } else if (busRoutesArray[1][y] == 2) {
                routeTwoTotal = routeTwoTotal + (passengerNumber + 75);
            }
            if (busRoutesArray[2][y] == 0) {
                routeThreeTotal = routeThreeTotal + (passengerNumber - 75);
            } else if (busRoutesArray[2][y] == 1) {
                routeThreeTotal = routeThreeTotal + passengerNumber;
            } else if (busRoutesArray[2][y] == 2) {
                routeThreeTotal = routeThreeTotal + (passengerNumber + 75);
            }
        }
        System.out.print("Route One Total = " + routeOneTotal + " / ");
        System.out.print("Route Two Total = " + routeTwoTotal + " / ");
        System.out.print("Route Three Total = " + routeThreeTotal + " / ");
        System.out.print("\n");
    }

    public static void createBuses() {
        //4 Buses    
    }

    public static void assignBuses() {

    }

}
