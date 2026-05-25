/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public final class Pessoa {
    // 1. Atributos da classe Pessoa encapsulados[span_0](end_span)[span_1](end_span)
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = CalculaIMC(); // Calcula o IMC automaticamente;
    }

    public double CalculaIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String InformaObesidade() {

        if (this.imc < 18.5) {
            return "Abaixo do peso";
        } else if (this.imc >= 18.5 && this.imc <= 24.9) {
            return "Peso normal";
        } else if (this.imc >= 25 && this.imc <= 29.9) {
            return "Sobrepeso";
        } else if (this.imc >= 30 && this.imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (this.imc >= 35 && this.imc <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getImc() { return imc; }
    public void setImc(double imc) { this.imc = imc; }
}
