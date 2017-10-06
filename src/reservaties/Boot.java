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
public class Boot {
    private double basisprijs;
    private String naam;
    private boolean radar;
    
    public Boot(double basisprijs, String naam, boolean radar){
        this.basisprijs = basisprijs;
        this.naam = naam;
        this.radar = radar;
    }
    
    public double berekenPrijs(Boot boot){
        return 0.0;
    }
    
    public double getBasisprijs(){
        return basisprijs;
    }
    hello
}
