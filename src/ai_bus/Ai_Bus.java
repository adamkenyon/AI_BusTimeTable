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
<<<<<<< HEAD
    static int routeOneTotal = 0;
    static int routeTwoTotal = 0;
    static int routeThreeTotal = 0;
    static int passengerPerStop = 125;
=======
    static int passengerNumber = 100;
    static int[] routeTotals = new int[3];
    static int routeOneTotal = 0;
    static int routeTwoTotal = 0;
    static int routeThreeTotal = 0;
>>>>>>> origin/master

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
<<<<<<< HEAD
            if (busRoutesArray[0][y] == 0) {
                routeOneTotal = routeOneTotal + (passengerPerStop - 75);
            } else if (busRoutesArray[0][y] == 1) {
                routeOneTotal = routeOneTotal + passengerPerStop;
            } else if (busRoutesArray[0][y] == 2) {
                routeOneTotal = routeOneTotal + (passengerPerStop + 75);
            }
            if (busRoutesArray[1][y] == 0) {
                routeTwoTotal = routeTwoTotal + (passengerPerStop - 75);
            } else if (busRoutesArray[1][y] == 1) {
                routeTwoTotal = routeTwoTotal + passengerPerStop;
            } else if (busRoutesArray[1][y] == 2) {
                routeTwoTotal = routeTwoTotal + (passengerPerStop + 75);
            }
            if (busRoutesArray[2][y] == 0) {
                routeThreeTotal = routeThreeTotal + (passengerPerStop - 75);
            } else if (busRoutesArray[2][y] == 1) {
                routeThreeTotal = routeThreeTotal + passengerPerStop;
            } else if (busRoutesArray[2][y] == 2) {
                routeThreeTotal = routeThreeTotal + (passengerPerStop + 75);
            }
        }
        System.out.print("Route One Passenger Count = " + routeOneTotal);
        System.out.print("\n");
        System.out.print("Route Two Passenger Count = " + routeTwoTotal);
        System.out.print("\n");
        System.out.print("Route Three Passenger Count = " + routeThreeTotal);
=======
            for (int x = 0; x < 3; x++) {
                    int route = busRoutesArray[x][y];
                    switch (route) {
                        case 0: routeTotals[x] += (passengerNumber - 75);
                            break;
                        case 1: routeTotals[x] += (passengerNumber);
                            break;
                        case 2: routeTotals[x] += (passengerNumber + 75);    
                    }
                }
        }
        System.out.print("Route One Total = " + routeTotals[0] + " / ");
        System.out.print("Route Two Total = " + routeTotals[1] + " / ");
        System.out.print("Route Three Total = " + routeTotals[2]+ " / ");
>>>>>>> origin/master
        System.out.print("\n");
    }

    public static void createBuses() {
<<<<<<< HEAD
        //4 Buses 
    }

    public static void assignBuses() {
       
=======
        //4 Buses    
    }

    public static void assignBuses() {

>>>>>>> origin/master
    }

}
