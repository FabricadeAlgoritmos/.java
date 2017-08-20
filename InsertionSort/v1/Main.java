import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    int vetor[] = new int[6];
    int fim, aux, i;
    fim = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor ~:> ");
    vetor[fim] = input.nextInt();
    fim++;
    while(fim < 6){
      System.out.print("Informe o valor ~:> ");
      aux = input.nextInt();
      i = fim;
      while(i > 0 && aux < vetor[i - 1]){
        vetor[i] = vetor[i - 1];
        i--;
      }
      vetor[i] = aux;
      fim++;
    }

    for(i = 0; i < 6; i++){
      System.out.print(vetor[i] + "\t");
    }
  }
}
