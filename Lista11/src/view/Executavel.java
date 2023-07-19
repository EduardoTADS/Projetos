package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Empresa;
import model.Fornecedor;
import model.Produto;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Produto> listaProduto = new ArrayList<Produto>();
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
		
		for(int i = 0; i < 2; i++) {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome(JOptionPane.showInputDialog("Informe o nome do Forncedor: "));
			fornecedor.setCNPJ(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ do Fornecedor: ")));
			fornecedor.setRazaoSocial(JOptionPane.showInputDialog("Informe a Razão Social do Fornecedor: "));
			fornecedor.setParceria(false);
			
			listaFornecedor.add(fornecedor);			
			}
	
		for(int i = 0; i < 2; i++) {
		Cliente cliente = new Cliente();
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
		cliente.setCPF(Long.parseLong(JOptionPane.showInputDialog("Informe o CPF do cliente: ")));
		cliente.setRG(Long.parseLong(JOptionPane.showInputDialog("Informe o RG do cliente: ")));
		cliente.setVip(true);
		
		listaCliente.add(cliente);			
		}
		
		for (int j=0; j < 3; j++) {
			Produto prod = new Produto();
			prod.setNome(JOptionPane.showInputDialog("PRODUTO - " + (j+1)));
			prod.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preço: ")));
			
			listaProduto.add(prod);
		}
		
		Empresa emp1 = new Empresa();
		
		emp1.Compra(listaProduto.get(0), listaFornecedor.get(0), 2);
		emp1.Compra(listaProduto.get(2), listaFornecedor.get(0), 1);
		
		
		System.out.println("Fornecedor: " + listaFornecedor);
		System.out.println("\nCliente: " + listaCliente);
		System.out.println("\nProduto: " + listaProduto);
		
		emp1.Vender(listaProduto.get(0), listaCliente.get(0), 1);
		emp1.Vender(listaProduto.get(2), listaCliente.get(0), 2);
		

		System.out.println("\nPreço de Compra: R$" + emp1.getDivida());
		System.out.println("\nPreço de Venda: R$" + emp1.getReceita());
		System.out.println("\nBalanço de Caixa: R$" + emp1.Balanco());
		
	}
}



