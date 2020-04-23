import React,{Component} from 'react';
import axios from 'axios';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';


class UrlList extends Component{
    constructor(props){
        super(props);
        this.state={
            videolist:[]
        }
    }
    deleteUrl(id,e){
        e.preventDefault();
        axios.delete("http://localhost:3000/youtube/"+id)
        .then(function(response){
            _this.setState({
                videolist:response.data
            });
        })        
    }

    render(){
        const _this=this;
        axios.get("http://localhost:3000/youtube/")
        .then(function(response){
            _this.setState({
                videolist:response.data
            });
        }

        ).catch(function(error){
            console.log(error)

        })
        ; 
        const Approved=<button class="btn btn-warn"  disabled>Approved</button>
        const Approve= <button class="btn btn-info" onClick="Approve(item.id)"  >Approve</button>
        const ListItems= this.state.videolist.map((item)=>
        <tr > 
        <td align="center" height="25" >{1}</td>
        <td align="center" height="25" >{item.title}</td>
        <td align="center" height="25" >{item.url}</td>
        <td align="center" height="25" >
            <a   routerLinkActive="router-link-active" >Edit</a>
        </td>
        <td align="center" height="25">
            <a onClick="deleteUrl(item.id,$event)" href="#">deleteUrl</a>
        </td>
        <td align="center" height="25" >  
              <span>{item.Approved==1?  {Approved} :{Approve} }</span>          
        </td>

        </tr>
        ); 

        return(
        <div class="container">
            <table width="100%" border="1" cellspacing="0" cellpadding="0" align="center">
            <tr>
                <td align="center" height="25" >S.no</td>
                <td align="center" height="25" >Title</td>
                <td align="center" height="25" >URL</td>
                <td align="center" height="25" >OP.Edit</td>
                <td align="center" height="25" >OP.Delete</td>
                <td align="center" height="25" >OP.Approve</td>
            </tr>
                {ListItems}
            </table>
        <button class="btn btn-info" >
        <a href="/VideoPlayer/AddNew">Add New URL</a>
        </button>
        </div>
        )
    }


}
export default UrlList