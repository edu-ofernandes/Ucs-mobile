let idLanche = window.location.href.split('=');
idLanche = idLanche[1];

const itemHtml = document.querySelector('.item'),
  nomePedido = itemHtml.querySelector('.info-item h3'),
  precoPedido = itemHtml.querySelector('.info-item h4'),
  descricaoPedido = itemHtml.querySelector('.info-item h5'),
  fotoPedido = itemHtml.querySelector('img'),
  btnAddPedido = itemHtml.querySelector('.info-item .botoes button'),
  qtdPedidoHtml = itemHtml.querySelector('.info-item .botoes .qtd h3'),
  plusPedido = itemHtml.querySelector('.info-item .botoes .qtd .fa-plus'),
  minusPedido = itemHtml.querySelector('.info-item .botoes .qtd .fa-minus');

let qtdPedido = 0;

const refDatabase = firebase.database().ref(`restaurante/cardapio/${idLanche}`);
refDatabase.once('value', (snapShot) => {

  let lanche = snapShot.val();

  nomePedido.insertAdjacentText('afterbegin', lanche.nome);
  descricaoPedido.insertAdjacentText('afterbegin', lanche.descricao);
  precoPedido.insertAdjacentText('beforeend', lanche.preco);
  fotoPedido.setAttribute('src', lanche.foto.foto01);
  fotoPedido.setAttribute('alt', lanche.descricao);
  fotoPedido.setAttribute('title', lanche.descricao);
  btnAddPedido.insertAdjacentText('beforeend', lanche.preco);
  qtdPedidoHtml.innerHTML = qtdPedido;
})

function minus() {
  if (qtdPedido === 0) {
    alert('nao tem mais pedidos')
  } else {
    qtdPedido -= 1;
    qtdPedidoHtml.innerHTML = qtdPedido;
  }
}

function plus() {
  refDatabase.once('value', (snapShot) => {
    let lanche = snapShot.val();
    let qtdTotal = lanche.estoque;

    if (qtdPedido < qtdTotal) {
      qtdPedido += 1;
      qtdPedidoHtml.innerHTML = qtdPedido;
    } else {
      alert('limite de estoque');
    }
  })
}

