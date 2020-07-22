import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-mentor-profile',
  templateUrl: './mentor-profile.component.html',
  styleUrls: ['./mentor-profile.component.css']
})
export class MentorProfileComponent implements OnInit {
  public edited:any="N";
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


  edite(){
    if(this.user.role=="ADMIN"){
      this.edited="Y";
    }
  }
  confirm(){}
  loadMentor(id){
    this.http.get("http://localhost:8769/user/"+id).subscribe((Response:any)=>{
      this.user=Response;
      console.log(Response);
      });  
  }

  constructor(private http: HttpClient  ,
    private router: Router,
    private route: ActivatedRoute) {
    
   }

  ngOnInit(): void {
    const id=this.route.snapshot.params.id;
    this.loadMentor(id);
  }

}
