import javax.swing.*;

/*  Programmet berättar om brevet är giltigt 
	Benjamin Bylund
	2017-10-02
*/
public class Brev {
	public static void main(String[] args) {
		int langd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ge mig langd")); 
		int bred = Integer.parseInt(JOptionPane.showInputDialog(null, "Ge mig bred")); 
		int tjocklek = Integer.parseInt(JOptionPane.showInputDialog(null, "Ge mig tjcoklek")); 

		if (((langd > 140) && (langd < 600)) && 
			(tjocklek < 100) && 
			((bred > 90) && (bred < 200))){
			JOptionPane.showMessageDialog(null, "OK!");
		}
		else {
			JOptionPane.showMessageDialog(null, "FEL!");
		}
	}
}
