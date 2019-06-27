public class Dobbelsteen {
	private OpdrachtDobbelsteen player, opponent;
	private static int numOfGames;
	private int tied;
	
	public Dobbelsteen(int games){
		player = new OpdrachtDobbelsteen();
		opponent = new OpdrachtDobbelsteen();
		numOfGames = games;
		tied = 0;
		
		play();
		displayResults(player.getWin(), opponent.getWin());
	}
	public void play(){
		for (int i = 0; i < numOfGames; i++){
			player.roll();
			opponent.roll();
			
			if (player.getRoll() > opponent.getRoll()){
				player.setWin();
			} else if (player.getRoll() < opponent.getRoll()){
				opponent.setWin();
			} else {
				tied++;
			}
		}
	}
	public void displayResults(int userWin, int compWin){
		System.out.println("RESULTS");
		System.out.println("User wins........ " + userWin);
		System.out.println("Computer wins.... " + compWin);
		System.out.println("Its a tie!....... " + tied);
		
		if (userWin > compWin) {
			System.out.println("You have beaten your opponent");
			} else if (userWin < compWin) {
				System.out.println("Computer has won");
			} else {
				System.out.println("Its a tie");
			}
		}
	}

