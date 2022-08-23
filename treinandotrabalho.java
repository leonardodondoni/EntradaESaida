import java.util.Scanner;
public class treinandotrabalho {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        
        //Faça um programa em Java que leia as notas de 4 exercícios de um aluno, 
        //calcule e escreva para essas notas as médias:
        //a)    Geométrica 
        //b)    Harmônica

        double nota1,nota2,nota3,nota4,totalNotas;

        System.out.println("Valor da primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Valor da segunda nota:");
        nota2 = teclado.nextDouble();
        System.out.println("Valor da terceira nota:");
        nota3 = teclado.nextDouble();
        System.out.println("Valor da quarta nota:");
        nota4 = teclado.nextDouble();
        totalNotas = nota1*nota2*nota3*nota4;

        double mediaGeometrica = Math.pow(totalNotas,0.25);

        double mediaHarmonica = 4/(1/nota1)+(1/nota2)+(1/nota3)+(1/nota4);
        


        
        System.out.printf("Média Geométrica:%f\nMédia Harmônica:%f", mediaGeometrica,mediaHarmonica);
          
        



    }
    
}
