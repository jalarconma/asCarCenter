import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MechanicalAssignComponent } from './mechanical-assign.component';

describe('MechanicalAssignComponent', () => {
  let component: MechanicalAssignComponent;
  let fixture: ComponentFixture<MechanicalAssignComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MechanicalAssignComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MechanicalAssignComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
