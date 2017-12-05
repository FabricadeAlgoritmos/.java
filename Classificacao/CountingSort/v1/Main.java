public class Main {

  public static void imprima(int[] vet){
    for(int i = 0; i < vet.length; i++){
      System.out.println(vet[i]);
    }
  }

  public static void main(String[] args){
    int vet[] = {5, 4, 3, 2, 1};
    int count[] = new int[5];
    int saida[] = new int[5];
    for(int i = 0; i < vet.length - 1; i++){
      for(int j = i + 1; j < vet.length; j++){
        if(vet[i] > vet[j]){
          count[i]++;
        }else{
          count[j]++;
        }
      } // fim for j
    } // fim for i

    for(int i = 0; i < vet.length; i++){
      saida[count[i]] = vet[i];
    }

    imprima(saida);
  } // fim main
} // fim class
