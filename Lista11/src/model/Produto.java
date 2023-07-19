package model;

public class Produto {
	private String nome;
	private float preco;
	
	public Produto() {
		
	}
	
	public Produto(String nome, float preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Preço: R$" + this.getPreco();
	}
}
