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

    public ZeilBoot(double basisprijs, String naam, boolean radar) {
        super(basisprijs, naam, radar);
    }
    
    public double berekentPrijs(Boot boot){
        double prijs;
        if(gps){
            prijs = boot.getBasisprijs() * 1.03;
        }
       else
        {
            prijs = boot.getBasisprijs();
        }
        return prijs;
    }
}
