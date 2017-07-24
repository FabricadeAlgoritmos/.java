/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivoindexado;

/**
 *
 * @author Eric
 */
public class Usuario {
    
    // Atributos
    public int id;
    public String nome;
    public boolean status;
    
    public Usuario(int id, String no, boolean st){
        this.id = id;
        this.nome = no;
        this.status = st;
    }
}
