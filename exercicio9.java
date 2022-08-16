import java.util.Scanner;
public class exercicio9 {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        //Faça um programa que lê a altura de uma pessoa em metros e a escreve
        //em centímetros e em milímetros.

        double alturaMetros, alturaCentimetros, alturaMilimetros;

        System.out.println("Informe a altura de uma pessoa em metros: ");
        alturaMetros = teclado.nextDouble();
        alturaCentimetros = alturaMetros*100;
        alturaMilimetros = alturaMetros*1000;
        System.out.printf("Altura em metros:%f\nAltura em centímetros:%f\nAltura em milímetros:%f",alturaMetros, alturaCentimetros, alturaMilimetros);








    }
    
}
