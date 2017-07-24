
package arquivoindexado;

public class ArquivoIndexado {

    public static void main(String[] args) {
        Usuario lista[] = new Usuario[50];
        
        lista[0] = new Usuario(33, "Jane Doe", true);
        
        lista[1] = new Usuario(0, "Many", true);
        
        lista[2] = new Usuario(10, "Juju", true);
        
        int endList = 2;
        //showUsers(lista, endList);
        
        // Incializando Arquivo de Indice
        Indice index[] = new Indice[50];
        
        index[0] = new Indice(0, 1);
        index[1] = new Indice(10, 2);
        index[2] = new Indice(33, 0);
        
        //showIndex(index, endList);
        
        Sistema s = new Sistema();
        s.Inserir(lista, index, endList);
        endList++;
        System.out.println("Inserindo Dados...");
        showUsers(lista, endList);
        showIndex(index, endList);
        
        System.out.println("\nRemovendo Dados...");
        s.Remover(lista, index, endList);
        
        System.out.println("\nImprimindo Logicamente...");
        s.Imprima(lista, endList);
        
        System.out.println("\nBuscando Dados...");
        s.Busca(lista, index, endList);
        
        System.out.println("\nRemovendo Dados...");
        s.Remover(lista, index, endList);
        
        System.out.println("Atualizando Lista");
        Usuario newList[] = new Usuario[50];
        
        endList = s.Atualiza(lista, newList, index, endList);
        System.out.println("Lista Atualizada");
        showUsers(newList, endList);
        showIndex(index, endList);
      
    }
    
    public static void showUsers(Usuario[] u, int FIM){
        System.out.println("\nLista de Usuarios");
          for(int i = 0; i <= FIM; i++){
            System.out.print("[");
            System.out.print("Id=>" + u[i].id + ", ");
            System.out.print("Nome=>" + u[i].nome + ", ");
            System.out.print("Status=>" + u[i].status);
            System.out.print("]");
            if(i < FIM){
                System.out.print(",\n");
            }else{
                System.out.println();
            }
        }
    }
    
        public static void showIndex(Indice[] ind, int FIM){
          System.out.println("\nArquivo de Indice");
          for(int i = 0; i <= FIM; i++){
            System.out.print("[");
            System.out.print("Codigo=>" + ind[i].cod + ", ");
            System.out.print("Posicao=>" + ind[i].posicao);
            System.out.print("]");
            if(i < FIM){
                System.out.print(",\n");
            }else{
                System.out.println();
            }
        }
    }
    
    
    
}
