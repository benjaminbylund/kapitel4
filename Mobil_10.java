import javax.swing.*;

/*  Ger 10% om man ringer för 1000 kr.
	Benjamin Bylund
	2017-10-02
*/
	public class Mobil_10{
		public static void main(String[] args) {
			String s = JOptionPane.showInputDialog(null, "Antal minuter per manad?");
			int min = Integer.parseInt(s);

			s = JOptionPane.showInputDialog("pris per minut");

			double minutpris = Double.parseDouble(s);
			double k = min * minutpris;
			double procent = k * 0.1; 
			double procentpris = k - procent;
			
			if (k > 1000){
			
				JOptionPane.showMessageDialog(null, procentpris + "kr");
			}

			else  
				JOptionPane.showMessageDialog(null, k + "kr");
		}
	}