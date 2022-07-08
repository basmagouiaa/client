package com.csf.client.service;




import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.client.model.Client;
import com.csf.client.repository.ClientRepository;

//defining the business logic  
@Service  
public class ClientService {
	@Autowired  
	ClientRepository clientRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{  
		List<Client> clients = new ArrayList<Client>();  
		clientRepository.findAll().forEach(p -> clients.add(p));  
		return clients;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientById(int id)   
	{  
		return clientRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client client)   
	{  
		clientRepository.save(client);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		clientRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Client client, int id)   
	{  
		clientRepository.save(client);  
	}  
}
