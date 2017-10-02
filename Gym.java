import javax.swing.*;

/*  Ger priset per besök på x gym.
	Benjamin Bylund
	2017-10-02
*/
public class Gym{
	public static void main(String[] args) {
		
		int pris = Integer.parseInt(JOptionPane.showInputDialog(null,"PRIS per besok?"));
		int besok = Integer.parseInt(JOptionPane.showInputDialog(null,"Hur mycket gymmar du varje vecka?"));
		int arskort = Integer.parseInt(JOptionPane.showInputDialog(null,"Hur mycket kostar ett arskort?"));

		int riktigaBesok = pris * besok; 
		int riktigaPris = 52 * riktigaBesok; 
		
		if(riktigaPris < arskort){ 
			JOptionPane.showMessageDialog(null,"Betala for varje besok");
		} else 
			JOptionPane.showMessageDialog(null,"Kop arskort.");
	}
}