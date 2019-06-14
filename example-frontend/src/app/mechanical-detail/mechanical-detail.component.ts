import { Component, OnInit } from '@angular/core';
import { MechanicalApiService } from '../shared/mechanical-api.service';

@Component({
	selector: 'app-mechanical-detail',
	templateUrl: './mechanical-detail.component.html',
	styleUrls: ['./mechanical-detail.component.scss']
})
export class MechanicalDetailComponent implements OnInit {

	mechanical = {};

	documentTypes = ['CC', 'CE', 'DI', 'PA', 'CN', 'RC']

	constructor(private mechApi: MechanicalApiService) { }

	ngOnInit() {
	}

	onSubmit(): void {
		this.mechApi.create(this.mechanical).subscribe((data: number) => {
			this.mechanical = {};
			window.alert("Mecánico creado exitosamente");
		});
	}

}
