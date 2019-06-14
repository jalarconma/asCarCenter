import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MechanicalDetailComponent } from './mechanical-detail/mechanical-detail.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TabsModule } from 'ngx-bootstrap/tabs';
import { ServerConfig } from './shared/serverConfig';

@NgModule({
  declarations: [
    AppComponent,
    MechanicalDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	BrowserAnimationsModule,
	HttpClientModule,
	FormsModule,
    TabsModule.forRoot()
  ],
  providers: [
	  ServerConfig
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
