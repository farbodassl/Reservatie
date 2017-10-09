/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaties;

/**
 *
 * @author hamidf
 */
public class Lid {
    private String naam;
    private String telefoon;
    private static double lidgeld = 25;
    
    public Lid(String naam,String telefoon){
        this.naam = naam;
        this.telefoon = telefoon;
    }
}
