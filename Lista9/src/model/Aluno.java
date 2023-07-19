package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Situacao implements VerificaSituacao{
	private String nome;
	private List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.setNome(nome);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDisciplina(Disciplina disciplina) {
		listaDisciplina.add(disciplina);
	}
	
	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}

	public void setListaDisciplina(List<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}

	@Override
	public float CalculaMediaGeral() {
		// TODO Auto-generated method stub
		float media = 0.0f;	
		for (Disciplina D: listaDisciplina) {
			media+= D.getMediaDisciplina();
		}
		return (media/listaDisciplina.size());
	}

	@Override
	public boolean VerificaFrequencia() {
		// TODO Auto-generated method stub
		for (Disciplina DF: listaDisciplina) {
			  if(DF.getFrequenciaDisciplina() <= 75.0f) {
				 return false;
			 }
		}
		return true;
	}
	
	public String getSituacao() {
		if(CalculaMediaGeral()>=7.0f) {
			return Situacao.APROVADO;
		}else if(CalculaMediaGeral()>5.0f && CalculaMediaGeral()<7.0f) {
			return Situacao.RECUPERACAO;
		}else {
			return Situacao.REPROVADO;
		}
	}
	

	@Override
	public String toString() {
		return "Nome:"+ this.getNome() + "\n"+this.getListaDisciplina().toString()
				+"\nMédia Geral:"+this.CalculaMediaGeral()+"\n\tSituação:"+this.getSituacao();
	}		
}
