package proposedExercises.topic6;

public class MainClassPlayer {
	public static void main(String[] args) {
		Player.setCompetition("Torneo Nacional del Perreo");
		Player player1 = new Player("AA000","Emmanuel");
		Player player2 = new Player("AA001","Carlos");
		Player player3 = new Player("AA002","Juan");
		
		System.out.println(player1.getCode());
		System.out.println(player2.getCode());
		System.out.println(player3.getCode());
	}
}
