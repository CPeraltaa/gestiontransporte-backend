/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usac.analisis2.managetransporte.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlospecam
 */
@Entity
@Table(name = "Vehiculo")
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v"),
    @NamedQuery(name = "Vehiculo.findById", query = "SELECT v FROM Vehiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Vehiculo.findByTipomatricula", query = "SELECT v FROM Vehiculo v WHERE v.tipomatricula = :tipomatricula"),
    @NamedQuery(name = "Vehiculo.findByMatricula", query = "SELECT v FROM Vehiculo v WHERE v.matricula = :matricula"),
    @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca"),
    @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Vehiculo.findByLinea", query = "SELECT v FROM Vehiculo v WHERE v.linea = :linea"),
    @NamedQuery(name = "Vehiculo.findByColor", query = "SELECT v FROM Vehiculo v WHERE v.color = :color")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipomatricula")
    private String tipomatricula;
    @Size(max = 6)
    @Column(name = "matricula")
    private String matricula;
    @Size(max = 100)
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    @Temporal(TemporalType.DATE)
    private Date modelo;
    @Size(max = 100)
    @Column(name = "linea")
    private String linea;
    @Size(max = 100)
    @Column(name = "color")
    private String color;
    @JoinColumn(name = "flotilla_vehiculo", referencedColumnName = "id")
    @ManyToOne
    private Flotilla flotillaVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(Integer id) {
        this.id = id;
    }

    public Vehiculo(Integer id, String tipomatricula) {
        this.id = id;
        this.tipomatricula = tipomatricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipomatricula() {
        return tipomatricula;
    }

    public void setTipomatricula(String tipomatricula) {
        this.tipomatricula = tipomatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Flotilla getFlotillaVehiculo() {
        return flotillaVehiculo;
    }

    public void setFlotillaVehiculo(Flotilla flotillaVehiculo) {
        this.flotillaVehiculo = flotillaVehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usac.analisis2.managetransporte.model.Vehiculo[ id=" + id + " ]";
    }
    
}
