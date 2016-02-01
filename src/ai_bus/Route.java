/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_bus;
import java.util.Random;
/**
 *
 * @author 1314994
 */
public class Route {
    //Represents the routes. Holds a number of BusStop objects.
    static BusStop[][] routes;
    
    static int[][] busRoutesArray = new int[3][5];
    
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
            int type = randomGenerator.nextInt(3);
            //busRoutesArray[routeNumber][i] = randomInt;
            routes[routeNumber][i] = new BusStop();
        }
    }
}
