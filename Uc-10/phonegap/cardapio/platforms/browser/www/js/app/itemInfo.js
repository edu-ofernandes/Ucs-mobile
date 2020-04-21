let idLanche = window.location.href.split('=');
idLanche = idLanche[1];

const itemHtml = document.querySelector('.item'),
  titulo = itemHtml.querySelector('.info-item h3'),
  preco = itemHtml.querySelector('.info-item h4 #preco'),
  descricao = itemHtml.querySelector('.info-item h5'),
  fotoPedido = itemHtml.querySelector('img'),
  btnAddPedido = itemHtml.querySelector('.info-item .botoes button'),
  qtdItens = itemHtml.querySelector('.info-item .botoes .qtd h3'),
  precoTotal = itemHtml.querySelector('.info-item .botoes button #precoAtual'),
  plusItens = itemHtml.querySelector('.info-item .botoes .qtd .fa-plus'),
  minusIten = itemHtml.querySelector('.info-item .botoes .qtd .fa-minus');

let qtdPedido = 1;
let valorPedido = 0;
let estoque = 0;

const refDatabase = firebase.database().ref(`/cardapio/${idLanche}`);
refDatabase.once('value', (snapShot) => {

  let lanche = snapShot.val();

  valorPedido = lanche.preco;
  titulo.insertAdjacentText('afterbegin', lanche.nome);
  descricao.insertAdjacentText('afterbegin', lanche.descricao);
  preco.insertAdjacentText('beforeend', lanche.preco);
  fotoPedido.setAttribute('src', lanche.foto.foto01);
  fotoPedido.setAttribute('alt', lanche.descricao);
  fotoPedido.setAttribute('title', lanche.descricao);
  precoTotal.insertAdjacentText('beforeend', valorPedido);
  qtdItens.innerHTML = qtdPedido;
  estoque = lanche.estoque;

})

function minus() {
  if (qtdPedido == 1) {
    alert('nao tem mais itens')
  } else {
    qtdPedido--;
    qtdItens.innerHTML = qtdPedido;
    valorPedido = valorPedido - preco.textContent;
    precoTotal.innerHTML = valorPedido;
  }
}

function plus() {
  if (qtdPedido < estoque) {
    qtdPedido++;
    qtdItens.innerHTML = qtdPedido;
    valorPedido = (preco.textContent * qtdPedido).toFixed();
    precoTotal.innerHTML = parseFloat(valorPedido);
  } else { alert('Quantidade limite atingida') }
}

