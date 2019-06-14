import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'app-mechanical-detail',
	templateUrl: './mechanical-detail.component.html',
	styleUrls: ['./mechanical-detail.component.scss']
})
export class MechanicalDetailComponent implements OnInit {

	mechanical = {};

	documentTypes = ['CC', 'CE', 'DI', 'PA', 'CN', 'RC']

	constructor() { }

	ngOnInit() {
	}

	onSubmit() {

	}

}
