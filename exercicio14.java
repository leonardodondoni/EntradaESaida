import java.util.Scanner;
public class exercicio14{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        //O domingo de Páscoa é o primeiro domingo após a primeira lua cheia do
        //equinócio de outono no Hemisfério Sul. Para o cálculo da data da Páscoa
        //pode-se usar o algoritmo descrito abaixo e inventado pelo matemático Carl
        //Friedrich Gauss em 1800. Considere que
        //(parte1) y representa um ano (por exemplo 2001).
        //(parte2) divida y por 19 e armazene o resto da divisão em a.
        //(parte3) divida y por 100 
        //         e armazene o coeficiente da divisão em b e o resto da divisão em c.
        //(parte4) divida b por 4 e armazene o coeficiente da divisão em d e o resto da divisão em e.
        //(parte5) divida 8 × b + 13 por 25 e armazene o coeficiente da divisão em g.
        //(parte6) divida 19 × a + b–d–g + 15 por 30 e armazene o resto da divisão em h.
        //(parte7) divida c por 4 e armazene o coeficiente da divisão em j e o resto da divisão em k.
        //(h) divida a + 11 × h por 319 e armazene o coeficiente da divisão em m.
        //(i) divida2 × e + 2 × j–k–h + m + 32 por 7 e armazene o resto da divisão em r.
        //(j) divida h–m +r + 90 por 25 e armazene o coeficiente da divisão em n.
        //(k) divida h–m + r + n + 19 por 32 e armazene o resto da divisão em p.
        //A Páscoa será no dia p do mês n. Por exemplo, se y é 2001: a = 6, b = 20,
        //c = 1, d = 5, e = 0, g = 6, h = 18, j = 0, k = 1, m = 0, r = 6, n = 4
        //e p = 15, ou seja, em 2001, o domingo de Páscoa foi no dia 15 de abril.
        //Codifique esse algoritmo na linguagem Java.

        int letraY, letraA, letraB, letraC, letraD, letraE, letraG, letraH, letraJ, letraK, letraM, letraR, letraN, letraP;

        System.out.println("Informe um ano: ");
        letraY = teclado.nextInt();

        letraA = letraY%19;
        letraB = letraY/100;
        letraC = letraY%100;
        letraD = letraB/4;
        letraE = letraB%4;
        letraG = (8*letraB+13)/25;
        letraH = (19*letraA+letraB-letraD-letraG+15)%30;
        letraJ = letraC/4;
        letraK = letraC%4;
        letraM = (letraA+11*letraH)/319;
        letraR = (2*letraE+2*letraJ-letraK-letraH+letraM+32)%7;
        letraN = (letraH-letraM+letraR+90)/25;
        letraP = (letraH-letraM+letraR+letraN+19)%32;

        System.out.printf("A páscoa nesse ano foi no dia: %d/%d", letraP, letraN);





    







        




    
    
    
    
    }
    
}
