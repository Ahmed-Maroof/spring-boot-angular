import { Router } from "@angular/router";
import { Component, OnInit } from "@angular/core";
import { UserService } from "../user/user.service";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  username;
  password;
  constructor(private userService: UserService, private router: Router) {}

  ngOnInit() {}

  login() {
    const data = {
      username: this.username,
      password: this.password
    };

    this.userService.signIn(data).subscribe(token => {
      console.log(token);
      localStorage.setItem(
        "token",'Bearer '+ token["accessToken"]
      );
      this.router.navigate(["/users"]);
    });
  }
}
