import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MechanicalDetailComponent } from './mechanical-detail.component';

describe('MechanicalDetailComponent', () => {
  let component: MechanicalDetailComponent;
  let fixture: ComponentFixture<MechanicalDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MechanicalDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MechanicalDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
