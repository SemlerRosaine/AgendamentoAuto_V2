package modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rosaine Fiorio
 */
@Entity
@Table(name = "agendamento")
public class Agendamento extends Registro {

    @ManyToOne
    private Consultor consultor;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInclusao;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAgendamento;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRecepcao;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntregaPrevista;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrega;
    @Column
    private Integer numeroOS;
    @Column
    private String codigoPrisma;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "veiculo")
    private Carro veiculo;
    @Column
    private String motivoVisita;
    @Column
    private Boolean agendado = false;
    @Column
    private Boolean efetivo = false;
    @Column
    private Boolean retorno = false;
    @Column
    private Boolean orcamento = false;
    @Column
    private Boolean veiculoProntoRevisado = false;
    @Column
    private Boolean explicacaoTrabalho = false;
    @Column
    private Boolean elevador = false;
    @Column
    private Boolean requisicaoPecas = false;

    public Consultor getConsultor() {
        return consultor;
    }

    public void setConsultor(Consultor consultor) {
        this.consultor = consultor;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Date getDataRecepcao() {
        return dataRecepcao;
    }

    public void setDataRecepcao(Date dataRecepcao) {
        this.dataRecepcao = dataRecepcao;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Integer getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(Integer numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getCodigoPrisma() {
        return codigoPrisma;
    }

    public void setCodigoPrisma(String codigoPrisma) {
        this.codigoPrisma = codigoPrisma;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public Boolean getAgendado() {
        return agendado;
    }

    public void setAgendado(Boolean agendado) {
        this.agendado = agendado;
    }

    public Boolean getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(Boolean efetivo) {
        this.efetivo = efetivo;
    }

    public Boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }

    public Boolean getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Boolean orcamento) {
        this.orcamento = orcamento;
    }

    public Boolean getVeiculoProntoRevisado() {
        return veiculoProntoRevisado;
    }

    public void setVeiculoProntoRevisado(Boolean veiculoProntoRevisado) {
        this.veiculoProntoRevisado = veiculoProntoRevisado;
    }

    public Boolean getExplicacaoTrabalho() {
        return explicacaoTrabalho;
    }

    public void setExplicacaoTrabalho(Boolean explicacaoTrabalho) {
        this.explicacaoTrabalho = explicacaoTrabalho;
    }

    public Boolean getElevador() {
        return elevador;
    }

    public void setElevador(Boolean elevador) {
        this.elevador = elevador;
    }

    public Boolean getRequisicaoPecas() {
        return requisicaoPecas;
    }

    public void setRequisicaoPecas(Boolean requisicaoPecas) {
        this.requisicaoPecas = requisicaoPecas;
    }
}
