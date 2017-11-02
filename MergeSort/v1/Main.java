public class Main {
  public static void main(String args[]){
    int vet1[] = {1, 3, 5, 7, 9};
    int vet2[] = {2, 4, 6, 8, 10};

    int vet3[] = new int[10];

    int i = 0, j = 0, k = 0;

    while(i < vet1.length && j < vet2.length){
      if(vet1[i] < vet2[j]){
        vet3[k] = vet1[i];
        i++;
      }else{
        vet3[k] = vet2[j];
        j++;
      }
      k++;
    }

    while(i < vet1.length){
      vet3[k] = vet1[i];
      i++;
      k++;
    }

    while(j < vet2.length){
      vet3[k] = vet2[j];
      j++;
      k++;
    }

    showArray(vet3);

  }// fim main

  public static void showArray(int []v) {
    for(int i = 0; i < v.length; i++){
        System.out.printf("%d\t", v[i]);
    }
  }
}
