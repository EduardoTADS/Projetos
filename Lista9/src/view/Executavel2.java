package view;

import java.util.List;
import java.util.Scanner;

import model2.Agenda;
import model2.Compromisso;
import model2.Situacao;

public class Executavel2 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("->Digite seu nome<-\n");
	        String nomeUsuario = scanner.nextLine();
	        System.out.print("->Digite o ano<-\n");
	        int anoAgenda = scanner.nextInt();
	        scanner.nextLine(); // Limpa o buffer do scanner

	        Agenda agenda = new Agenda(nomeUsuario, anoAgenda);

	        boolean sair = false;
	        while (!sair) {
	            System.out.println("\n****Selecione uma das opções abaixo****");
	            System.out.println("\t1. Adicionar compromisso");
	            System.out.println("\t2. Listar compromissos");
	            System.out.println("\t3. Remover compromisso");
	            System.out.println("\t4. Sair");

	            System.out.print("Digite a opção aqui - ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer do scanner

	            switch (opcao) {
	                case 1:
	                	 adicionarCompromissos(agenda, scanner);
		                    break;
	                    
	                case 2:
	                	listarCompromissos(agenda);
	                    break;
	                case 3:
	                    removerCompromisso(agenda, scanner);
	                    break;
	                case 4:
	                    sair = true;
	                    System.out.println("Você Saiu...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }

	        scanner.close();
	    }
	 private static void listarCompromissos(Agenda agenda) {
	        System.out.println("\n----Todos meus compromissos----");
	        List<Compromisso> compromissos = agenda.getListaCompromisso();

	        if (compromissos.isEmpty()) {
	            System.out.println(Situacao.LIST_VAZIA);
	        } else {
	            for (Compromisso compromisso : compromissos) {
	                System.out.println(compromisso.getNome() + " - " + compromisso.getDescricao());
	            }
	        }
	    }
	 
	 private static void adicionarCompromissos(Agenda agenda, Scanner scanner) {
	        System.out.print("Digite Quantos compromissos quer adicionar ->");
	        int quantidadeCompromissos = scanner.nextInt();
	        scanner.nextLine(); // Limpa o buffer do scanner

	        for (int i = 0; i < quantidadeCompromissos; i++) {
	            System.out.println("Compromisso" + (i + 1));
	            System.out.print("Digite o nome do compromisso: ");
	            String nomeCompromisso = scanner.nextLine();
	            System.out.print("Digite o dia do compromisso: ");
	            int diaCompromisso = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer do scanner
	            System.out.print("Digite o mês do compromisso: ");
	            int mesCompromisso = scanner.nextInt();
	            scanner.nextLine(); // Limpa o buffer do scanner
	            System.out.print("Digite aqui a descrição: ");
	            String descricaoCompromisso = scanner.nextLine();

	            Compromisso compromisso = new Compromisso(nomeCompromisso, diaCompromisso, mesCompromisso, descricaoCompromisso);
	            agenda.adicionarCompromisso(compromisso);
	        }

	        System.out.println(Situacao.ADD);
	    }

	    private static void removerCompromisso(Agenda agenda, Scanner scanner) {
	        System.out.print("Digite aqui o nome do compromisso a ser removido: ");
	        String nomeCompromisso = scanner.nextLine();

	        Compromisso compromisso = agenda.getCompromissoPorNome(nomeCompromisso);
	        if (compromisso == null) {
	            System.out.println("Compromisso não encontrado.");
	        } else {
	            agenda.removerCompromisso(compromisso);
	            System.out.println(Situacao.REMOVER);
	        }
	    }
}
