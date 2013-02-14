/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.calculators;

/**
 *
 * @author Jwilliams96
 */
public class RectangleAreaCalculator {
    private double height, width;

    public RectangleAreaCalculator(String height, String width) {
        this.height = Double.valueOf(height);
        this.width = Double.valueOf(width);
    }
    
    public double getArea(){
        return width * height;
    }
}
