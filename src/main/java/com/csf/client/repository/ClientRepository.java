package com.csf.client.repository;
import org.springframework.data.repository.CrudRepository;

import com.csf.client.model.Client;


//repository that extends CrudRepository  
public interface ClientRepository extends CrudRepository<Client, Integer>  
{  
}  

