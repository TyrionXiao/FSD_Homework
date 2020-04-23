import React,{Component} from 'react';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';

class VideoList extends Component{
    constructor(props){
        super(props)
        this.state={
            videolist:{                
                "title": "",
                "url": "",
                "status": "",
                "approved":0,
                "likes": 0,
                "unlike": 0,
                "currentStatus": "",
                "exitplayprogress": 0
            }
        }
    }
    componentWillMount(){
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
    }
    PlayVideo(){
        currentVideo=document.getElementById("video")
        currentVideo.play();
        const _this=this;
        _this.setState({
            videolist:{
                currentStatus:"playing"
            }            
        })

    }
    render(){        
        const ListItems= this.state.videolist.map((item)=>
        <li className="list-group-item">
            <button onClick={(url)=>this.PlayVideo(url)} >
                <span className="glyphicon glyphicon-play" >
                    {item.approved==1? item.title :""}
                </span>

            </button>
        </li>
        );     
        return(
            <div className="list-group">
                <ul>
                    {ListItems}
                </ul>
            </div>
        )
    }
}
export default VideoList