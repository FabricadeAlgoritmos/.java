
package arquivosequencial;

import java.util.Scanner;

public class ArquivoSequencial {
    
    public static void main(String[] args) {
      
      System.out.println("Inserindo dados...");
      int listaVelha[] = {1,5,25,65,98,101,220};
      int lote[] = {2,60,79,356};
      int novaLista[] = new int[11];
      
      showList(listaVelha, "Lista Velha");
      showList(lote, "Lote");
      
      //Gerando nova lista
      System.out.println("Gerando nova lista...");
      int i = 0, j = 0, k = 0;
      while(i < listaVelha.length && j < lote.length){
          if(listaVelha[i] < lote[j]){
              novaLista[k] = listaVelha[i];
              i++;
          }else{
              novaLista[k] = lote[j];
              j++;
          }
         k++; 
      }
      
      while(i < listaVelha.length){
        novaLista[k] = listaVelha[i];
        i++;
        k++;
      }
      
       while (j < lote.length) {
         novaLista[k] = lote[j];
         j++;
         k++;
       }
      showList(novaLista, "Nova Lista");
      
      // Removendo dados
      System.out.println("\nRemovendo dados...");
      //int oldList[] = {1,5,25,65,98,101,220};
      int novoLote[] = {1, 65, 101, 220};
      showList(novaLista, "Lista Atual");
      showList(novoLote, "novoLote");
      int TAM = novaLista.length - novoLote.length;
      int listaAtualizada[] = new int[TAM];
      
      i = 0; 
      j = 0; 
      k = 0;
      
      while(j < novoLote.length){
          if(novaLista[i] != novoLote[j]){
              listaAtualizada[k] = novaLista[i];
              System.out.println("Lista[" + k + "] recebe " + novaLista[i]);
              k++;
          }else{
              System.out.println(novoLote[j] + " removido!");
              j++;
          }
          i++;
      }
      
      while(i < novaLista.length){
          listaAtualizada[k] = novaLista[i];
          System.out.println("Lista[" + k + "] recebe " + novaLista[i]);
          k++;
          i++;
      }
      
      showList(listaAtualizada, "Lista Atualizada");
      
      // Busca Binária
      System.out.println("\nBuscando dados...");
      showList(novaLista, "Lista");
      Scanner input = new Scanner(System.in);
      System.out.print("Informe o codigo: ");
      int cod = input.nextInt();
      int inicio = 0, fim = novaLista.length - 1;
      int meio = (inicio + fim) / 2;
      System.out.println("Buscando...");
      while(cod != novaLista[meio] && inicio < fim){
          if(cod > novaLista[meio]){
              inicio = meio + 1;
          }else{
              fim = meio - 1;
          }
          meio = (inicio + fim) / 2; 
      }
      if(cod == novaLista[meio]){
          System.out.println(novaLista[meio] + " encontrado na posição[" + meio + "]");
      }else{
          System.out.println("valor não existe na lista");
      }
    }
    
    public static void showList(int[] li, String nome){
        System.out.print(nome + "={");
        for(int i = 0; i < li.length; i++){
            if(i < li.length - 1){
                System.out.print(li[i] + ",");
            }else{
                System.out.print(li[i]);
            }
        }
        System.out.print("}\n");
    }
    
}
