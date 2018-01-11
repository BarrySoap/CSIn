import javax.sound.midi.*;

public class Music 
{

	public void play() 
	{
		try 
		{
			Sequencer sequencer = MidiSystem.getSequencer();
			
			System.out.println("Sequencer found!");
		} catch (MidiUnavailableException e) 
		{
			System.out.println("Sequencer not found.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		Music music = new Music();
		music.play();
	}
}
