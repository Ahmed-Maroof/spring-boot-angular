import { UserService } from './../user/user.service';
import { User } from './../models/user.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user: User = new User();

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  signUp() {
    this.userService.createUser(this.user).subscribe(
      d => {
        console.log(d);
      }
    );
  }
}
