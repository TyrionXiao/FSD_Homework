import React,{Component} from 'react';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';

class EditUrl extends Component{
    constructor(props){
        super(props)
        this.state={
            formate:{
             "title": "Input an title",
            "url": "Input an valid url",
            "status": "added",
            "approved": 0,
            "likes": 0,
            "unlike": 0,
            "currentStatus": "paused",
            "exitplayprogress": 0
        }
        }
    }
    EditUrl(){

    }
    Cancel(){
        window.location.href="/UrlList/";
    }
    render(){
        return(
            
            <div className="container">
                <h3>Add New Url</h3>
                <input className="form-control" type="text"/>
                <br/>
                <input type="url"/>
                <br/>
                <button onClick={(e)=>this.EditUrl(e)}>EditUrl</button>
                <button onClick={(e)=>this.Cancel(e)}>Cancel</button>                              
            </div>
        );
    }
}
export default EditUrl