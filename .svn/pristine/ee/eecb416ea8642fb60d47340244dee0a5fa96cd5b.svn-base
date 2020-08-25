/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.Carro;
import modelo.Pessoa;

/**
 *
 * @author Rosaine Fiorio
 */
public class CarroDao extends GenericoDao<Carro> {

    public CarroDao() {
        super(Carro.class);
    }

    public List<Carro> buscarCarros(Pessoa cliente) {
        Query query = entityManager.createQuery("SELECT c FROM Carro c WHERE c.cliente=:cliente");
        query.setParameter("cliente", cliente);
        List<Carro> resultado;
        try {
            resultado = query.getResultList();
        } catch (NoResultException e) {
            resultado = null;
        }
        return resultado;
    }

    public List<Carro> buscarCarro(String placa, Pessoa cliente) {
        Query query = entityManager.createQuery("SELECT c FROM Carro c WHERE c.placa LIKE :placa AND c.cliente=:cliente");
        query.setParameter("placa", "%" + placa + "%");
        query.setParameter("cliente", cliente);
        List<Carro> resultado;
        try {
            resultado = query.getResultList();
        } catch (NoResultException e) {
            resultado = null;
        }
        return resultado;
    }
}
