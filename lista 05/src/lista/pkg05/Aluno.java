/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Aluno {
    // Atributos solicitados pela atividade
    public String nome; 
    public int idade; 
    public double coragem; 
    public double inteligencia;
    public double ambicao;
    public double lealdade;
    public double estrategia; // Atributo necessário para a fórmula da Sonserina; 
    public double criatividade; // Atributo necessário para a fórmula da Corvinal; 
    public String casa;

    // Construtor da classe Aluno;
    public Aluno(String nome, int idade, double coragem, double inteligencia, 
                 double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = "Não selecionado";
    }

    // Método calcularCasa() 
    public void calcularCasa() {
        // Fórmulas fornecidas para cada casa
        double grifinoria = (2 * coragem) + lealdade;
        double sonserina = (2 * ambicao) + estrategia;
        double corvinal = (2 * inteligencia) + criatividade;
        double lufaLufa = ((2 * lealdade) + coragem) / 3;

        // Definição da casa com a MAIOR pontuação 
        double maiorPontuacao = grifinoria;
        this.casa = "Grifinória";

        if (sonserina > maiorPontuacao) {
            maiorPontuacao = sonserina;
            this.casa = "Sonserina";
        }
        if (corvinal > maiorPontuacao) {
            maiorPontuacao = corvinal;
            this.casa = "Corvinal";
        }
        if (lufaLufa > maiorPontuacao) {
            maiorPontuacao = lufaLufa;
            this.casa = "Lufa-Lufa";
        }
    }

    // Método exibirInformacoes() 
    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DO ALUNO ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Casa Designada: " + this.casa);
        System.out.println("============================\n");
    }
}