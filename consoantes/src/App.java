import java.util.Scanner;
/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas
 * imprima as consoantes
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String[] conso = new String[6];
        int quantConso = 0;
        int count=0;

        do{
            System.out.println("Manda letra ai comedia: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) ){

                    conso[count] = letra;
                    quantConso++;

            }

            count++;

        }while(count<conso.length);

        for (String  consoantes : conso) {
            System.out.println(conso);
        }

        scan.close();

    }
}
