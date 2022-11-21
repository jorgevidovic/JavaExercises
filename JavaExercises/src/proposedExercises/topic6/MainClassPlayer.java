package proposedExercises.topic6;

public class MainClassPlayer {
	public static void main(String[] args) {
		Player.setCompetition("Torneo Nacional del Perreo");
		Player player1 = new Player("AA000","Emmanuel");
		Player player2 = new Player("AA001","Carlos");
		Player player3 = new Player("AA002","Juan");
		
		player1.updatePoints(20);
		player2.updatePoints(30);
		
		System.out.println("Codigo del jugador 1: " + player1.getCode());
		System.out.println("Codigo del jugador 2 " + player2.getCode());
		System.out.println("Codigo del jugador 3 " + player3.getCode());
		
		System.out.println("Jugador 1: "+player1+" "+Player.getCompetition());
		System.out.println("Jugador 2: "+player2+" "+Player.getCompetition());
		
		System.out.println(Player.comparePoints(player1, player2));
	}
}
