import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";

import { User } from "../models/user.model";

const httpOptions = {
  headers: new HttpHeaders({ "Content-Type": "application/json" })
};

@Injectable()
export class UserService {
  constructor(private http: HttpClient) {}

  private userUrl = "http://localhost:8080/api";
  // private userUrl = '/api';

  public getUsers() {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTU0NzMwNjc4NCwiZXhwIjoxNTQ3MzkzMTg0fQ.VheG-7Jugta25RI_WwBl6qV5jGdsMcouMeygyDBhZOXllr0VYYHwFRPRhIp4OM0422y2fhdpgs7ftiowa9Xcwg'
    });
    console.log(headers);
    console.log(localStorage.getItem('token'));
    return this.http.get<User[]>(this.userUrl + '/all', { headers: headers });
  }

  // public deleteUser(user) {
  //   console.log(user);
  //   return this.http.delete(this.userUrl + "/delete/" + user.id);
  // }

  public createUser(user) {
    console.log(user);
    return this.http.post<User>(this.userUrl + "/auth/signup", user);
  }

  public signIn(data) {
    console.log(data);
    return this.http.post<User>(this.userUrl + "/auth/signin", data);
  }
}
