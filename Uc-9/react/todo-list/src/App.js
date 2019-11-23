import React from 'react';
import Todos from './components/Todos';
import './components/css/Todo.css';

class App extends React.Component {
    state = {
        todos: [
            {
                id: 1,
                title: 'Estudar react',
                completed: true
            },
            {
                id: 2,
                title: 'Estudar PhoneGap',
                completed: false
            },
            {
                id: 3,
                title: 'Estudar Android-Studio',
                completed: false
            },
            {
                id: 4,
                title: 'Estudar Js e Jquery',
                completed: false
            }
        ]
    }
    
    // funçao que sera executada em todoItem para mudar o estado de completado ou nao
    markComplete = () =>{
        
    }


    render(){
        return (
            <div className="App todo">
                <div className="header"></div>

                <div className="item">
                    <ul>
                        <Todos todos = {this.state.todos} markComplete={this.markComplete}/>
                    </ul>
                </div>
                
            </div>
        );
    }
}

export default App;
