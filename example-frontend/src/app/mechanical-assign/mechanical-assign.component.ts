import { Component, OnInit } from '@angular/core';
import { MechanicalApiService } from '../shared/mechanical-api.service';

@Component({
	selector: 'app-mechanical-assign',
	templateUrl: './mechanical-assign.component.html',
	styleUrls: ['./mechanical-assign.component.scss']
})
export class MechanicalAssignComponent implements OnInit {

	mechanicals = [];

	constructor(private mechApi: MechanicalApiService) { }

	ngOnInit() {
		this.findMechanicals();
	}

	findMechanicals(): void {
		this.mechApi.findByPriority().subscribe((data: []) => {
			this.mechanicals = data;
		});
	}

}
