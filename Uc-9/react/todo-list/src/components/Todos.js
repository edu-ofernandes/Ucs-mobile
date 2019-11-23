import React from 'react';
import PropTypes from 'prop-types'; /* importando Checagem de tipos de (Typechecking) com PropTypes*/ 
import TodoItem from './TodoItem';

class Todos extends React.Component{
    render(){
        return this.props.todos.map((todo) => (
            <TodoItem key={todo.id} todo={todo} markComplete={this.props.markComplete}/>
        ));
    }
}

// checagem de tipos de props
Todos.propTypes = {
    todos: PropTypes.array.isRequired
}

export default Todos;