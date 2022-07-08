import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ClientService } from "../client.service";
@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

  public clientSearchForm!: FormGroup;
  public clientData: any;
  constructor(private formBuilder: FormBuilder, private clientService: ClientService) { }

  ngOnInit(): void {
    this.clientSearchForm = this.formBuilder.group({
      idclient: ['']
    });
    this.getAllClient();
  }

  getClient(formValues: { idclient: string; }) {
    this.clientService
    .getClientById(formValues.idclient)
    .subscribe(data => { 
      this.clientData = data;
      console.log(this.clientData);
    });
  }

  getAllClient(){
    this.clientService
    .getAllClient()
    .subscribe(data => { 
      this.clientData = data;
      console.log(this.clientData);
    });
  }
}
