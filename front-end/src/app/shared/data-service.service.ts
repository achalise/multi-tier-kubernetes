import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {  } from '@angular/platform-browser';
import {Observable} from "rxjs";
import 'rxjs/add/operator/map';
import {User} from "./model/user";

@Injectable()
export class DataServiceService {
  constructor(private http:Http) { }

  retrieveUsers(): Observable<Array<User>> {
    let url = `http://${location.host}/api/users`;
    console.log('The url: ', url);
    let resp:Observable<Array<User>>  = this.http.get(url).map((res) => res.json())
      .map((d) => this.extractData(d));
    return resp;
  }

  private extractData(d:Array<any>): Array<User> {
    let users = new Array();
    d.forEach((t) => {
      users.push(new User(t.firstName, t.lastName));
    })
    return users;
  }
}
