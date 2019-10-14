import java.util.Scanner;

public class Play {

	private static Scanner in;
	private static final String QUIT = "n";
	private static boolean cheat;

	public static void main(String[] args) {
		System.out.println("STEPHEN BLACKWELL");
		System.out.println("PARTNER FULL NAME HERE");

		in = new Scanner(System.in);
		System.out.println("Leave blank for cheat mode. Type anything else for regular mode.");
		System.out.println("Then hit enter");
		cheat = in.nextLine().equals("");

		String game = "";
		
		while (!game.startsWith(QUIT)) {
			System.out.print("Which game: (f)rank or (h)igher-lower? ");
			game = in.nextLine().toLowerCase();
			if (game.startsWith("h")) {
				HigherOrLower hl = new HigherOrLower(0, 255);
				play(hl);				
			}
			else if (game.startsWith("f")) {
				Frank f = new Frank();
				play(f);
			}
			
			System.out.print("Play again? ");
			game = in.nextLine().toLowerCase();
		}		
	}

	public static void play(Frank frank) {
		
		while (!frank.isOver()) {
			System.out.println();
			if (cheat) {
				System.out.println(frank);
			}
			System.out.println(frank.getStatus());
			System.out.print("Type your guess and hit enter: ");
			String guess = in.nextLine();
			frank.guess(guess);
		}
		
		System.out.println("\n" + frank.getStatus());
	}
	
	public static void play(HigherOrLower hilo) {

		while (!hilo.isOver()) {
			System.out.println();
			if (cheat) {
				System.out.println(hilo);
			}
			System.out.println(hilo.getStatus());
			System.out.print("Type your guess and hit enter: ");
			String play = in.nextLine();
			hilo.guess(play);
		}

		System.out.println("\n" + hilo.getStatus());
	}
	
}
