import javax.swing.*;

/*  Programmet läser in betyg för en elev.
	Benjamin Bylund
	2017-10-02
*/
public class Betyg{
		public static void main(String[] args) {
			int points = Integer.parseInt(JOptionPane.showInputDialog(null, "poang tack!"));

			if(points >= 45){
				JOptionPane.showMessageDialog(null, "Hola Joel");
			}
			else if(points >= 40){
				JOptionPane.showMessageDialog(null,"Du ar nastan joel");
			}
			else if(points >= 35){
				JOptionPane.showMessageDialog(null,"Du fick C");
			}
			else if(points >= 30){
				JOptionPane.showMessageDialog(null,"DU fick D");
			}
			else if(points >= 25){
				JOptionPane.showMessageDialog(null,"Du fick E");
			}
		}
	}