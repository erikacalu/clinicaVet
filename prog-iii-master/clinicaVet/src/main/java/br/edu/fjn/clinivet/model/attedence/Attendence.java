/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.model.attedence;

/**
 *
 * @author aluno
 */
import br.edu.fjn.clinivet.model.service.Services;
import br.edu.fjn.clinivet.model.customer.Customer;
import br.edu.fjn.clinivet.model.vet.Vet;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Attendence {
    
    
    @Id
    private Integer id;
    
    @JoinColumn(name = "idservice")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Services service;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Vet crmVet;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Customer idCustomer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public Vet getCrmVet() {
        return crmVet;
    }

    public void setCrmVet(Vet crmVet) {
        this.crmVet = crmVet;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    
    
}
