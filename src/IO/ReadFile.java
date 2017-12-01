/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import helenontology.proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author andres
 */
public class ReadFile {
    
     public void ReadTxt(String archivo,String ext) throws FileNotFoundException, IOException {
        proyecto p = new proyecto();
        String cadena;
        BufferedWriter bw;
        FileReader f = new FileReader(archivo+ext); 
        //bw = new BufferedWriter(new FileWriter(archivo+"_IDs"+ext));
        PrintWriter pw = new PrintWriter(archivo+"_IDs"+ext);
        PrintWriter pw2 = new PrintWriter(archivo+"_is_a"+ext);

         try (BufferedReader b = new BufferedReader(f)) {
             int i = 0;
             while((cadena = b.readLine())!=null) {
                 //if(cadena.compareTo("[Term]")==0){
                   if(cadena.contains("id:")){
                       if(!cadena.contains("alt_id:")){
                           
                       
//                    p.setId(b.readLine());
//                    p.setName(b.readLine());
//                    i++;
//                    System.out.println(i+" "+p.getId()+"  "+"  "+p.getName());
//                    pw.write(p.getId()+"\t"+p.getName()+"\n");
                        i++;
                        p.setId(cadena);
                       }
                    
                   }
                   if(cadena.contains("name:")){
                       p.setName(cadena);
                       pw.write(p.getId()+"\t"+p.getName()+"\n");
                   }
                   if(cadena.contains("is_a:")){
                       
                           p.setIs_a(cadena);
                           pw2.write(p.getId()+"\t"+p.getIs_a()+"\n");
                           p.setIs_a("--");
                       
                   }
             }
             f.close();
             pw.close();
             pw2.close();
        }
    }
     
    public boolean checkFile(String ruta){
        File archivo = new File(ruta);
        BufferedWriter bw;
         return archivo.exists();
    }
    
}
