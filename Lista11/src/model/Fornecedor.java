package model;

public class Fornecedor extends PessoaJuridica{
	private boolean parceria;

	public Fornecedor() {
		super();
	}
	
	public Fornecedor(long CNPJ, String razaoSocial, String nome, boolean parceria) {
		super(CNPJ, razaoSocial, nome);
		this.setParceria(parceria);
	}
	
	public boolean isParceria() {
		return parceria;
	}

	public void setParceria(boolean parceria) {
		this.parceria = parceria;
	}
	

	@Override
	public String toString() {
		if(this.isParceria()) {
			return  super.toString() + "\nFornecedor - PARCEIRO";				
		}else {
			return super.toString() + "\nFornecedor - Comum";				
		}
	}
}
