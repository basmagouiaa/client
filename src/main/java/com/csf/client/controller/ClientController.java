package com.csf.client.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.csf.client.model.Client;
import com.csf.client.service.ClientService;


//mark class as Controller  
@RestController  
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	//autowire the clientService class  
	@Autowired  
	ClientService clientService;  
	
	//creating a get mapping that retrieves all the Client detail from the database   
	@GetMapping("/client")  
	private List<Client> getAllClient()   
	{  
		return clientService.getAllClients();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/clients/{id}")  
	private Client getClient(@PathVariable("id") int id)   
	{  
		return clientService.getClientById(id);  
	}  
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/client/{id}")  
	private void deleteClient(@PathVariable("id") int id)   
	{  
		clientService.delete(id);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/client")  
	private int saveBook(@RequestBody Client client)   
	{  
		clientService.saveOrUpdate(client);  
		return client.getId();  
	}  
	//creating put mapping that updates the client detail   
	@PutMapping("/client")  
	private Client update(@RequestBody Client client)   
	{  
		clientService.saveOrUpdate(client);  
		return client;  
	}  
}  
