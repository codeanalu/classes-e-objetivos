/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class PrincipalEx1 {
    public static void main(String[] args) {
        // 4. Receber os valores para os atributos 
        try (Scanner leitor = new Scanner(System.in)) {
            // 4. Receber os valores para os atributos 
            System.out.print("Digite o nome: ");
            String nome = leitor.nextLine();
            
            System.out.print("Digite o sobrenome: ");
            String sobrenome = leitor.nextLine();
            
            System.out.print("Digite a idade: ");
            int idade = leitor.nextInt();
            
            System.out.print("Digite a altura (use vírgula, ex: 1,75): ");
            double altura = leitor.nextDouble();
            
            System.out.print("Digite o peso (use vírgula, ex: 70,2): ");
            double peso = leitor.nextDouble();
            
            // Criando o objeto Pessoa com os dados recebidos;
            Pessoa pessoaInstanciada = new Pessoa(nome, sobrenome, idade, altura, peso);
            
            // 4. Calcular o IMC; 
            double imcCalculado = pessoaInstanciada.CalculaIMC();
            
            // 4. Exibir para o usuário o valor do IMC e a faixa de massa corporal 
            System.out.println("\n--- RESULTADO ---");
            System.out.printf("Valor do IMC: %.2f\n", imcCalculado);
            System.out.println("Faixa de massa corporal: " + pessoaInstanciada.InformaObesidade());
        }
    }
}