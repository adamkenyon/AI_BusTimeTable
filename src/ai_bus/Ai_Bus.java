/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_bus;

/**
 *
 * @author 1314798
 */
public class Ai_Bus {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Route.createRoutes();
        Passenger.createPassengers();
        printResults();
    }
    
    public static void printResults() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(Route.routes[x][y].type);
            }
            System.out.print(" / ");
        }
    }
   
    public static void createBuses() {
        //4 Buses 
    }

    public static void assignBuses() {
       

        //4 Buses    
    }

}
