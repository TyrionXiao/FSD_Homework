import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  public loginData = {username: "", password: ""};
  public user:any={    "id": 3,
  "username": "",
  "password": "",
  "firstName": "",
  "lastName": "",
  "regCode": "",
  "contactNumber": "",
  "role": null,
  "linkedinUrl": null,
  "yearsOfExperience": null,
  "active": false,
  "confirmedSignUp": false,
  "resetPassword": false,
  "resetPasswordDate": null}

  constructor(private http: HttpClient  ,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
  }
  login() {
    this.http.get("http://localhost:8769/user/"+this.loginData.username).subscribe((Response:any)=>{
      this.user=Response;
      console.log(Response);
      if (this.user.password==this.loginData.password){
        localStorage.setItem("token",Response.id);
        this.user.confirmedSignUp=true;
        this.updateuser();
      }
      });  

    }
    updateuser(){this.http.patch("http://localhost:8769/user/",this.user)
    .toPromise()
    .then(data =>{
      this.router.navigate(['/SearchTrainings/'])
    }) 

    }



createAccount() {

    this.router.navigate(['/Register']);

}

}
