public class Main{
  public static void main(String[] args){
    int vet[] = {5, 4, 3, 2, 1};
    for(int i = 0; i < vet.length - 1; i++){
      int menor = i;
      for(int j = i + 1; j < vet.length; j++){
        if(vet[menor] > vet[j]){
          menor = j;
        }
      }
      int aux = vet[i];
      vet[i] = vet[menor];
      vet[menor] = aux;
    }

    for(int i = 0; i < vet.length; i++){
      System.out.print(vet[i] + "\t");
    }
  }
}
