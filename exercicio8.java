import java.util.Scanner;
public class exercicio8 
{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        //Faça um programa que leia as dimensões de um terreno (largura e comprimento) 
        //e a dimensões da casa (largura e comprimento) construída nesse
        //mesmo terreno, o programa deve calcular e escrever a área livre existente
        //no terreno.

        double larguraTerreno, comprimentoTerreno, larguraCasa, comprimentoCasa, areaLivre;

        System.out.println("Informe a largura do terreno: ");
        larguraTerreno = teclado.nextDouble();
        System.out.println("Informe o comprimento do terreno: ");
        comprimentoTerreno = teclado.nextDouble();
        System.out.println("Informe a largura da casa: ");
        larguraCasa = teclado.nextDouble();
        System.out.println("Informe o comprimento da casa: ");
        comprimentoCasa = teclado.nextDouble();
        areaLivre = (larguraTerreno+comprimentoTerreno)-(larguraCasa+comprimentoCasa);
        System.out.printf("Área livre: %f", areaLivre);

    













    }


}
