package coronavirus;

public class Consultorio {

	public static void main(String[] args) {
		Paciente consultorio[] = new Paciente[5];
		consultorio[0] = new Paciente("12345678P","Daya", 43);
		consultorio[1] = new Paciente("12345678Z","Pepito", 15);
		consultorio[2] = new SospechosoCoronavirus("12345678X","Marta", 18);
		consultorio[3] = new Paciente("12345678V","Juan", 30);
		consultorio[4] = new SospechosoCoronavirus("12345678Y","Carlos", 21);
		
		for(int i = 0; i < consultorio.length; i++) {
			if(consultorio[i] instanceof SospechosoCoronavirus)
			((SospechosoCoronavirus)consultorio[i]).realizarTest();
			System.out.println(consultorio[i]);
		}

	}

}
