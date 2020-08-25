/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.Pessoa;

/**
 *
 * @author Rosaine Fiorio
 */
public class PessoaDao extends GenericoDao<Pessoa> {

    public PessoaDao() {
        super(Pessoa.class);
    }

    public Pessoa buscaPessoa(String cpf) {

        Query query = entityManager.createQuery("SELECT p FROM Pessoa p WHERE p.cpf=:cpf");
        query.setParameter("cpf", cpf);
        Object resultado;
        try {
            resultado = query.getSingleResult();
        } catch (NoResultException e) {
            resultado = null;
        }
        return (resultado instanceof Pessoa) ? (Pessoa) resultado : null;

    }

    public List<Pessoa> buscaPessoasPorCPF(String cpf) {

        Query query = this.entityManager.createQuery("SELECT p FROM Pessoa p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", "%" + cpf + "%");

        return query.getResultList();
    }

    public List<Pessoa> buscaPessoasPorNome(String nome) {

        Query query = this.entityManager.createQuery("SELECT p FROM Pessoa p WHERE p.nome LIKE :nome");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }
}
