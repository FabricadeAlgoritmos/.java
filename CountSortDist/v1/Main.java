public class Main {



  public static void main(String[] args){

   int vet[] = {26, 19, 34, 19, 23, 16, 31, 26, 31, 22, 21, 29};
   final int maior = getMax(vet);
   final int menor = getMin(vet);

    //System.out.println("Maior: " + maior + "\nMenor: " + menor);

    int cont[] = new int[maior + 1];
    for(int i = menor; i <= maior; i++){
      cont[i] = 0;
    }

    for(int i = 0; i < vet.length; i++){
      cont[vet[i]]++;
    }

    for(int i = menor + 1; i <= maior; i++){
      cont[i] += cont[i - 1];
    }

    int saida[] = new int[vet.length];
    for(int j = 0; j < vet.length; j++){
      int i = cont[vet[j]];
      saida[i - 1] = vet[j];
      cont[vet[j]]--;
    }

    showArray(saida);

  }

  public static void showArray(int vet[]){
    for(int i = 0; i < vet.length; i++){
      System.out.print(vet[i] + "\t");
    }
  }

  public static int getMax(int vet[]){
    int m = vet[0];
    for(int i = 1; i < vet.length; i++){
      if(vet[i] > m){
        m = vet[i];
      }
    }
    return m;
  }

  public static int getMin(int vet[]){
    int m = vet[0];
    for(int i = 1; i < vet.length; i++){
      if(vet[i] < m){
        m = vet[i];
      }
    }
    return m;
  }


}//fim class
