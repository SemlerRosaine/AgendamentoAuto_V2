/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import modelo.Agendamento;
import modelo.Consultor;
import modelo.Pessoa;

/**
 *
 * @author Rosaine Fiorio
 */
public class AgendamentoDao extends GenericoDao<Agendamento> {

    public AgendamentoDao() {
        super(Agendamento.class);
    }

    public List<Agendamento> contaAgendamentos(Consultor consultor, Date dataInicial, Date dataFinal) {
        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.consultor = :consultor AND a.dataAgendamento BETWEEN :dataInicial AND :dataFinal ORDER BY a.dataInclusao");
        query.setParameter("consultor", consultor);
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        return query.getResultList();
    }
    public List<Agendamento> contaAgendamentosConsultores(Date dataInicial, Date dataFinal) {
        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.dataAgendamento BETWEEN :dataInicial AND :dataFinal ORDER BY a.dataInclusao");
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        return query.getResultList();
    }
    public Agendamento buscaAgenda(Pessoa cliente) {

        Query query = entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cliente LIKE :cliente ORDER BY a.dataInclusao");
        query.setParameter("cliente", cliente);

        Object resultado = query.getSingleResult();
        return (resultado instanceof Agendamento) ? (Agendamento) resultado : null;

    }

    public List<Agendamento> buscaAgendaPorCPF(String cpf) {

        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cliente.cpf LIKE :cpf ORDER BY a.dataInclusao");
        query.setParameter("cpf", "%" + cpf + "%");

        return query.getResultList();
    }

    public List<Agendamento> buscaAgendaPorNome(String nome) {

        Query query = this.entityManager.createQuery("SELECT a FROM Agendamento a WHERE a.cliente.nome LIKE :nome ORDER BY a.dataInclusao");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }
}
