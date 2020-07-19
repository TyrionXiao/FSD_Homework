import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit {

  public user:any={    "id": 3,
  "username": "Laural2",
  "password": "1234567",
  "firstName": "国际商业机器公司1",
  "lastName": "婷",
  "regCode": "",
  "contactNumber": "123456789",
  "role": null,
  "linkedinUrl": null,
  "yearsOfExperience": null,
  "active": false,
  "confirmedSignUp": false,
  "resetPassword": false,
  "resetPasswordDate": null}

  submit(){
    this.http.patch("http://localhost:8769/user/",this.user)
    .toPromise()
    .then(data =>{
      this.router.navigate(['/SearchTrainings/'])
    })  
  }

  constructor(private http: HttpClient  ,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

}
