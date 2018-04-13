/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.controller;

import br.com.mycompany.model.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Raphael
 */
@ManagedBean(name="pessoaMB")
@ViewScoped
public class PessoaMB implements Serializable{

    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
    
    public PessoaMB() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoaLista() {
        return pessoaLista;
    }

    public void setPessoaLista(List<Pessoa> pessoaLista) {
        this.pessoaLista = pessoaLista;
    }
    
    public void salvarPessoa(){
        pessoaLista.add(pessoa);
        pessoa = new Pessoa();
    }
}
