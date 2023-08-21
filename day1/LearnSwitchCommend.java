package week1.day1;

public class LearnSwitchCommend {
	public static void main(String[] args) {
		String game = "shuttle";
		
		switch (game) {
		case "volleyball":System.out.println("play volley ball with Sudhakar");break;
		case "football":System.out.println("play foot ball with Subash");break;
		case "cricket":System.out.println("play cricket with Mahendran");break;
		case "shuttle":System.out.println("play shuttle with Paramu");break;
		case "hockey":System.out.println("play hockey with Aadhi");break;
		default:System.out.println("tennis with Gunasekar");break;
		
		}
	}

}
