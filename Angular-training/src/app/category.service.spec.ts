import { TestBed } from '@angular/core/testing';
import { HttpModule } from '@angular/http';
import { CategoryService } from './category.service';

describe('CategoryService', () => {
  beforeEach(() => TestBed.configureTestingModule({
imports:[HttpModule]
  }));

  it('should be created', () => {
    const service: CategoryService = TestBed.get(CategoryService);
    expect(service).toBeTruthy();
  });
});
