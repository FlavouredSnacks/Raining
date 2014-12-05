/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raining;

import environment.ApplicationStarter;

/**
 *
 * @author Slugs
 */
public class Raining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Rain Drops Keep Falling On Head", new RainEnvironment());
    }
    
}
