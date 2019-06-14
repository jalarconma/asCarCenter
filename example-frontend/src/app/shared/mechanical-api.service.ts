import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { ServerConfig } from './serverConfig';

@Injectable({
	providedIn: 'root'
})
export class MechanicalApiService {

	constructor(private http: HttpClient, private config: ServerConfig) { }

	findByPriority(): Observable<[]> {
		return this.http.get<[]>(this.config.apiURL + '/mechanical/by-priority')
			.pipe(
				retry(1),
				catchError(this.config.handleError)
			)
	}

	create(mech): Observable<number> {
		return this.http.post<number>(this.config.apiURL + '/mechanical', JSON.stringify(mech), this.config.httpOptions)
			.pipe(
				retry(1),
				catchError(this.config.handleError)
			)
	}
}
