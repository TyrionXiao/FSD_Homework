import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-training',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingComponent implements OnInit {
  public Trainings:{    "id": 1,
  "status": "In Progess",
  "progress": 2,
  "fees": 100.0,
  "commissionAmount": 0.0,
  "rating": 2,
  "startDate": "2020-07-18",
  "endDate": "2020-08-18",
  "startTime": null,
  "endTime": null,
  "amountReceived": 0.0,
  "users": null,
  "mentorId": null,
  "mentorname": null,
  "skill": null,
  "razorpayPaymentId": null,
  "t_Name": null}

  Donext(id){
    this.http.get("http://localhost:8769/Trainings/"+id).subscribe((Response:any)=>{
      this.Trainings=Response;
      console.log(Response);
      });  

  }
  Start(id){
    this.http.get("http://localhost:8769/Trainings/"+id).subscribe((Response:any)=>{
      this.Trainings=Response;
      console.log(Response);
      });  

  }

  loadlist(id){
    this.http.get("http://localhost:8769/Trainings/"+id).subscribe((Response:any)=>{
      this.Trainings=Response;
      console.log(Response);
      });  
  }

  constructor(      private http: HttpClient  ,
    private router: Router ,
    private route: ActivatedRoute
    ) {
 
     }

  ngOnInit(): void {
    const id=this.route.snapshot.params.id;
    this.loadlist(id);
  }

}
