/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mib;


import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Simon
 */
public class MiB {

     private static InfDB idb;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
           System.out.println("db-koppling skapad");
           Inloggning in = new Inloggning();
           in.setVisible(true);
       } catch (InfException ex){
           Logger.getLogger(MiB.class.getName()).log(Level.SEVERE, null, ex);
       }        // TODO code application logic here
    }
    
}
