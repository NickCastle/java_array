
//Crie um vetor de 6 numeros inteiros e mostre a ordem inversa

//pode haver varios elementos, mas todos do mesmo tipo


public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {0, -7, 25, 8, 10, 32};


        /*
        int count=0;
        while(count < vetor.length-1){
            System.out.println(vetor[count]);
            count++;
        }
        */

        for(int i = vetor.length-1; i>=0; i--){
            System.out.println(vetor[i]);
        }
    }
}
