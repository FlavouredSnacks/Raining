/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raining;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Slugs
 */
public final class RainDrop {

    private Point position;
    private boolean visible;

    private int red;
    private int green;
    private int blue;
    private int opacity;
    private int fadeRate = 1;

    private int radius;
    private int spreadRate = 5;

    private int MIN_COLOR = 0;
    private int MAX_COLOR = 255;

    public RainDrop(int red, int green, int blue, int opacity, int radius, Point position) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setOpacity(opacity);

        this.setRadius(radius);
        this.setPosition(position);
        this.setVisible(true);
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    private int validateColorComponent(int colorComponent) {
        if (colorComponent < MIN_COLOR) {
            return MIN_COLOR;
        } else if (colorComponent > MAX_COLOR) {
            return MAX_COLOR;
        } else {
            return colorComponent;
        }
    }

    public void draw(Graphics graphics) {
        graphics.setColor(this.getColor());
        graphics.fillOval(this.position.x - radius, this.position.y - radius, radius * 2, radius * 2);
    }

    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        this.red = validateColorComponent(red);
    }

    /**
     * @return the green
     */
    public int getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(int green) {
        this.green = validateColorComponent(green);
    }

    /**
     * @return the blue
     */
    public int getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(int blue) {
        this.blue = validateColorComponent(blue);
    }

    /**
     * @return the opacity
     */
    public int getOpacity() {
        return opacity;
    }

    /**
     * @param opacity the opacity to set
     */
    public void setOpacity(int opacity) {
        this.opacity = validateColorComponent(opacity);
    }

    /**
     * @return the fadeRate
     */
    public int getFadeRate() {
        return fadeRate;
    }

    /**
     * @param fadeRate the fadeRate to set
     */
    public void setFadeRate(int fadeRate) {
        this.fadeRate = fadeRate;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the spreadRate
     */
    public int getSpreadRate() {
        return spreadRate;
    }

    /**
     * @param spreadRate the spreadRate to set
     */
    public void setSpreadRate(int spreadRate) {
        this.spreadRate = spreadRate;
    }

    /**
     * @return the MIN_COLOR
     */
    public int getMIN_COLOR() {
        return MIN_COLOR;
    }

    /**
     * @param MIN_COLOR the MIN_COLOR to set
     */
    public void setMIN_COLOR(int MIN_COLOR) {
        this.MIN_COLOR = MIN_COLOR;
    }

    /**
     * @return the MAX_COLOR
     */
    public int getMAX_COLOR() {
        return MAX_COLOR;
    }

    /**
     * @param MAX_COLOR the MAX_COLOR to set
     */
    public void setMAX_COLOR(int MAX_COLOR) {
        this.MAX_COLOR = MAX_COLOR;
    }

    private Color getColor() {
        return new Color(red, green, blue, opacity);
    }

    public void grow() {
        this.radius += this.spreadRate;
    }

    public void fade() {
        setOpacity(opacity - fadeRate);
    }

}
