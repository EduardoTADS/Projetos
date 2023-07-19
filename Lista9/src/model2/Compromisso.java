package model2;

public class Compromisso {
	private String nome;
	private int dia;
	private int mes;
	private String Descricao;
	
	public Compromisso() {
		
	}
	
	public Compromisso(String nome, int dia, int mes, String Descricao) {
		this.setNome(nome);
		this.setDia(dia);
		this.setMes(mes);
		this.setDescricao(Descricao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
		
	
}
