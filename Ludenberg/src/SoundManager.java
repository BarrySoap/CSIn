public class SoundManager {

	public static int GenerateRandom(int rand) {
		rand = (int)(Math.random() * 10);
		return rand;
	}

	public static void main(String[] args) {
		Sound s1 = new Sound();
		int rand = 0;

		while (true) {
			rand = GenerateRandom(rand);

			switch (rand) {
			case 0:	s1.playSound("resources/A0.wav");
					break;
			case 1:	s1.playSound("resources/B0.wav");
					break;
			case 2:	s1.playSound("resources/BB0.wav");
					break;
			}
		}
	}
}
