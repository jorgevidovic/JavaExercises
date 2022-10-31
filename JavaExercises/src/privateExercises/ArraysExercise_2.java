package privateExercises;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArraysExercise_2 {
	
	public static void main(String[] args) {
		try {
			// -- Zona de declaración de variables --
			
			int array[] = new int[100];
			String option = null;
			char o = 0;
			int number=0, x=0, y=0;
			
			// Bucle que genera 100 valores enteros del 1 al 100
			for(int i=0;i<array.length;i++){
				for(int j=0;j<array.length;j++) {
					array[j] = (int)(Math.random()*100+1); //Se generan 100 valores enteros del 1 al 100;
				}
			}
			// Interfaz para el usuario.
			do {
				option = (JOptionPane.showInputDialog(null, 
						"Ejercicio 1 - Programa que genera una matriz de 100 números enteros con valores aleatorios entre 0 y 100"
						+ "\n-----------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------------------"
						+ "\na) Mostrar valores superiores a un valor introducido por el usuario.\n"
						+ "\nb) Calcular la media de los 50 primeros valores almacenados.\n"
						+ "\nc) Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan.\n"
						+ "\nd) Mostrar por pantalla el primer valor inferior a un valor introducido por el usuario.\n"
						+ "\ne) Mostrar por pantalla los valores que sean primos.\n"
						+ "\nf) Mostrar:\n"
						+ "     1. Valor máximo.\n"
						+ "     2. Segundo más alto.\n"
						+ "     3. Valor mínimo.\n"
						+ "     4. Segundo valor mas bajo.\n"
						+ "\ng) Mostrar por pantalla aquellos valores que sean múltiplos de 3 y 5 en binario.\n"
						+ "\nh) Salir."));
				o = option.toLowerCase().charAt(0);
				
				switch(o) {
				
				case 'a':
					number = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor: "));
					x = 0; 
					// Bucle para contar los valores superiores al valor introducido por el usuario y posteriormente almacernalos en una variable auxiliar.
					for (int i = 0; i < array.length; i++) {
					    if (array[i] > number) {
					        x++;  
					    }
					}
					int array2[] = new int[x];
					y = 0;
					// Bucle para copiar en un array auxilar los valores superiores al valor introducido por el usuario.
					for (int i = 0; i < array.length; i++) {
					    if (array[i] > number) { 
					        array2[y] = array[i];    
					        y++;
					    }
					}
					JOptionPane.showMessageDialog(null,
							"Valor introducido por el usuario: "+number
							+"\nLos valores pertenecientes a la matriz mayores al valor introducido por el usuario: "+Arrays.toString(array2));
					break;
					// -- Fin del caso a --
					
				case 'b':
					//Bucle que recorre la mitad del array, sumando sus valores y almacenandolos en la variable sum, para posteriormente calcular la media.
					int sum = 0, average=0;
					for(int i=0;i<array.length/2;i++) {
						sum = sum +array[i];
					}
					average = sum/(array.length/2);
					JOptionPane.showMessageDialog(null,"La media de los primeros 50 valores de la matriz es: "+"["+average+"]");
					break;
					// -- Fin del caso b --
					
				case 'c':
					number = 20;
					x = 0; 
					// Bucle para recorrer el array y contar los valores superiores a 20.
					for (int i = 0; i < array.length; i++) {
					    if (array[i] > number) {
					        x++;
					    }
					}
					
					int array3[] = new int[x];
					y = 0;
					// Bucle para copiar y almacernar en un array auxilar los valores superiores a 20.
					for (int i = 0; i < array.length; i++) {
					    if (array[i] > number) { 
					        array3[y] = array[i];    
					        y++;
					    }
					}
					
					int array4[] = new int[x];
					y = 0;
					// Bucle para copiar en un array auxilar las posiciones de los valores superiores a 20 en el array original.
					for (int i = 0; i < array.length; i++) {
					    if (array[i] > number) {
					    	array4[y] = i;    
					        y++;
					    }
					}
					array3 = Arrays.copyOf(array3, 10);  //Se subdivide el Array3 para que seleccione los primeros 10 valores de la matriz copiada
					array4 = Arrays.copyOf(array4, 10);	 //Se subdivide el Array4 para que seleccione las posiciones de primeros 10 valores de la matriz original
					
					JOptionPane.showMessageDialog(null,
							"Primeros 10 valores pertenecientes a la matriz mayores a 20: "+Arrays.toString(array3)+
							"\n                                           Respectivas posiciones en la matriz: "+Arrays.toString(array4));
					break;
					
					// -- Fin del caso c --
				
				case 'd':
					y=-1;
					number = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor: "));
					// Bucle para buscar en la matriz un valor inferior e una posicion al introducido por el usuario
					for (int i = 0; i < array.length; i++) {
					    if (array[i] == number) { 
					        y = array[i-1];
						}
				    }
					if (y==-1) {
						JOptionPane.showMessageDialog(null, "El valor introducido no fue encontrado, intentalo de nuevo.");
					}
					else{JOptionPane.showMessageDialog(null, "Valor introducido: "+number
							+""
							+ "\nValor inferior al introducido por el usuario: "+y);
					}
					break;
					// -- Fin del caso d --
				
				case 'e':
					x = 0;
					// Bucle para recorrer la matriz
					for (int i = 0; i < array.length; i++) {
						if(Methods.isPrime(array[i])) { //Metodo isPrime creado en la clase "Methods" con bucles para facilitar el desarrollo del codigo.
							x++;
						}
					}
					
					int array5[] = new int[x];
					y=0 ;
					for (int i=0; i<array.length; i++) {
						if(Methods.isPrime(array[i])) { //Metodo isPrime creado en la clase "Methods" con bucles para facilitar el desarrollo del codigo.
					        array5[y] = array[i]; //Se copia valor a valor cada numero primo perteneciente a la matriz original en una matriz auxiliar.
					        y++;
						}
					}
					JOptionPane.showMessageDialog(null,"Los valores primos pertenecientes a la matriz son: "+Arrays.toString(array5));
					break;
					// -- Fin del caso e --
					
				case 'f':
					int array6[]=new int[4]; //Matriz donde se almacenaran las pociones de los valores en la matriz original.
					int array7[]=Arrays.copyOf(array,array.length); //Matriz que contiene los valores de la matriz original pero de forma ordenada.
					Arrays.sort(array7);
					
					int highestValue = array7[array7.length-1];
					int secondHighestValue = array7[array7.length-2];
					int lowestValue = array7[0];
					int secondlowestValue = array7[1];
					
					//Bucle para calcular el valor mas alto de la matriz
					for (int i=0;i<array.length;i++) {
					    if (array7[i] == highestValue) {
					    	array6[0] = i;    
					    }
					}
					
					//Bucle para calcular el segundo valor mas alto de la matriz
					for (int i=0;i<array.length;i++) {
					    if (array7[i] == secondHighestValue) {
					    	if(highestValue == secondHighestValue) {
					    		array6[1] = i-1;
					    	}else {
					    	array6[1] = i;    
					    	}
					    }
					}
					
					//Bucle para calcular el valor mas bajo de la matriz
					for (int i=0;i<array.length;i++) {
					    if (array7[i] == lowestValue) {
					    	array6[2] = i;    
					    }
					}
					
					//Bucle para calcular el segundo valor mas bajo de la matriz
					for (int i=0;i<array.length;i++) {
					    if (array7[i] == secondlowestValue) {
					    	if(lowestValue == secondlowestValue) {
					    		array6[3] = i+1;
					    	}else {
					    	array6[3] = i;
					    	}
					    }
					}
					JOptionPane.showMessageDialog(null,"1. Valor mas alto de la matriz: "+"["+highestValue+"]"+" - posición: "+"["+array6[0]+"]"+
						     "\n2. Segundo valor mas alto: "+"["+secondHighestValue+"]"+" - posición: "+"["+array6[1]+"]"+
						     "\n3. Valor mas bajo de la matriz: "+"["+lowestValue+"]"+" - posición: "+"["+array6[2]+"]"+
						     "\n4. Segundo valor mas bajo de la matriz: "+"["+secondlowestValue+"]"+" - posición: "+"["+array6[3]+"]");
					break;
					// -- Fin del caso f --
				
				case 'g':
					x = 0; 
					// Bucle para recorrer el array y contar los valores multiplos de 3 y 5.
					for (int i = 0; i < array.length; i++) {
					    if (array[i]%3==0 && array[i]%5==0) {
					        x++;
					    }
					}
					
					int array8[] = new int[x]; // Matriz donde se almacenarán los valores multiplos de 3 y 5
					String array9[] = new String[x]; //Matriz donde se almacenarán los valores multiplos de 3 y 5 en su equivalente a hexadecimal
					y = 0;
					
					// Bucle para copiar en un array auxilar las posiciones de los valores multiplos de 3 y 5.
					for (int i = 0; i < array.length; i++) {
					    if (array[i]%3==0 && array[i]%5==0) {
					    	array8[y] = i;  
					    	array9[y] = Integer.toHexString(array8[y]);
					        y++;
					    }
					}
					JOptionPane.showMessageDialog(null,"Los valores multiplos de 3 y 5 pertenecientes a la matriz son: "+Arrays.toString(array8)
													+"\nSu equivalente en hexadecimal:                                 "
													+ "                   "+Arrays.toString(array9));
					break;
					// -- Fin del caso g --
					
				case 'h':
					JOptionPane.showMessageDialog(null, "Has seleccionado la opción 'Salir.'"
							+ "\n¡Hasta pronto!");
					break;
					// -- Fin del caso h --
					
			    default:
					JOptionPane.showMessageDialog(null, "El caracter introducido no es valido, intentalo de nuevo.");
					break;
				}// Fin del switch.	
			} while(o != 'h'); // La interfaz se ejecutará en bucle hasta que el usuario no seleccione lo aopción de salir.

		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");
				}
	}
}
