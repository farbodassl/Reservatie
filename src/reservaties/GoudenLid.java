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
public class GoudenLid extends Lid{
    private int aantalAandelen;
    private final double korting = 0.05;
    
    public GoudenLid(String naam, String telefoon, int aandelen) {
        super(naam, telefoon);
        aantalAandelen = aandelen;
    }
    
}
