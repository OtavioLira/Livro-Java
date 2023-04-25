package cap04;

import javax.swing.JOptionPane;

public class CO9EX02 {

	public static void main(String[] args) {
		String[] lista = {"um","dois","três","quatro","cinco"};
		String mensagem = "Mensagem", titulo = "Título";
		
		final int s1 = JOptionPane.PLAIN_MESSAGE;
		final int s2 = JOptionPane.ERROR_MESSAGE;
		final int s3 = JOptionPane.INFORMATION_MESSAGE;
		final int s4 = JOptionPane.WARNING_MESSAGE;
		final int s5 = JOptionPane.QUESTION_MESSAGE;
		
		final int o1 = JOptionPane.DEFAULT_OPTION;
		final int o2 = JOptionPane.YES_NO_OPTION;
		final int o3 = JOptionPane.YES_NO_CANCEL_OPTION;
		final int o4 = JOptionPane.OK_CANCEL_OPTION;
		
		// Exemplo com o metodo showInputDialog()
		//showInputDialog(componente, mensagem, título, saída, ícone, lista, posição)
		JOptionPane.showInputDialog(null, mensagem, titulo, s1);
		JOptionPane.showInputDialog(null, mensagem, titulo, s2);
		JOptionPane.showInputDialog(null, mensagem, titulo, s3);
		JOptionPane.showInputDialog(null, mensagem, titulo, s4);
		JOptionPane.showInputDialog(null, mensagem, titulo, s5);
		//usando diretamente
//		JOptionPane.showInputDialog(null, mensagem, titulo, -1);
//		JOptionPane.showInputDialog(null, mensagem, titulo, 0);
//		JOptionPane.showInputDialog(null, mensagem, titulo, 1);
//		JOptionPane.showInputDialog(null, mensagem, titulo, 2);
//		JOptionPane.showInputDialog(null, mensagem, titulo, 3);

		//Valores com lista
		JOptionPane.showInputDialog(null, mensagem, titulo, s1, null, lista, lista[0]);
		JOptionPane.showInputDialog(null, mensagem, titulo, s2, null, lista, lista[1]);
		JOptionPane.showInputDialog(null, mensagem, titulo, s3, null, lista, lista[2]);
		JOptionPane.showInputDialog(null, mensagem, titulo, s4, null, lista, lista[3]);
		JOptionPane.showInputDialog(null, mensagem, titulo, s5, null, lista, lista[4]);
		
		// Exemplo com método showOptionDialog()
		//showConfirmDialog(componente, mensagem, título, opção, saída, ícone, lista, foco)
		JOptionPane.showOptionDialog(null, mensagem, titulo, 1, s1, null, lista, "um");
		JOptionPane.showOptionDialog(null, mensagem, titulo, 1, s2, null, lista, "dois");
		JOptionPane.showOptionDialog(null, mensagem, titulo, 1, s3, null, lista, "três");
		JOptionPane.showOptionDialog(null, mensagem, titulo, 1, s4, null, lista, "quatro");
		JOptionPane.showOptionDialog(null, mensagem, titulo, 1, s5, null, lista, "cinco");
		
		// Exemplo com método ShowConfirmDialog()
		//showConfirmDialog(componente, mensagem, título, opção, saída, ícone)
		JOptionPane.showConfirmDialog(null, mensagem, titulo, o1, 2, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, o2, 2, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, o3, 2, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, o4, 2, null);
		//com numeros
		JOptionPane.showConfirmDialog(null, mensagem, titulo, -1, 1, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, 0, 1, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, 1, 1, null);
		JOptionPane.showConfirmDialog(null, mensagem, titulo, 2, 1, null);

		
		// Exemplo com método showMessageDialog()
		//showMessageDialog(componente, mensagem, titulo, saida, icone);
		JOptionPane.showMessageDialog(null, mensagem, titulo, -1, null);
		JOptionPane.showMessageDialog(null, mensagem, titulo, 0, null);
		JOptionPane.showMessageDialog(null, mensagem, titulo, 1, null);
		JOptionPane.showMessageDialog(null, mensagem, titulo, 2, null);
		JOptionPane.showMessageDialog(null, mensagem, titulo, 3, null);
		
	}

}
