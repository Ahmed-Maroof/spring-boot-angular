import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8080/portal/api';
	// private userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.userUrl+"/all");
  }

  public deleteUser(user) {
    console.log(user)
    return this.http.delete(this.userUrl + "/delete/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }

}