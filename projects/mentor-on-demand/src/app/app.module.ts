import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
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

@NgModule({
  declarations: [
    AppComponent,
    MentorSearchComponent,
    MentorTrainingsComponent,
    TrainingComponent,
    MentorProfileComponent,
    UserTrainingsComponent,
    UserLoginComponent,
    UserregisterComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
