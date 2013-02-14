/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.calculators;

/**
 *
 * @author Jwilliams96
 */
public class CircleAreaCalculator {
    private double radius;

    public CircleAreaCalculator(String radius) {
        this.radius = Double.valueOf(radius);
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
}
