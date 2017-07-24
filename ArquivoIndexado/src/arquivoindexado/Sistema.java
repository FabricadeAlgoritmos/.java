/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoindexado;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class Sistema {
    
    private int indices[] = {2, 5, 9, 11, 19, 32, 55, 4};
    private String nomes[] = {"Mabel", "Dipper", "Finn", "Jake", "Lain"};
        
    public void Inserir(Usuario[] u, Indice[] i, int FIM){
        if(FIM < 50){
            FIM++;
            u[FIM] = new Usuario(randId(), randNome(), true);
            
            int aux = FIM - 1;
            while(aux >= 0 && u[FIM].id < i[aux].cod){
                i[aux + 1] = new Indice(i[aux].cod, i[aux].posicao);
                aux--;
            }
            i[aux + 1].cod = u[FIM].id;
            i[aux + 1].posicao = FIM; 
        }
    }
    
    public void Remover(Usuario[] u, Indice[] i, int FIM){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o codigo da Busca: ");
        int codigo = input.nextInt();
        
        int inicio = 0;
        int meio = (inicio + FIM) / 2;
        while(codigo != i[meio].cod && inicio < FIM){
            if(codigo > i[meio].cod){
                inicio = meio + 1;
            }else{
                FIM = meio - 1;
            }
            meio = (inicio + FIM) / 2;
        }
        int posicao = i[meio].posicao;
        if(codigo == u[posicao].id){
            u[posicao].status = false; // Remove Logicamente da Lista
        }else{
            System.out.println("Codigo não existe na lista!");
        }
        
    }
    
    public void Busca(Usuario[] u, Indice[] i, int FIM){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o codigo da Busca: ");
        int codigo = input.nextInt();
        
        int inicio = 0;
        int meio = (inicio + FIM) / 2;
        while(codigo != i[meio].cod && inicio < FIM){
            if(codigo > i[meio].cod){
                inicio = meio + 1;
            }else{
                FIM = meio - 1;
            }
            meio = (inicio + FIM) / 2;
        }
        int posicao = i[meio].posicao;
        if(codigo == u[posicao].id && u[posicao].status){
                System.out.println("Encontrado!!!");
                System.out.print("[");
                System.out.print("Id=>" + u[posicao].id + ", ");
                System.out.print("Nome=>" + u[posicao].nome + ", ");
                System.out.print("Status=>" + u[posicao].status);
                System.out.print("]\n");
        }else{
            System.out.println("Codigo não existe na lista!");
        }
        
    }    
    
    // atualiza a lista e retorna o final da nova lista
    public int Atualiza(Usuario[] oldList, Usuario[] list, Indice[] i, int FIM){
        int count = 0;
        int k = 0;
        while(count <= FIM){
            int posicao = i[count].posicao;
            if(oldList[posicao].status){
                list[k] = new Usuario(oldList[posicao].id, oldList[posicao].nome, true);
                i[k].cod = oldList[posicao].id;
                i[k].posicao = k;
                k++;
            }
            count++;
        }
        return k - 1;
    }
    
    
    // Imprime Apenas Usuarios com Status True
    public void Imprima(Usuario[] u, int FIM){
        for(int i = 0; i <= FIM; i++){
            if(u[i].status){
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
    }
    
    public int randId(){
        int num = (int)(0 + Math.random() * (8 - 0));
        return indices[num];
    }
    
    public String randNome(){
        int num = (int)(0 + Math.random() * (5 - 0));
        return nomes[num];
    }
}
