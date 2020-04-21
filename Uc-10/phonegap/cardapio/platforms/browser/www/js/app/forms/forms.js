window.onsubmit = function (e) {
  e.preventDefault();
}

const doc = document;
const btnEntrar = doc.querySelector('.entrar');
const btnCadastrar = doc.querySelector('.cadastrar');
const form = doc.querySelector('form');

let emailHtml = doc.querySelector('input[name="email"]');
let senhaHtml = doc.querySelector('input[name="senha"]');
let nomeHtml = doc.querySelector('form#cadastrar input[name="nome"]');




