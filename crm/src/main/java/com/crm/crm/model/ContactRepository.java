package com.crm.crm.model;
import org.springframework.data.repository.CrudRepository;

//Passing the Model Contact and the Long Id
public interface ContactRepository extends CrudRepository<Contact, Long> {

}