import { Component  } from '@angular/core';
import { DataServiceService } from './shared/data-service.service';
import {User} from "./shared/model/user";
import {Observable} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  users: Observable<Array<User>> = null;
  constructor(private dataService: DataServiceService) {
    this.users = this.dataService.retrieveUsers();
  }
}
