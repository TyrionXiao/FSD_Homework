import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-trainings',
  templateUrl: './user-trainings.component.html',
  styleUrls: ['./user-trainings.component.css']
})
export class UserTrainingsComponent implements OnInit {
  public tech:any[]=["Spring Boot","Angular","Java","HTML","JQuery","Docker"];
  public id:any;
  public status:any;
  public timezone:any;
  public techselected:any;
  timeSlots={"1":"00:00-02:00",
  "2":"02:00-04:00",
  "3":"04:00-06:00",
  "4":"06:00-08:00",
  "5":"08:00-10:00",
  "6":"10:00-12:00",
  "7":"12:00-14:00",
  "8":"14:00-16:00",
  "9":"16:00-18:00",
  "10":"18:00-20:00",
  "11":"20:00-22:00",
  "12":"22:00-23:59"
};
   
  search(){

  }
  getChange(e){
this.timezone=e;
  }
  getChangeTech(e1){
    this.techselected=e1;
      }
  searchMentors(){}
  searchTrainings(){
   
    
    this.router.navigate(['/SearchTrainings/Mentors',this.timezone,this.techselected])
  }
  searchCurrentTrainings(){
    this.router.navigate(['/SearchTrainings/Trainings',this.id]);
  }
  searchCompletedTrainings(){
    this.router.navigate(['/SearchTrainings/Trainings',this.id,this.status]);
  }

  constructor(
    private http: HttpClient  ,
    private router:Router
  ) { }

  ngOnInit(): void {
  }

}
