/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elahorcadito;

/**
 *
 * @author Lvkz
 */
public class Ahorcado {
  String estado_juego;
  int cantidad_letras;
  
  Ahorcado() {
  
  }
  
  //Palabra Generada: Casa, Letra Digitada: C
  
  Ahorcado(String palabra, char letra_digitada) {
    this.cantidad_letras = 0;
    
    for(char letra: palabra.toCharArray()) {
      this.cantidad_letras += 1;
    }
    //Decirle al jugador la cantidad de letras que tiene la palabra a adivinar.
    //Numero de intentos en el constructor: 8 intentos.
    
    
    
    for (char letra: palabra.toCharArray()) {
      this.probar(letra);
    }
  }
          
  String probar(char letra) {
    //Verificar que la letra 
    return this.estado_juego;  
  }
}
