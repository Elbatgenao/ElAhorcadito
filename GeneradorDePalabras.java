/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elahorcadito;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ElbaGenao
 */
public class GeneradorDePalabras {
    public static String generaor(){
        File archivo = null;
        BufferedReader  br= null;
        FileReader fr = null;
        ArrayList<String> palabras = new ArrayList<>();
        Random rand= new Random();
 
        try{
         archivo = new File ("C:\\Users\\ElbaGenao\\Desktop\\palabras.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
        
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            palabras.add(linea);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta
         // una excepcion.
         try{                   
            if( null != fr ){  
               fr.close();    
            }                 
         }catch (Exception e2){
            e2.printStackTrace();
         }
      }
       int randomNum = rand.nextInt(palabras.size());
       return palabras.get(randomNum);
    }
}
    
    
   

