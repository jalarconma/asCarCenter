import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MechanicalDetailComponent } from './mechanical-detail/mechanical-detail.component';
import { MechanicalAssignComponent } from './mechanical-assign/mechanical-assign.component';

const routes: Routes = [
	{
		path: 'mechanical-create',
		component: MechanicalDetailComponent
	},
	{
		path: 'mechanical-assign',
		component: MechanicalAssignComponent
	}
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule { }
