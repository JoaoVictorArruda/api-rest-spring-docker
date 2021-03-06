package br.arruda.springrestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends CustomerAudit  {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String cpf;
    private String address;

}
