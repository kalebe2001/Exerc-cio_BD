/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

/**
 *
 * @author User
 */
public class Funcionario {

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcao_do_funcionario
     */
    public Funcao getFuncao_do_funcionario() {
        return funcao_do_funcionario;
    }

    /**
     * @param funcao_do_funcionario the funcao_do_funcionario to set
     */
    public void setFuncao_do_funcionario(Funcao funcao_do_funcionario) {
        this.funcao_do_funcionario = funcao_do_funcionario;
    }

    /**
     * @return the endereco_do_funcionario
     */
    public Endereco getEndereco_do_funcionario() {
        return endereco_do_funcionario;
    }

    /**
     * @param endereco_do_funcionario the endereco_do_funcionario to set
     */
    public void setEndereco_do_funcionario(Endereco endereco_do_funcionario) {
        this.endereco_do_funcionario = endereco_do_funcionario;
    }
    private String nick;
    private String nome;
    private String senha;
    private Funcao funcao_do_funcionario;
    private Endereco endereco_do_funcionario;
    
}
