
public class Main {
	public static void main(String args[]) {
		NightSky nightSky = new NightSky(0.1, 40, 100);
		nightSky.print();
		System.out.println("Number of stars: " + nightSky.starsInLastPrint());
		
	}
}
