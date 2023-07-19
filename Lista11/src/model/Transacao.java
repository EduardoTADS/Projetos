package model;

public interface Transacao extends Pagtoavista, PagtoPrazo{
	public void pagar(float valor);
	public void receber(float valor);
	
}
