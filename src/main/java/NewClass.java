/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
import java.util.Scanner;

import javax.swing.JOptionPane;
public class NewClass {
	
	public static void main (String [] args) {
		
		double media,moda=0;
		int [] numeros;
		int numbers, opcion;
		int suma=0, burbuja;
		int repetidos=0;
	
      numbers=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"));
      numeros= new int [numbers];
      
         for (int posicion=0; posicion<numeros.length; posicion++){
        	 
        	 numeros[posicion]= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los numeros \n  "+posicion));
        	 suma=suma+numeros[posicion]; //Esto nos sera de ayuda para el promedio :D
         }
         
         do {
        	opcion=Integer.parseInt(JOptionPane.showInputDialog("1-Calcular Media\n 2-Calcular Mediana\n 3-Calcular Moda\n 0-Salir"));
        	
			switch (opcion) {
        	 
        	case 1: media=suma/numbers; //Calcular media
        	JOptionPane.showMessageDialog(null, "La media es: "+media);
        	break;
        	
        	case 2: for (int recorrido=1; recorrido<numeros.length; recorrido++) {
        		for (int posicion=0; posicion<(numeros.length-1); posicion++)
        			if (numeros[posicion]>numeros[posicion+1]) {
        				
        				burbuja=numeros[posicion];
        				numeros[posicion]=numeros[posicion+1];
        				numeros[posicion+1]=burbuja;
        			}
        }
        	if ((numbers&2)==0){
        		
        	
        	JOptionPane.showMessageDialog(null, "La mediana es: "+numeros[numbers/2]);
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "La mediana es: "+(numeros[numbers/2]));
        	}
        	break;
        	
        	
        	case 3: for (int recorrido=0; recorrido<numeros.length; recorrido++){
        		int SeRepite=0;
        		for (int posicion=0; posicion<numeros.length; posicion++){
        			if (numeros[recorrido]==numeros[posicion]) { //Nos dira las veces que se repiten los valores
        				SeRepite++;
        			}
        			
        			if (SeRepite>repetidos) {
        				moda=numeros[recorrido]; //Guardara el numero que se repite
        				repetidos=SeRepite;
        			}
        		
        	JOptionPane.showMessageDialog(null, "La moda es: "+moda+" se repitio: "+ repetidos+ " veces ");
        		} 
        		break;
        		
        	}
         	default:
        		
            	
            	
            	break;
            	
    			}
             }
    			while (opcion!=0);
    				
    			}
        	
}
