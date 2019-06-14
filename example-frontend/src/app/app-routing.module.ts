import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MechanicalDetailComponent } from './mechanical-detail/mechanical-detail.component';

const routes: Routes = [
	{
		path: 'mechanical-create',
		component: MechanicalDetailComponent
	},
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule { }
