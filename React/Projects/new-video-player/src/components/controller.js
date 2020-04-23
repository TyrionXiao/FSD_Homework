import React,{Component} from 'react';
import {BrowserRouter as Router,

    Route,
  
    Link} from 'react-router-dom';

class Controller extends Component{
    constructor(props){
        super(props)
    }
    render(){
        return(
            <div>
                <div className="btn-group">
             <p>
        <button onClick={this.props.play} type="button" className="btn btn-default">
            <span className="glyphicon glyphicon-play" ></span>
        </button>
        <button onClick={this.props.pause}  type="button" className="btn btn-default">
            <span className="glyphicon glyphicon-pause"></span>
        </button >
        <button onClick={this.props.reload} type="button" className="btn btn-default">
            <span className="glyphicon glyphicon-stop"></span>
        </button>
        <button onClick={this.props.thumb_up} type="button" className="btn btn-default">
        <span name="like"  className="glyphicon glyphicon-thumbs-up">{this.props.likes}</span>
        </button>
        <button onClick={this.props.thumb_down} type="button" className="btn btn-default">
        <span name="unlike" className="glyphicon glyphicon-thumbs-down">{this.props.unlike}</span>
        </button>
        <button onClick={this.props.volume_down} type="button" className="btn btn-default">
            <span className="glyphicon glyphicon-minus"></span>
        </button>
        <button onClick={this.props.volume_off} type="button" className="btn btn-default">
            <span id="mute" className={this.props.volume_off=true? 'glyphicon glyphicon-volume-off' : 'glyphicon glyphicon-volume-up' }></span>
        </button>
        <button onClick={this.props.volume_up} type="button" className="btn btn-default">
            <span className="glyphicon glyphicon-plus"></span>
        </button>
       </p>
    </div>
        <div className="progress">
            <div id="progress" className="progress-bar progress-bar-info"  >
            </div>
        </div>                
            </div>
        );
    }

}
export default Controller