package model;

public abstract class PessoaJuridica {
	private long CNPJ;
	private String razaoSocial;
	private String nome;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(long CNPJ, String razaoSocial, String nome) {
		this.setCNPJ(CNPJ);
		this.setRazaoSocial(razaoSocial);
		this.setNome(nome);
	}
	
	public long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override 
	public String toString() {
		return "\nNome: "+this.getNome() + "\nCNPJ: " + this.getCNPJ() + "\tRazao Social: " + this.getRazaoSocial();
	}
}
