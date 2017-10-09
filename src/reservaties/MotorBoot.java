/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaties;

/**
 *
 * @author hamid
 */
public class MotorBoot extends Boot {
    private boolean fishfinder;
    private static double verhuurprijs = 25;
    private double toeslag = 0;

    public MotorBoot(double basisprijs, String naam, boolean radar,boolean fish) {
        super(basisprijs, naam, radar);
        fishfinder = fish;
        basisprijs = verhuurprijs;
        if(radar){
            toeslag+=0.05;
        }
        if(fish){
            toeslag+=0.07;
        }
    }
    
    public double berekenPrijs(Boot boot){
        double prijs;
        prijs = boot.getBasisprijs() * (1+toeslag);
        return prijs;
    }
    
}
