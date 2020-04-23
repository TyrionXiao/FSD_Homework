import React,{Component} from 'react';
import axios from 'axios';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';
    
class AddUrl extends Component{
    constructor(){
        super();
        this.state={
            formate:{ "title": "Input an title",
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
    AddUrl(event){
        const _this=this;
        this.setState({
            formate:{"title" :event.target.formate.title,
                     "url" : event.target.formate.url        
        }          
        });
        axios.post("http://localhost:3000/youtube/",this.state.formate)
        .then(function(response){
            _this.setState({
                formate:response.data
            });
        }

        ).catch(function(error){
            console.log(error)

        })
        ;
    }
    Cancel(){
        window.location.href="/UrlList/";

    }
    render(){
        return(
            
            <form className="container" onSubmit={(e)=>this.AddUrl(e)}>
                <h3>Add New Url</h3>
                <input value={this.state.formate.title} className="form-control" type="text"/>
                <br/>
                <input value={this.state.formate.url} type="url"/>
                <br/>
                <button type="submit">Add New</button>
                <button onClick={(e)=>this.Cancel(e)}>Cancel</button>                              
            </form>
        );
    }

}
export default AddUrl