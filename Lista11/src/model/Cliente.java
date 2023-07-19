package model;

public class Cliente extends PessoaFisica{
	private boolean vip;

	public Cliente() {
		super();
	}
	
	public Cliente(long CPF, long RG, String nome, boolean vip) {
		super(CPF, RG, nome);
		this.setVip(vip);
	}
	
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	@Override
	public String toString() {
		if(this.isVip()) {
			return  super.toString() + "\nCliente - VIP";				
		}else {
			return super.toString() + "\nCliente - Comum";				
		}
	}
}
