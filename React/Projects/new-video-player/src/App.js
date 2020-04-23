import React from 'react';
import {BrowserRouter as Router,

  Route,

  Link} from 'react-router-dom';

import './App.css';
import VideoList from './components/video-list';
import UrlList from './components/url-list';
import Player from  './components/player';
import AddUrl from  './components/add-url';
import EditRul from './components/edit-url';
import Controller from './components/controller';
import PlayerPage from './components/player-page';

function App() {
  return (
    <div className="App">
     <Router>
       <div>
        <ul className="nav nav-pills nav-stacked">
            <li className="active"><Link to="/">VideoPlayer</Link></li>
            <li className="active"><Link to="/UrlList">VideoUrlList</Link></li>
        </ul>
       </div>
       <div>
         <BrowserRouter basename="/VideoPlayer"></BrowserRouter>
         <Route exact path="/" component="PlayerPage"></Route>
         <Route exact path="/UrlList/" component="UrlList"></Route>
         <Route exact path="/AddUrl/" component="AddUrl"></Route>
         <Route exact path="/EditRul/" component="EditRul"></Route>
       </div>
     </Router>
          
    </div>
  );
}

export default App;
