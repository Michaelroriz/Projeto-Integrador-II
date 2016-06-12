/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Maisa Roriz
 */
@Entity
@Table(name = "veiculo", catalog = "DBagendamento", schema = "")
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findByCodigo", query = "SELECT v FROM Veiculo v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Veiculo.findByMarca", query = "SELECT v FROM Veiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Veiculo.findByModelo", query = "SELECT v FROM Veiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Veiculo.findByFILIALcodigo", query = "SELECT v FROM Veiculo v WHERE v.fILIALcodigo = :fILIALcodigo"),
    @NamedQuery(name = "Veiculo.findBySTATUScodigo", query = "SELECT v FROM Veiculo v WHERE v.sTATUScodigo = :sTATUScodigo")})
public class Veiculo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "FILIAL_codigo")
    private int fILIALcodigo;
    @Basic(optional = false)
    @Column(name = "STATUS_codigo")
    private int sTATUScodigo;

    public Veiculo() {
    }

    public Veiculo(Integer codigo) {
        this.codigo = codigo;
    }

    public Veiculo(Integer codigo, int fILIALcodigo, int sTATUScodigo) {
        this.codigo = codigo;
        this.fILIALcodigo = fILIALcodigo;
        this.sTATUScodigo = sTATUScodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String oldPlaca = this.placa;
        this.placa = placa;
        changeSupport.firePropertyChange("placa", oldPlaca, placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public int getFILIALcodigo() {
        return fILIALcodigo;
    }

    public void setFILIALcodigo(int fILIALcodigo) {
        int oldFILIALcodigo = this.fILIALcodigo;
        this.fILIALcodigo = fILIALcodigo;
        changeSupport.firePropertyChange("FILIALcodigo", oldFILIALcodigo, fILIALcodigo);
    }

    public int getSTATUScodigo() {
        return sTATUScodigo;
    }

    public void setSTATUScodigo(int sTATUScodigo) {
        int oldSTATUScodigo = this.sTATUScodigo;
        this.sTATUScodigo = sTATUScodigo;
        changeSupport.firePropertyChange("STATUScodigo", oldSTATUScodigo, sTATUScodigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Veiculo[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
