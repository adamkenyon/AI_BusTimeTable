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
    //static BusStop[][] routes;
    static BusStop[][] routes = new BusStop[3][5];
    
    //static int[][] busRoutesArray = new int[3][5];
    
    public static void createRoutes() {
        //3 Routes
        //createStops(0);
        //createStops(1);
        //createStops(2);
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 3; x++) {
                Random randomGenerator = new Random();
                int rand = randomGenerator.nextInt(3);
                routes[x][y] = new BusStop(rand);
                System.out.print(routes[x][y].type);
            }
        }
    }
    
 
}
