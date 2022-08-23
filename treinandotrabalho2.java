import java.util.Scanner;
public class treinandotrabalho2 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        //Uma escola decidiu levar seus alunos ao teatro e precisa saber 
        //quantos ônibus serão necessários para o transporte desses alunos. 
        //A empresa que a escola costuma contratar possui ônibus de 46 lugares (assentos). 
        //Faça um programa em Java que leia a quantidade de alunos,
        //calcule e escreva a quantidade de ônibus que deve ser contratada pela escola.

        double alunos;

        System.out.println("Informe a quantidade de alunos:");
        alunos = teclado.nextDouble();
        double quantidadeDeOnibusContratatoPelaEscola = Math.ceil(alunos/46);

        System.out.println("Quantidade de ônibus necessários para transportar essa quantidade de alunos:" +quantidadeDeOnibusContratatoPelaEscola);



         





    }
    
}
