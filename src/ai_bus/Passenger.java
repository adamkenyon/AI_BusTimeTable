/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_bus;

/**
 *
 * @author 1314994
 */
public class Passenger {
    static int[] routeTotals = new int[3];
    static int passengerPerStop = 125;
    static int passengerNumber = 100;
     
    //Constructor
     public Passenger(String name){
         
     }
     
     public static void main(String []args){
         Passenger passenger = new Passenger("Fred");
     }
     
     public static void createPassengers() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 3; x++) {
                    int route = Route.routes[x][y].type;
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
        System.out.print("\n");
    }
     
}
