const divContainer = document.querySelector('.container'),
btnEntrar = document.querySelector('#login'),
btnSair = document.querySelector('#logout'),
footer = document.querySelector('.footer');


firebase.auth().onAuthStateChanged((user) =>{
  if (user) {
    btnEntrar.style.display = 'none';
    btnSair.style.display = 'inline-block';
  }else{
    console.log('nao logado')
    btnSair.style.display = 'none';
    btnEntrar.style.display = 'inline-block';
  }
});

function logout(){
  var user = firebase.auth();
  user.signOut();
}


const refDatabase = firebase.database().ref().child('cardapio');

function criarElementos(element) {
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
  btnPedido.classList.add('hover')

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
}

(function inicializarDados() {
  refDatabase.on('value', (snapShot) => {

    divContainer.innerHTML = '';
    snapShot.forEach((element, index) => {
      criarElementos(element);
    });
  })
}())






