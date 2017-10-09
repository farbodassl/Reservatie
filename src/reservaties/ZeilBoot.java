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
public class ZeilBoot extends Boot{
    private boolean gps;
    private static double verhuurprijs = 50;
    private double toeslag = 0;

    public ZeilBoot(double basisprijs, String naam, boolean radar,boolean gps) {
        super(basisprijs, naam, radar);
        this.gps = gps;
        basisprijs = verhuurprijs;
        if(gps){
            toeslag+=0.03;
        }
        if(radar){
            toeslag+=0.05;
        }
    }
    
    public double berekenPrijs(Boot boot){
        double prijs;
        prijs = boot.getBasisprijs()* (1+toeslag);
        return prijs;
    }
    
   
}
