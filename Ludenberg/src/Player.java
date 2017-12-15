public class Player {
	private int number = 0;

	public int getNumber() {return number;}
	public void setNumber(int num) {number = num;}
	
	protected void Guess() {
		this.setNumber((int)(Math.random() * 10));
		System.out.println("I'm guessing number: " + number);
	}
}
