/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *EntityManager responsavel por abrir e fechar a conexao com o banco
 * @author Rosaine Fiorio
 */
public class Fabrica {

    private static EntityManagerFactory emf;

    private Fabrica() {
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("app_pu");

        }
        return emf.createEntityManager();

    }
}