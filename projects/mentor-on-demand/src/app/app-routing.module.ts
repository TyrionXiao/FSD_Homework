import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { MentorSearchComponent } from './components/mentor-search/mentor-search.component';
import { MentorTrainingsComponent } from './components/mentor-trainings/mentor-trainings.component';
import { TrainingComponent } from './components/training/training.component';
import { MentorProfileComponent } from './components/mentor-profile/mentor-profile.component';
import { UserTrainingsComponent } from './components/user-trainings/user-trainings.component';
import { UserLoginComponent } from './components/user-login/user-login.component';
import { UserregisterComponent } from './components/userregister/userregister.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';


const routes: Routes = [
  {
    path: '',
   redirectTo:'/SearchTrainings',
   pathMatch:'full'
  },
  {path:'SearchTrainings',
  component:UserTrainingsComponent,
  children:[
    {path:'Trainings',
    component:TrainingComponent
},
{path:'Mentors',
component:MentorSearchComponent
},
  ]
},
{path:'Login',
component:UserLoginComponent
},
{path:'Register',
component:UserregisterComponent
},
{path:'MentorProfile',
component:MentorProfileComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
