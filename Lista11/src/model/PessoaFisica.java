package model;

public abstract class PessoaFisica {
	private long CPF;
	private long RG;
	private String nome;
		
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(long CPF, long RG, String nome) {
		this.setCPF(CPF);
		this.setRG(RG);
		this.setNome(nome);
	}
	
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long rG) {
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome:"+ this.getNome() + "\nCPF: " + this.getCPF();	
		
	}
}
