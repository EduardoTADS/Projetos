package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;
import model.Situacao;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		Disciplina disciplina = new Disciplina();
		disciplina.setNomeDisc("ED");
		disciplina.setNAula(80.0f);
		disciplina.setNFalta(23.0f);
		
		float nota[] = new float[] {8.0f, 5.5f, 9.2f};
		disciplina.setNotas(nota);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Aluno");
		aluno1.setDisciplina(disciplina);
		
		List<Aluno> listaAprovado = new ArrayList<Aluno>();
		List<Aluno> listaReprovado = new ArrayList<Aluno>();
		List<Aluno> listaRecuperacao = new ArrayList<Aluno>();
		
		listaAlunos.add(aluno1);
		
		for(int i = 0; i < 1; i++) {
			Aluno aluno = new Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
			
			for (int j=0; j < 2; j++) {
				Disciplina disc = new Disciplina();
				disc.setNomeDisc(JOptionPane.showInputDialog("Digite o nome da Disciplina" + (j+1)));
				disc.setNAula(Float.parseFloat(JOptionPane.showInputDialog("Digite o Nº de Aulas: ")));
				disc.setNFalta(Float.parseFloat(JOptionPane.showInputDialog("Digite o Nº de Faltas: ")));
				
				float notas[] = new float[3];
				for(int n = 0; n < notas.length; n++) {
					notas[n] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota"+ (n+1))); 
				}
				disc.setNotas(notas);
				aluno.setDisciplina(disc);
			}
			listaAlunos.add(aluno);
		}
		
		for(Aluno al : listaAlunos) {
			if(al.getSituacao() == Situacao.APROVADO) {
				listaAprovado.add(al);
			}else if(al.getSituacao() == Situacao.RECUPERACAO) {
				listaRecuperacao.add(al);
			}else {
				listaReprovado.add(al);
			}
		}
		
		System.out.println("----TODOS OS ALUNOS----");
		for(Aluno al: listaAlunos) {
			System.out.println(al.toString());
		}
		
		System.out.println("----TODOS OS ALUNOS APROVADOS----");
		for(Aluno al: listaAprovado) {
			System.out.println(al.toString());
		}
		
		System.out.println("----TODOS OS ALUNOS RECUPERAÇÃO----");
		for(Aluno al: listaRecuperacao) {
			System.out.println(al.toString());
		}
		
		System.out.println("----TODOS OS ALUNOS REPROVADOS----");
		for(Aluno al: listaReprovado) {
			System.out.println(al.toString());
		}
	}
	
}
