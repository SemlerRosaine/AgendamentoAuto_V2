/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import modelo.Imodelo;
import modelo.fabrica.Fabrica;

/**
 *
 * @author Rosaine Fiorio
 */
public class GenericoDao<K extends Imodelo> {

    protected EntityManager entityManager = Fabrica.getEntityManager();
    protected EntityTransaction transaction;
    private Class nomeClasse;

    public GenericoDao(Class nomeClasse) {
        this.nomeClasse = nomeClasse;

    }
    
    public K salvar(K objeto){
        if(objeto.getId()==null){
            return incluirBanco(objeto);
        }else{
            return alterarBanco(objeto);
        }
    }

    public K incluirBanco(K objeto) {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(objeto);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            objeto = null;
        }

        return objeto;

    }

    public K alterarBanco(K objeto) {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(objeto);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            objeto = null;
        }
        return objeto;
    }

    public Boolean excluirBanco(K objeto) {
        boolean retorno = false;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(entityManager.find(this.nomeClasse, objeto.getId()));
            transaction.commit();
            retorno = true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return retorno;
    }

    public K carrega(K objeto) {
        K retorno = null;

        try {
            retorno = (K) entityManager.find(this.nomeClasse, objeto.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public List<K> carregaTodos() {
        List<K> objetos = new ArrayList<K>();
        Query query = entityManager.createQuery(
                "select b from " + this.nomeClasse.getCanonicalName() + " b");
        objetos = query.getResultList();
        entityManager.close();
        return objetos;
    }
}
