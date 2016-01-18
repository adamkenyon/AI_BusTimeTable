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
static int[][] busRoutesArray = new int [3][5]; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createRoutes();
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
        
    }
    
    public static void createBuses() {
    //4 Buses    
    }
    
    public static void assignBuses() {
    
    }
    
}
