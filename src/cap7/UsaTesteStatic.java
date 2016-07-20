package cap7;

import javax.swing.JOptionPane;

public class UsaTesteStatic {
	public static void main(String[] args) {
		TesteStatic.mostrar(4);
	
		TesteStatic.mostrar(5.77);
		TesteStatic.mostrar("Jade");
		JOptionPane.showMessageDialog(null, "Minha Mensagem");
		int x = 10;
		JOptionPane.showInputDialog("Entre com x", x);
	}

}
