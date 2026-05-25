/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class PrincipalEx2 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            boolean continuar = true;
            
            // Loop para receber os dados dos alunos
            while (continuar) {
                System.out.println("--- Digite as características do novo Aluno ---");
                
                System.out.print("Nome: ");
                String nome = leitor.nextLine();
                
                System.out.print("Idade: ");
                int idade = leitor.nextInt();
                
                System.out.print("Nota de Coragem: ");
                double coragem = leitor.nextDouble();
                
                System.out.print("Nota de Inteligência: ");
                double inteligencia = leitor.nextDouble();
                
                System.out.print("Nota de Ambição: ");
                double ambicao = leitor.nextDouble();
                
                System.out.print("Nota de Lealdade: ");
                double lealdade = leitor.nextDouble();
                
                System.out.print("Nota de Estratégia: ");
                double estrategia = leitor.nextDouble();
                
                System.out.print("Nota de Criatividade: ");
                double criatividade = leitor.nextDouble();
                
                leitor.nextLine(); // Limpa o buffer do teclado;
                
                // Criando e classificando o aluno
                Aluno estudante = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);
                estudante.calcularCasa();
                estudante.exibirInformacoes();
                
                // O programa encerra apenas quando o usuário solicitar
                System.out.print("Deseja continuar cadastrando? (S para Sim / N para Não): ");
                String resposta = leitor.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    continuar = false; // Encerra o loop;
                }
            }
            
            System.out.println("Sistema do Chapéu Seletor fechado com sucesso!");
        }
    }
}