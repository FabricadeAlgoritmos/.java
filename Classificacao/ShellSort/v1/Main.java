public class Main {

  public static void showArray(int[] v){
    System.out.print("[ ");
    for(int i = 0; i < v.length; i++){
      if(i < v.length - 1){
        System.out.print(v[i] + ", ");
      }else{
        System.out.print(v[i]);
      }
    }
    System.out.print(" ]");
  }

  public static void activeInsertion(int []v){
    for(int i = 1; i < v.length; i++){
      int j = i;
      while(v[j] < v[j - 1] && j > 0){
        int aux = v[j - 1];
        v[j - 1] = v[j];
        v[j] = aux;
        j--;
      }
    }
  }

  public static void main(String[] args){
    int vet[] = {32, 18, 45, 29, 16, 41, 30, 27 , 14, 37, 29, 38, 20, 32, 17, 26};
    int inc[] = {8, 4, 2, 1};

    int x = 0;
    while(inc[x] > 1){
      int i = 0;
      int j = inc[x];
      while(j < vet.length){
        if(vet[i] > vet[j]){
          int aux = vet[i];
          vet[i] = vet[j];
          vet[j] = aux;
        }
        j++;
        i++;
      }
      x++;
    }
    
    activeInsertion(vet);
    showArray(vet);
  }//fim main
}//fim class
