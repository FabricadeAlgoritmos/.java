public class Main {

  public static int fatorial(int x){
    if(x == 0 || x == 1){
      return 1;
    }
    return x * fatorial(x - 1);
  }

  public static void main(String[] args){
    for(int i = 0; i <= 5; i++){
      System.out.printf("%d! = %d\n", i, fatorial(i));
    }
  }
}
