import React,{ Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component{
  constructor(){
    super()
    this.state={
      firstName: '',
      lastName: '',
      description:''
    }
  

    axios.get('http://localhost:8080/api/employees/1')
    .then(response=>this.setState({firstName:response.data.firstName,
                                   lastName:response.data.lastName,
                                   description:response.data.description}))

    //this.handleClick = this.handleClick.bind(this)
  }

  render(){
    return(
      <div>
        <p>{this.state.firstName}</p>
        <p>{this.state.lastName}</p>
        <p>{this.state.description}</p>
      </div>
    )
  }
}



export default App;
