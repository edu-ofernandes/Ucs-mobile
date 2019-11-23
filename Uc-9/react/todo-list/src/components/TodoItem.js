import React from 'react';
import PropTypes from 'prop-types'; /* importando Checagem de tipos de (Typechecking) com PropTypes*/
import './css/TodoItem.css';

class TodoItem extends React.Component{

    // metodo para chegar se esta completada a tarefa e gerar um style
    getStyle = () =>{
        return {
            textDecoration: this.props.todo.completed ? 'line-through' : 'none',
            color: this.props.todo.completed ? 'red' : 'current',
        }
    }


    render() {
        const { id, title} = this.props.todo;
        return (
            <li className="todoItem" style={this.getStyle()}>{title}
                <input className="toggleTarefa" type="checkbox" onChange={this.props.markComplete.bind(this, id)}/>
            </li>
        );
    }
}


// checagem de tipos de props
TodoItem.propTypes = {
    todo: PropTypes.object.isRequired
}

export default TodoItem;