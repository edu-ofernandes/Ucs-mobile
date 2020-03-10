const lanche = [
  {
    nome: "Nome da comida1",
    descricao: "descricao da comida1",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 1,
    estoque: 10
  },
  {
    nome: "Nome da comida2",
    descricao: "descricao da comida2",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 2,
    estoque: 10
  },
  {
    nome: "Nome da comida3",
    descricao: "descricao da comida3",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 3,
    estoque: 10
  },
  {
    nome: "Nome da comida4",
    descricao: "descricao da comida4",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 4,
    estoque: 10
  },
  {
    nome: "Nome da comida5",
    descricao: "descricao da comida5",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 5,
    estoque: 10
  },
  {
    nome: "Nome da comida6",
    descricao: "descricao da comida6",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 6,
    estoque: 10
  },
  {
    nome: "Nome da comida7",
    descricao: "descricao da comida7",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 7,
    estoque: 10
  },
  {
    nome: "Nome da comida8",
    descricao: "descricao da comida8",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 8,
    estoque: 10
  },
  {
    nome: "Nome da comida9",
    descricao: "descricao da comida9",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 9,
    estoque: 10
  },
  {
    nome: "Nome da comida10",
    descricao: "descricao da comida10",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 10,
    estoque: 10
  },
  {
    nome: "Nome da comida11",
    descricao: "descricao da comida11",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 11,
    estoque: 10
  },
  {
    nome: "Nome da comida12",
    descricao: "descricao da comida12",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 12,
    estoque: 10
  },
  {
    nome: "Nome da comida13",
    descricao: "descricao da comida13",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 13,
    estoque: 10
  },
  {
    nome: "Nome da comida14",
    descricao: "descricao da comida14",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 14,
    estoque: 10
  },
  {
    nome: "Nome da comida15",
    descricao: "descricao da comida15",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
    id: 15,
    estoque: 10
  },
],
  itemHtml = document.querySelector('.item'),
  nomePedido = itemHtml.querySelector('.info-item h3'),
  precoPedido = itemHtml.querySelector('.info-item h4'),
  descricaoPedido = itemHtml.querySelector('.info-item h5'),
  fotoPedido = itemHtml.querySelector('img'),
  btnAddPedido = itemHtml.querySelector('.info-item .botoes button'),
  qtdPedidoHtml = itemHtml.querySelector('.info-item .botoes .qtd h3'),
  plusPedido = itemHtml.querySelector('.info-item .botoes .qtd .fa-plus'),
  minusPedido = itemHtml.querySelector('.info-item .botoes .qtd .fa-minus');

let idLanche = window.location.href.split('=');
idLanche = + parseInt(idLanche[1] - 1);
const pedido = lanche[idLanche];
const qtdTotal = lanche[idLanche].estoque;
let qtdPedido = 0;

nomePedido.insertAdjacentText('afterbegin', pedido.nome);
descricaoPedido.insertAdjacentText('afterbegin', pedido.descricao);
precoPedido.insertAdjacentText('beforeend', pedido.preco);
fotoPedido.setAttribute('src', pedido.foto[0]);
btnAddPedido.insertAdjacentText('beforeend', pedido.preco);
qtdPedidoHtml.innerHTML = qtdPedido;


function minus() {
  if (qtdPedido === 0) {
    alert('nao tem mais pedidos')
  } else {
    qtdPedido -= 1;
    qtdPedidoHtml.innerHTML = qtdPedido;
  }
}
function plus() {
  if (qtdPedido < qtdTotal) {
    qtdPedido += 1;
    qtdPedidoHtml.innerHTML = qtdPedido;
  } else {
    alert('limite de estoque');
  }

}

