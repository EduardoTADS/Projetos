package model2;

import java.util.List;

import java.util.ArrayList;

public class Agenda{

	  private String usuario;
	    private int ano;
	    private List<Compromisso> compromissos;

	    public Agenda(String usuario, int ano) {
	        this.usuario = usuario;
	        this.ano = ano;
	        this.compromissos = new ArrayList<>();
	    }

	    public String getUsuario() {
	        return usuario;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public void adicionarCompromisso(Compromisso compromisso) {
	        compromissos.add(compromisso);
	    }

	    public void removerCompromisso(Compromisso compromisso) {
	        compromissos.remove(compromisso);
	    }

	    public boolean hasCompromisso() {
	        return !compromissos.isEmpty();
	    }

	    public List<Compromisso> getCompromissosPorData(int dia, int mes) {
	        List<Compromisso> compromissosPorData = new ArrayList<>();
	        for (Compromisso compromisso : compromissos) {
	            if (compromisso.getDia() == dia && compromisso.getMes() == mes) {
	                compromissosPorData.add(compromisso);
	            }
	        }
	        return compromissosPorData;
	    }

	    public Compromisso getCompromissoPorNome(String nome) {
	        for (Compromisso compromisso : compromissos) {
	            if (compromisso.getNome().equals(nome)) {
	                return compromisso;
	            }
	        }
	        return null;
	    }
	    public List<Compromisso> getListaCompromisso() {
			return compromissos;
		}
}