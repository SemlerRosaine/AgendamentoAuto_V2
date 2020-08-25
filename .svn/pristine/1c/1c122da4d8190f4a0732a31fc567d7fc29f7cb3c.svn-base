/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rosaine Fiorio
 */
@Entity
@Table(name = "consultor")
public class Consultor extends Pessoa {

    @Column
    private Boolean excluido = false;
    @Column
    private String senha;
    @Column
    private Boolean trocarSenha = false;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;
    @Column
    private Boolean gerente = false;

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getTrocarSenha() {
        return trocarSenha;
    }

    public void setTrocarSenha(Boolean trocarSenha) {
        this.trocarSenha = trocarSenha;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public Boolean getGerente() {
        return gerente;
    }

    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
