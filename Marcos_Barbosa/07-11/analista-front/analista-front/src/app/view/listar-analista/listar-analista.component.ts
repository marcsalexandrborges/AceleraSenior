
import { ModelAnalista } from './../../model/model-analista';
import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs'
import { ServiceAnalistaService } from 'src/app/service/service-analista.service';

@Component({
  selector: 'app-listar-analista',
  templateUrl: './listar-analista.component.html',
  styleUrls: ['./listar-analista.component.css']
})
export class ListarAnalistaComponent implements OnInit {




  displayedColumns = ['nome', 'salario', 'idade']
  analistas: Observable<ModelAnalista[]>;

  constructor(private serviceAnalistaService: ServiceAnalistaService) {
      this.analistas = serviceAnalistaService.listarAnalista();

    }

      ngOnInit(): void {

  }

}





