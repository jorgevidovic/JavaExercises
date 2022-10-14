package proposedExercises.topic4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class MediaCalculator {
	public static void main(String[] args) {
		try {
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("#.#",dfs);

		JOptionPane.showMessageDialog(null,"Programa para:\n"
									   + "- Contar los valores de una matriz que estan por encima de la media.\n"
									   + "- Calcular la desviacion media de la matriz.\n");

		Random rnd = new Random();
		float matriz[] =  new float[10];
		float sum=0, sum_2=0, average=0, averageDesviation=0;
		short contator = 0;
		double deviations[] = new double[matriz.length];
		double averageDeviation = 0;
	
		//Se generan 10 valores aleatorios
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++) {
				matriz[j] = (Float.parseFloat(df.format(rnd.nextFloat(0,10))));
			}
			sum = sum + matriz[i]; //Se almacena la suma de todos los valores bucle en la variable "sum"
		}
		sum = Float.parseFloat(df.format(sum));
		average = sum/matriz.length;
		
		for(float valor:matriz) {
			if(valor>average) {
				contator+=1;
			}
		}
		
		for(int i = 0;i< matriz.length;i++) {
			deviations[i] = Math.abs(matriz[i] - average);
		}
		
		for(int i = 0;i<deviations.length;i++) {
			sum_2 = (float)(sum_2 + deviations[i]);
		}
		
		averageDeviation = Double.parseDouble(df.format(sum_2/deviations.length));
		
		JOptionPane.showMessageDialog(null,"Matriz generada: "+Arrays.toString(matriz)
									   + "\nHay "+contator+" valores sobre la media."
									   + "\nMedia geométrica: "+average
									   + "\nDesviación media: "+averageDeviation);
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo ha ido mal, intentalo de nuevo.");}
		}
	}

