package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends PessoaJuridica implements Transacao{
	private float caixa;
	private float divida;
	private float receita;
	private List<Produto> listaProduto = new ArrayList<Produto>();
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	private List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
	public static final int AVISTA = 1;
	public static final int APRAZO = 2;
	
	public Empresa() {
		super();
	}
	
	public Empresa(long CNPJ, String razaoSocial, String nome, float caixa, float divida, float receita) {
		super(CNPJ, razaoSocial, nome);
		this.setCaixa(caixa);
		this.setDivida(divida);
		this.setReceita(receita);
	}
	
	public float getCaixa() {
		return caixa;
	}
	public void setCaixa(float caixa) {
		this.caixa = caixa;
	}
	public float getDivida() {
		return divida;
	}
	public void setDivida(float divida) {
		this.divida = divida;
	}
	public float getReceita() {
		return receita;
	}
	public void setReceita(float receita) {
		this.receita = receita;
	}
	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	public List<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}
	public void setListaFornecedor(List<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}
	
	public static int getAvista() {
		return AVISTA;
	}
	public static int getAprazo() {
		return APRAZO;
	}
	
	public float Balanco() {
		 caixa += receita - divida;
		 receita = 0;
		 divida = 0;
		 return caixa;
	}
	
	public void Vender(Produto produto, Cliente cliente, int formaPag) {
		float desconto = 0.0f, juro = 0.0f, valor = produto.getPreco();
		if(cliente.isVip()) {
			desconto += getDesconto();
		}
		if(formaPag == APRAZO) {
			juro +=	getJuros()*2;		
		}else {
			desconto += getDesconto();
		}
		
		if(juro > desconto) {
			valor += (valor*(juro - desconto));
		}
		else {
			valor += (valor*(desconto - juro));
		}
		listaProduto.add(produto);
		receber(valor);
		
	}
	
	public void Compra(Produto produto,Fornecedor fornecedor, int formaPag) {
		
		float desconto = 0.0f, juro = 0.0f, valor = produto.getPreco();
		if(fornecedor.isParceria()) {
			desconto += getDesconto()*2;
		}
		if(formaPag == APRAZO) {
			juro +=	getJuros();		
		}else {
			desconto += getDesconto()*2;
		}
		
		if(juro > desconto) {
			valor += (valor*(juro - desconto));
		}
		else {
			valor += (valor*(desconto - juro));
		}
		listaProduto.add(produto);
		pagar(valor);
		
	}
	
	@Override
	public void pagar(float valor) {
		// TODO Auto-generated method stub
		divida+= valor;
		}
	
	@Override
	public void receber(float valor) {
		// TODO Auto-generated method stub
		receita+= valor;
	}
	

	@Override
	public float getDesconto() {
		// TODO Auto-generated method stub
		
		return 0.1f;
	}

	@Override
	public float getJuros() {
		// TODO Auto-generated method stub
		return 0.1f;
	}		
	
	

}
