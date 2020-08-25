/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import modelo.Consultor;

/**
 *
 * @author Rosaine Fiorio
 */
public class ConsultorDao extends GenericoDao<Consultor> {

    final protected static char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public ConsultorDao() {
        super(Consultor.class);

    }

    public void verificarUsuarioAdministrador() {
        Consultor consultor = new Consultor();
        consultor.setNome("Jhonnatan Ricardo Semler");
        consultor.setCpf("052.788.749-88");
        consultor.setTelefone("(46)9912-9740");
        consultor.setEndereco("Rua sergipe, 805, Apto.: 203, Alvorada, Francisco Beltrão");
        consultor.setDataNascimento("24/02/1985");
        consultor.setSenha("jhon1985");
        consultor.setExcluido(false);
        consultor.setGerente(true);

        Consultor consultorBanco = this.buscaConsultor(consultor.getCpf());

        if (!(consultorBanco instanceof Consultor)) {
            new ConsultorDao().salvar(consultor);
        }
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for (int j = 0; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public Consultor salvar(Consultor consultor, Boolean atualizarSenha) {
        if (consultor.getId() == null || atualizarSenha) {
            consultor.setSenha(this.md5(consultor.getSenha()));
        }
        return super.salvar(consultor);
    }

    @Override
    public Consultor salvar(Consultor consultor) {

        consultor.setSenha(this.md5(consultor.getSenha()));

        return super.salvar(consultor);
    }

    public Boolean verificarLogin(Consultor consultor, String senha) {
        if (this.md5(senha).equals(consultor.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public List<Consultor> buscaConsultoresAtivos() {
        Query query = this.entityManager.createQuery("SELECT c FROM Consultor c WHERE c.excluido = :excluido");
        query.setParameter("excluido", false);

        return query.getResultList();
    }

    public Consultor buscaConsultorPorUsuario(String usuario) throws NoResultException {

        Query query = entityManager.createQuery("SELECT c FROM Consultor c WHERE c.usuario=:usuario");
        query.setParameter("usuario", usuario);

        List<Consultor> resultado = query.getResultList();
        return (resultado.size() > 0) ? resultado.get(0) : null;

    }

    public Consultor buscaConsultor(String cpf) {

        Query query = entityManager.createQuery("SELECT p FROM Consultor p WHERE p.cpf=:cpf");
        query.setParameter("cpf", cpf);

        List<Consultor> resultado = query.getResultList();
        return (resultado.size() > 0) ? resultado.get(0) : null;

    }

    public List<Consultor> buscaConultorPorCPF(String cpf) {

        Query query = this.entityManager.createQuery("SELECT p FROM Consultor p WHERE p.cpf LIKE :cpf");
        query.setParameter("cpf", "%" + cpf + "%");

        return query.getResultList();
    }

    public List<Consultor> buscaConsultorPorNome(String nome) {

        Query query = this.entityManager.createQuery("SELECT p FROM Consultor p WHERE p.nome LIKE :nome");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }

    private String md5(String string) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes());
            return (new BigInteger(1, md.digest()).toString(16));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ConsultorDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
