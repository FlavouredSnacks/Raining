/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raining;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Slugs
 */
class RainEnvironment extends Environment {
    private ArrayList<RainDrop> drops;

    public RainEnvironment() {
    }

    @Override
    public void initializeEnvironment() {
        this.setBackground(Color.WHITE);
        this.drops = new ArrayList<>();
    }

    private final int defaultRed = 0;
    private final int defaultGreen = 200;
    private final int defaultBlue = 200;
    private final int defaultOpacity = 200;
    private final int defaultRadius = 5;

    private void addDrop(){
        drops.add(new RainDrop(defaultRed, defaultGreen, defaultBlue, defaultOpacity, defaultRadius, getRandomPoint()));
    }
    
    private Point getRandomPoint(){
        return new Point( (int) (Math.random() * this.getWidth()),  (int) (Math.random() * this.getHeight()) );
    }
    
    @Override
    public void timerTaskHandler() {
        if (Math.random() > .99) {
            
        }
        
        for (RainDrop drop: drops){
            drop.grow();
            drop.grow();
            drop.grow();
            drop.grow();
            drop.fade();
            drop.fade();
            drop.fade();
            drop.fade();
            drop.fade();
            drop.fade();
            drop.fade();
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        addDrop();
     
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        for (RainDrop drop: drops){
            drop.draw(graphics);
        }
    }
    
}
