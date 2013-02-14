/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.calculators;

/**
 *
 * @author Jwilliams96
 */
public class TriangleSideCalculator {
        private double sideA, sideB;

    public TriangleSideCalculator(String sideA,String sideB) {
        this.sideA = Double.valueOf(sideA);
        this.sideB = Double.valueOf(sideB);
    }
    
    public double getSide(){
        return Math.sqrt(sideA*sideA + sideB*sideB);
    }
}
