/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.Cliente;
import modelo.Pessoa;

/**
 *
 * @author Jhonnatan
 */
public class ClienteDAO extends GenericoDao<Cliente>{

    public ClienteDAO() {
        super(Cliente.class);
    }
    
    public Cliente buscaPessoa(String cpf) {

        Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cpf=:cpf");
        query.setParameter("cpf", cpf);
        Object resultado;
        try {
            resultado = query.getSingleResult();
        } catch (NoResultException e) {
            resultado = null;
        }
        return (resultado instanceof Cliente) ? (Cliente) resultado : null;

    }

    public List<Cliente> buscaClientesPorCPF(String cpf) {

        Query query = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cpf LIKE :cpf");
        query.setParameter("cpf", "%" + cpf + "%");

        return query.getResultList();
    }

    public List<Cliente> buscaClientesPorNome(String nome) {

        Query query = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :nome");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }
}
