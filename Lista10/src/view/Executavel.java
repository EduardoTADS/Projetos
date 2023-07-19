package view;

import javax.swing.JOptionPane;

import model.Matematica;

public class Executavel {

	public static void main(String[] args) {
		String opcoes[] = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
		int op, num1 = 0, num2 = 0;
		
		do{
			op = JOptionPane.showOptionDialog(null, "Escolha o tipo de operação matemática", 
					"Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
					null, opcoes, opcoes[2]);
			
			if(op == 4 || op == -1)
				break;
			
			boolean input = false;
			while(!input) {
				try {
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
				input = true;
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Entrada invalida", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			try {
				switch(op) {
					case 0:
							JOptionPane.showMessageDialog(null, "A soma entre " + num1 + " e " + num2 + 
									" é: " + Matematica.soma(num1, num2));													
						break;
					case 1:
							JOptionPane.showMessageDialog(null, "A subtração entre " + num1 + " e " + num2 + 
									" é: " + Matematica.sub(num1, num2));							
						break;
					case 2:
							JOptionPane.showMessageDialog(null, "A multiplicação de " + num1 + " por " + num2 + 
									" é: " + Matematica.mult(num1, num2));							
						break;
					case 3:
							JOptionPane.showMessageDialog(null, "A divisão de " + num1 + " por " + num2 + 
									" é: " + Matematica.div(num1, num2));							
						break;
					default:
						break;
				}
			}
			catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			

		}while(op != 4);

	}
}