/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helenontology;

import IO.ReadFile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andres
 */
public class HelenOntology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        try {
            rf.ReadTxt("archivos/unit_ontology",".txt");
        } catch (IOException ex) {
            Logger.getLogger(HelenOntology.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
