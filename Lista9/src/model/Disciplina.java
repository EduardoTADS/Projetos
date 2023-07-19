package model;

import java.util.Arrays;

public class Disciplina {
	private String nomeDisc;
	private float nAula, nFalta;
	private float[] notas = new float[3];
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nomeDisc, float nAula, float nFalta, float[] notas) {
		this.setNomeDisc(nomeDisc);
		this.setNAula(nAula);
		this.setNFalta(nFalta);
		this.setNotas(getNotas());
	}
	
	public String getNomeDisc() {
		return nomeDisc;
	}
	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}
	public float getNAula() {
		return nAula;
	}
	public void setNAula(float nAula) {
		this.nAula = nAula;
	}
	public float getNFalta() {
		return nFalta;
	}
	public void setNFalta(float nFalta) {
		this.nFalta = nFalta;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public float getMediaDisciplina() {
		float media = 0.0f;	
	for(int i = 0; i < notas.length ; i++) {
			media += notas[i];
		}
	return  (media/notas.length);
	}
	
	public float getFrequenciaDisciplina() {
		float pct = 0.0f;
		return pct = (float) ((1.0f - (this.getNFalta())/ this.getNAula())*100);
	}
	
	@Override
	public String toString() {
		return "Nome Disciplina: "+ this.getNomeDisc()+"\n\tNotas:"+ Arrays.toString(notas)+
				"\n\tMédia Disciplina:"+ this.getMediaDisciplina() + "\n\tFrequencia:"+this.getFrequenciaDisciplina()+"%";
	}		
}
