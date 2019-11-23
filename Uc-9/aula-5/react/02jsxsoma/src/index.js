import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

/*var titulo = <h1>Programa de soma de dois números</h1>;

var valor1 = parseFloat(prompt("informe o primeiro  valor"));
var valor2 = parseFloat(prompt("informe o segundo  valor"));

var resultado = valor1 + valor2;

const valores = (
    <div>
        <h2>Valor1: = {valor1} </h2>
        <h2>Valor2: = {valor2} </h2>
        <h3>Resultado: = {resultado} </h3>
    </div>
);

const botao = (
    <a href="./tabuada.html">Tabuada</a>
);

ReactDOM.render(titulo, document.getElementById('titulo'));
ReactDOM.render(valores, document.getElementById('valores'));
ReactDOM.render(botao, document.getElementById('tabuada'));
*/

var numero = parseInt(prompt("informe o numero da tabudada de sua preferencia"));

const titulo = <h1>Tabuada</h1>;


// exemplo de uso com constante
const numeros = (
    <div>
        <h2>{numero} X 1 = {numero * 1}</h2>
        <h2>{numero} X 2 = {numero * 2}</h2>
        <h2>{numero} X 3 = {numero * 3}</h2>
        <h2>{numero} X 4 = {numero * 4}</h2>
        <h2>{numero} X 5 = {numero * 5}</h2>
        <h2>{numero} X 6 = {numero * 6}</h2>
        <h2>{numero} X 7 = {numero * 7}</h2>
        <h2>{numero} X 8 = {numero * 8}</h2>
        <h2>{numero} X 9 = {numero * 9}</h2>
        <h2>{numero} X 10 = {numero * 10}</h2>
    </div>
);


// exemplo de uso com classe
class Tabuada extends React.Component{
    render(){
        return (
            <div>
                <h2>{numero} X 1 = {numero * 1}</h2>
                <h2>{numero} X 2 = {numero * 2}</h2>
                <h2>{numero} X 3 = {numero * 3}</h2>
                <h2>{numero} X 4 = {numero * 4}</h2>
                <h2>{numero} X 5 = {numero * 5}</h2>
                <h2>{numero} X 6 = {numero * 6}</h2>
                <h2>{numero} X 7 = {numero * 7}</h2>
                <h2>{numero} X 8 = {numero * 8}</h2>
                <h2>{numero} X 9 = {numero * 9}</h2>
                <h2>{numero} X 10 = {numero * 10}</h2>
            </div>
        )
    }
}


// exemplo de uso com funçao
function TabuadaF() {
    return (
        <div>
            <h2>{numero} X 1 = {numero * 1}</h2>
            <h2>{numero} X 2 = {numero * 2}</h2>
            <h2>{numero} X 3 = {numero * 3}</h2>
            <h2>{numero} X 4 = {numero * 4}</h2>
            <h2>{numero} X 5 = {numero * 5}</h2>
            <h2>{numero} X 6 = {numero * 6}</h2>
            <h2>{numero} X 7 = {numero * 7}</h2>
            <h2>{numero} X 8 = {numero * 8}</h2>
            <h2>{numero} X 9 = {numero * 9}</h2>
            <h2>{numero} X 10 = {numero * 10}</h2>
        </div>
    );
}



// exemplo de renderizaçao com const
// ReactDOM.render(numeros, document.getElementById('numeros'));

// exemplo de renderizaçao com funçao
// ReactDOM.render(<TabuadaF />, document.getElementById('numeros'));

// exemplo de renderizaçao com classe
ReactDOM.render(<Tabuada />, document.getElementById('numeros'));


ReactDOM.render(titulo, document.getElementById('titulo'));

