/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it.sestidomaci.entities;

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
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Aspire
 */
@Entity
@Table(name = "soba")
@NamedQueries({
    @NamedQuery(name = "Soba.findAll", query = "SELECT s FROM Soba s")})
public class Soba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDsobe")
    private Integer iDsobe;
    @Column(name = "ime")
    private String ime;
    @Column(name = "sprat")
    private String sprat;
    @Column(name = "imatv")
    private Boolean imatv;
    @Column(name = "imaklimu")
    private Boolean imaklimu;
    @Column(name = "imadjakuzi")
    private Boolean imadjakuzi;

    @Inject
    public Soba() {
    }

    public Soba(Integer iDsobe) {
        this.iDsobe = iDsobe;
    }

    public Integer getIDsobe() {
        return iDsobe;
    }

    public void setIDsobe(Integer iDsobe) {
        this.iDsobe = iDsobe;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getSprat() {
        return sprat;
    }

    public void setSprat(String sprat) {
        this.sprat = sprat;
    }

    public Boolean getImatv() {
        return imatv;
    }

    public void setImatv(Boolean imatv) {
        this.imatv = imatv;
    }

    public Boolean getImaklimu() {
        return imaklimu;
    }

    public void setImaklimu(Boolean imaklimu) {
        this.imaklimu = imaklimu;
    }

    public Boolean getImadjakuzi() {
        return imadjakuzi;
    }

    public void setImadjakuzi(Boolean imadjakuzi) {
        this.imadjakuzi = imadjakuzi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDsobe != null ? iDsobe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soba)) {
            return false;
        }
        Soba other = (Soba) object;
        if ((this.iDsobe == null && other.iDsobe != null) || (this.iDsobe != null && !this.iDsobe.equals(other.iDsobe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.it.sestidomaci.entities.Soba[ iDsobe=" + iDsobe + " ]";
    }
    
}
