import java.util.Random;

import javax.swing.BoundedRangeModel;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        int[] aleatorios = new int[20];

        for(int i = 0;i<aleatorios.length;i++){
            int num = random.nextInt();
            numerosAleatorio[i]=numero;
        }

        for (int num : aleatorios) {
            System.out.println(num + " ");
        }

        for (int num : aleatorios) {
            System.out.println((num+1)=" ");
        }

    }
}
