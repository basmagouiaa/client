import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from '../client';
import { ClientService } from '../client.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrls: ['./add-client.component.css']
})
export class AddClientComponent implements OnInit {
  client: Client= new Client();
  public clientForm!: FormGroup;

  constructor(private clientService:ClientService,private formBuilder: FormBuilder,
    private router:Router) { }

  ngOnInit(): void {
    this.clientForm = this.formBuilder.group({
      id: [''],
      name: [''],
      tel: [''],
      email: ['']

    });
  }
  saveClient(){
    this.clientService.addClient(this.client).subscribe(data =>{
      console.log(data);
      this.goToClientList()},
    error => console.log(error));
  }

  goToClientList(){
    this.router.navigate(['/']);
  }
  onSubmit(formValues:any){
    console.log(formValues);
    this.client.id=formValues.id;
    this.client.name=formValues.name;
    this.client.tel=formValues.tel;
    this.client.email=formValues.email;
    console.log(this.client);
    this.saveClient();
  }

}
