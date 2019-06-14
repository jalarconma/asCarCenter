import { TestBed } from '@angular/core/testing';

import { MechanicalApiService } from './mechanical-api.service';

describe('MechanicalApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MechanicalApiService = TestBed.get(MechanicalApiService);
    expect(service).toBeTruthy();
  });
});
