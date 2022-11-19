package proposedExercises.topic6;

public class Player {
	private String code;
	private String name;
	private int points;
	private static String competition;
	
	public Player() {
		super();
	}
	
	public Player(String code, String name){
		setCode(code);
		this.name = name;
	}

	// Setters and getters zone
	public void setCode(String code) {
		//if (code.matches("[A-Z][0-9]")) {
			this.code = code;
		//}
	}
	
	public String getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	
	// Methods for Competition.
	public static void setCompetition(String competition) {
		Player.competition = competition;
	}
	
	public static String getCompetition() {
		return competition;
	}


	// Methods for the algorithm.

	public void updatePoints(int newPoints) {
		this.points += newPoints;
	}

	public static Player comparePoints(Player player1, Player player2) {
		if (player1.getPoints() > player2.getPoints()) {
			return player1;
		}
		return player2;
	}

	@Override
	public String toString() {
		return "Player [Código = " + code + ", Nombre = " + name + ", Puntos = " + points + "]";
	}
	
	
}
