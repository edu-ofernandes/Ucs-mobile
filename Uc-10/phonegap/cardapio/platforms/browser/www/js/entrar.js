const containerEntrarHtml = document.querySelector('.container-entrar');
let flag = window.location.href.split("=");

if (flag[1] == 'entrar') {
  gerarFormEntrar();
}
if (flag[1] == 'cadastrar') {
  gerarFormCadastrar();
}


function gerarFormCadastrar() {
  containerEntrarHtml.innerHTML = formCadastrar();
}
function gerarFormEntrar() {
  containerEntrarHtml.innerHTML = formEntrar();
}

function formEntrar() {
  return (
    `<form id="logar" action="#" method="POST">
    <h1>Entrar</h1>
    <input type="email" placeholder="E-mail:" required>
    <input type="password" placeholder="Senha:" required>
    <button type="submit" class="entrar">Entrar</button>
    <button type="button" class="voltar" onclick="window.location.assign('index.html');">Voltar</button>
    <p><a href="entrar.html?flag=cadastrar">Cadastrar</a></p>
  </form>`
  )
};

function formCadastrar() {
  return (
    `<form id="cadastrar" action="#" method="POST">
      <h1>Cadastro</h1>
      <input type="text" placeholder="Nome:" required>
      <input type="email" placeholder="E-mail:" required>
      <input type="password" placeholder="Senha:" required>
      <input type="password" placeholder="Senha:" required>
      <button type="submit" class="cadastrar">Cadastrar</button>
      <button type="button" class="voltar" onclick="window.location.assign('index.html');">Voltar</button>
      <p><a href="entrar.html?flag=entrar">Entrar</a></p>
    </form>`
  )
};
