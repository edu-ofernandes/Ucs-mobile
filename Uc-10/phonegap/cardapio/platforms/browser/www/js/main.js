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

const divContainer = document.querySelector('.container');

const refDatabase = firebase.database().ref().child('restaurante').child('cardapio');

function inicializarDados() {
  refDatabase.once('value', (snapShot) => {

    snapShot.forEach((element, index) => {
      const dados = element.val();

      const divItens = document.createElement('div');
      divItens.classList.add('itens');

      const imgPrato = document.createElement('img');

      const divInfo = document.createElement('div');
      divInfo.classList.add('info');

      const h3Titulo = document.createElement('h3');
      let textoH3Titulo = null;
      const h5Descricao = document.createElement('h5');
      let textoH5Descricao = null;

      const btnPedido = document.createElement('button');
      btnPedido.classList.add('btnMain');

      let textoBtnPedido = document.createTextNode('Pedir');
      btnPedido.appendChild(textoBtnPedido);
      btnPedido.onclick = function () { window.location.assign('itemInfo.html?id=' + element.key) };


      textoH3Titulo = document.createTextNode(dados.nome);
      textoH5Descricao = document.createTextNode(dados.descricao);

      h3Titulo.appendChild(textoH3Titulo);
      h5Descricao.appendChild(textoH5Descricao);

      divInfo.insertAdjacentElement('beforeend', h3Titulo);
      divInfo.insertAdjacentElement('beforeend', h5Descricao);
      divInfo.insertAdjacentElement('beforeend', btnPedido);

      imgPrato.setAttribute('src', dados.foto.foto01);
      imgPrato.setAttribute('alt', dados.descricao);
      imgPrato.setAttribute('title', dados.descricao);

      divItens.insertAdjacentElement('beforeend', imgPrato);
      divItens.insertAdjacentElement('beforeend', divInfo);
      divContainer.insertAdjacentElement('beforeend', divItens);
    });
  })
}
window.onload = inicializarDados();




