import React,{Component} from 'react';
import Player from './player';
import Controller from './controller';
import VideoList from './video-list';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';

class PlayerPage extends Component{
    constructor(props){
        super(props);
        video= document.getElementById('video');
        this.play=this.play.bind(this);
        this.pause=this.pause.bind(this);
        this.reload=this.reload.bind(this);
        this.thumb_up=this.thumb_up.bind(this);
        this.thumb_down=this.thumb_down.bind(this);
        this.volume_down=this.volume_down.bind(this);
        this.volume_off=this.volume_off.bind(this);
        this.volume_up=this.volume_up.bind(this);
        this.state={source:{
            "id": 0,
            "title": "",
            "url": "",
            "status": "",
            "approved": 0,
            "likes": 0,
            "unlike": 0,
            "currentStatus": "",
            "exitplayprogress": 0
        }
            
        }
        
    }
    componentWillMount(){
        const _this=this;
        axios.get("http://localhost:3000/youtube/",{currentStatus:"playing"})
        .then(function(response){
            _this.setState({
                source:response.data
            });
        }

        ).catch(function(error){
            console.log(error)

        }); 
    }
    play(){        
         this.video.play();
         const _this=this;
         _this.setState({
             source:{
                currentStatus:"playing"
             }
         })
    }
    pause(){
        this.video.pause();
        const _this=this;
        _this.setState({
            source:{
                currentStatus:"pause"
             }
        })

    }
    reload(){
        this.video.reload();
        const _this=this;
        _this.setState({
            source:{
                currentStatus:"playing"
             }
        })

    }
    thumb_up(){
        const _this=this;
        num=_this.state.likes;
        _this.setState({
            source:{
                likes:num+1
             }
        })        
    }
    thumb_down(){
        const _this=this;
        num2=_this.state.unlike;
        _this.setState({
            source:{
                unlike:num2+1
             }
        })        
    }
    volume_down(){
        if (this.video.volume<100) {
            this.video.volume=(this.video.volume*10-1)/10;
            }   

    }
    volume_off(){
        if (this.video.muted) {
            this.video.muted=false;
            return false            
          } else {
            this.video.muted=true;
            return true               
          }
    }
    volume_up(){
        if (this.video.volume<100) {
            this.video.volume=(this.video.volume*10+1)/10;
            }   

    }
    render(){
        return(
            <div className="container">
                <div className="col-xs-12 col-sm-6">
                    <Player source={this.state.source}/>
                    <Controller source={this.state.source}
                     play={this.play}
                     pause={this.pause}
                     reload={this.reload}
                     thumb_up={this.thumb_up}
                     thumb_down={this.thumb_down}
                     volume_down={this.volume_down}
                     volume_off={this.volume_off}
                     volume_up={this.volume_up}                    
                     
                     />
                </div>
                <div className="col-xs-12 col-sm-6">
                    <VideoList/>
                </div>

            </div>
        );
    }

}
export default PlayerPage