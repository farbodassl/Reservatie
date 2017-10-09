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
public class Reservatie {
    private double aantalUren;
    private Boot boot;
    private Lid lid;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Reservatie(double aantalUren,Boot boot,Lid lid){
        this.aantalUren = aantalUren;
        this.boot = boot;
        this.lid = lid;
    }
    
    public double berekenPrijs(Boot boot){
        double prijs = boot.berekenPrijs() * aantalUren;
        
    }
}
