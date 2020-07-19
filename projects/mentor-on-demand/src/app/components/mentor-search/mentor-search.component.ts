import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-mentor-search',
  templateUrl: './mentor-search.component.html',
  styleUrls: ['./mentor-search.component.css']
})
export class MentorSearchComponent implements OnInit {
  public MentorList={
    "id":1,
    "username":"Laural2",
    "timeRang":"00:00-02:00",
    "skill":"Python",
    "experience":"1",
    "NoOfTrainings":"10",
    "Charge":100
  };
  public status:any="available";
  Apply(id:any){
    return id;
  }
  Deal(id:any){
    return id;
  }
  GetCurrentUser(timezone,techselected){
    this.http.get("http://localhost:8769/search/?timezone="+timezone+"&techselected="+techselected).subscribe((Response:any)=>{
      this.MentorList=Response;
      console.log(Response);
      });  

  }
  constructor( private http: HttpClient  ,
    private router: Router,
    private route: ActivatedRoute ) {
    
   }

  ngOnInit(): void {
    const timezone=this.route.snapshot.params.timezone;
    const techselected=this.route.snapshot.params.techselected;
    this.GetCurrentUser(timezone,techselected);
  }

}
