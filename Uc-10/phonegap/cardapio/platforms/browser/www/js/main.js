const btnPedido = document.querySelector('.itens .info .btnMain');
const btnEntrar = document.querySelector('#login');
const itensHtml = document.querySelectorAll('.itens');

const lanche = [
  {
    nome: "Nome da comida1",
    descricao: "descricao da comida1",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida2",
    descricao: "descricao da comida2",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida3",
    descricao: "descricao da comida3",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida4",
    descricao: "descricao da comida4",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida5",
    descricao: "descricao da comida5",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida6",
    descricao: "descricao da comida6",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida7",
    descricao: "descricao da comida7",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
  {
    nome: "Nome da comida8",
    descricao: "descricao da comida8",
    preco: 25.00,
    foto: ["./img/pizza.jpg", "./img/pizza.jpg", "./img/pizza.jpg"],
  },
];


itensHtml.forEach((item, index) => {
  let imgHtml = item.querySelector('img');
  let h3Html = item.querySelector('h3');
  let h5Html = item.querySelector('h5');

  imgHtml.setAttribute('src', lanche[index].foto[0]);
  h3Html.insertAdjacentText('afterbegin', lanche[index].nome);
  h5Html.insertAdjacentText('afterbegin', lanche[index].descricao);
});

const cadastrarHtml = document.querySelector('.cadastrar');
const entrarHtml = document.querySelector('.entrar');



