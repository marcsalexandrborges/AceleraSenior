
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ModelAnalista } from '../model/model-analista';

@Injectable({
  providedIn: 'root'
})
export class ServiceAnalistaService {

  constructor(private httpcliente: HttpClient) {

  }
  private readonly url = 'http://localhost:8080/api/analistas';
  listarAnalista(){

    return this.httpcliente.get<ModelAnalista[]>(this.url);
  }

}
