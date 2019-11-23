import React from 'react';
import Todos from './components/Todos';
import Header from './components/Header';
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
    
    // NAO ESTA FUNCIONANDO!! ↓↓↓↓↓
    // funçao para mudar o estado de completado ou nao
    markComplete = (id) => {
        // setando o estado usando map que percorre array inteiro e retorna uma lista de array nova
        this.setState({ todos: this.state.todos.map(todo =>{
            // se o id do estado for igual ao id que veio de todoItem passado na funçao
            if(todo.id === id){
                // o estado é mudado sempre para o oposto
                todo.completed = !todo.completed
            }
        })});
    }


    render(){
        return (
            <div className="App todo">
                <Header />

                <div className="tarefas">
                    <ul>
                        <Todos todos = {this.state.todos} markComplete={this.markComplete}/>
                    </ul>
                </div>
                
            </div>
        );
    }
}

export default App;
