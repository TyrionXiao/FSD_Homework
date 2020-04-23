import React,{Component} from 'react';

class Player extends Component{
    constructor(props){
        super(props)
    }
    render(){
        return(
            <div>
                <video id="video" src={this.props.source.url}></video>
            </div>
        );
    }

}
export default Player




