import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Client } from './client'
@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http: HttpClient) { }

  getClientById(idclient: string){
    return this.http.get(
        'http://localhost:8080/clients/' + idclient
    );
    }
    getAllClient(){
      return this.http.get(
          'http://localhost:8080/client'
      );
    }

    addClient(client: Client): Observable<any> {
      return this.http.post('http://localhost:8080/client',client )
    }




}
