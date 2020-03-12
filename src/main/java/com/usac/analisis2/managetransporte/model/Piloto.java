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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author carlospecam
 */
@Entity
@Table(name = "Piloto")
@NamedQueries({
    @NamedQuery(name = "Piloto.findAll", query = "SELECT p FROM Piloto p"),
    @NamedQuery(name = "Piloto.findById", query = "SELECT p FROM Piloto p WHERE p.id = :id"),
    @NamedQuery(name = "Piloto.findByNombres", query = "SELECT p FROM Piloto p WHERE p.nombres = :nombres"),
    @NamedQuery(name = "Piloto.findByApellidos", query = "SELECT p FROM Piloto p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Piloto.findByFechanac", query = "SELECT p FROM Piloto p WHERE p.fechanac = :fechanac"),
    @NamedQuery(name = "Piloto.findByDireccion", query = "SELECT p FROM Piloto p WHERE p.direccion = :direccion")})
public class Piloto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 100)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fechanac")
    @Temporal(TemporalType.DATE)
    private Date fechanac;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;

    public Piloto() {
    }

    public Piloto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        if (!(object instanceof Piloto)) {
            return false;
        }
        Piloto other = (Piloto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.usac.analisis2.managetransporte.model.Piloto[ id=" + id + " ]";
    }
    
}
