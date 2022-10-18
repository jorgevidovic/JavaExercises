package proposedExercises.topic4;

public class Tests {
	
	// -- Funcion que recibe un numero y devuelve true si es par. --
	
	public static boolean pareCalculator(int number) {
		
		return number %2==0? true: false;
		}
		
	public static boolean stringValidator(String string) {
		
		if(Character.isDigit(string.charAt(0))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// -- Funcion que recibe un Array y le suma 10 al valor en la posicion[0]. --
	public static void addTen(int array[]) {
		array[0]+=10;
	}
		
	public static void main(String[] args) {
		//Space to make tests
		
		//-----------------------------------------------------------------------
		
		int number = 9;
		boolean pare = pareCalculator(number);
		System.out.println("El numero es par?: "+pare);
		
		if(stringValidator("3")) {
			System.out.println("Empieza por digito\n");
		} else {
			System.out.println("No empieza por digito");
		}
		
		//-----------------------------------------------------------------------
		int array[] = {0,2,3,4};
		
		System.out.println(array.toString());
		addTen(array);
		System.out.println(array.toString());	
		}
}
