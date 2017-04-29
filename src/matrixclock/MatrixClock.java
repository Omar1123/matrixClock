/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixclock;

/**
 *
 * @author jake
 */
public class MatrixClock {
    
    private int[][] matriz = new int[10][10];
    
    private int fila_x = 0; 
    private int columna_y = 0; 
    private int flag = 0;  
    private int acumulador = 0;
    private int elementos = matriz.length * matriz[0].length;
    
    public static void main(String[] args) {
      try {
          MatrixClock exersice = new MatrixClock();
          exersice.matriz();
      } catch (Exception ex) {
          
      }
    }
    
    private void matriz() { 
    
        System.out.println("Llenando matriz de 10 x 10");
        this.fillMatriz();
        
        System.out.println("Matriz de caracteres");
        this.showMatriz();
        
        System.out.println("");
        
        System.out.println("La matrix recorrida es");
        this.displayMatriz();
   }
   
    private void fillMatriz() {
        for (int columna = 0; columna < matriz.length; columna++) {
            for (int fila = 0; fila < matriz[0].length; fila++) {
                matriz[columna][fila] = fila;
            }
        }
    }
    
    private void showMatriz() {
       for (int columna = 0; columna < matriz.length; columna++) {
            for (int fila = 0; fila < matriz[0].length; fila++) {
                System.out.print(matriz[columna][fila]);
            }
        } 
    }
    
    private void displayMatriz() {
        while (acumulador < elementos) {
         switch (flag) {
         case 0: 
            for (int temporal = fila_x; temporal < matriz[0].length - columna_y; temporal++) {
               System.out.print(" " + matriz[fila_x][temporal]);
               acumulador++;
            }
            flag++;
            break;
 
         case 1: 
            for (int temporal = fila_x + 1; temporal < matriz.length - fila_x; temporal++) {
               System.out.print(" " + matriz[temporal][matriz[0].length - 1 - columna_y]);
               acumulador++;
            }
            flag++;
            break;
 
         case 2:
            for (int temporal = matriz[0].length - 2 - columna_y; temporal >= columna_y; temporal--) {
               System.out.print(" " + matriz[matriz.length - 1 - fila_x][temporal]);
               acumulador++;
            }
            flag++;
            break;
 
         case 3:
            for (int temporal = matriz.length - 2 - fila_x; temporal >= fila_x + 1; temporal--) {
               System.out.print(" " + matriz[temporal][columna_y]);
               acumulador++;
            }
            flag = 0;
            fila_x++;
            columna_y++;
            break;
         } 
      }
    }
    
}
