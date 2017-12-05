public class Main {

  public static int fibonacci(int x){
    if(x == 0 || x == 1){
      return 1;
    }
    return fibonacci(x - 1) + fibonacci(x - 2);
  }

  public static void main(String args[]){
    for(int i = 0; i <= 10; i++){
      System.out.printf("%d\t", fibonacci(i));
    }
  }
}
