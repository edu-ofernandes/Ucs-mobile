const btnPedido = document.querySelectorAll('.itens .info .btnMain');
const itensHtml = document.querySelectorAll('.itens');

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
];


itensHtml.forEach((item, index) => {
  let imgHtml = item.querySelector('img');
  let h3Html = item.querySelector('h3');
  let h5Html = item.querySelector('h5');


  imgHtml.setAttribute('src', lanche[index].foto[0]);
  h3Html.insertAdjacentText('afterbegin', lanche[index].nome);
  h5Html.insertAdjacentText('afterbegin', lanche[index].descricao);
  btnPedido[index].setAttribute('data-idLanche', lanche[index].id);
});

function irParaPedido(e) {
  window.location.assign('itemInfo.html?id=' + e.getAttribute('data-idLanche'));
}


