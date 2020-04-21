btnCadastrar.addEventListener('click', cadastrar);

function cadastrar() {
  alert('teserxvnasdm,');
  let nomeValue = nome.value;
  let emailValue = email.value;
  let senhaValue = senha.value;
  firebase.auth().createUserWithEmailAndPassword(emailValue, senhaValue)
    .then((res) => console.log(res.user.displayName))
    .catch((erro) => console.log(erro.message))
}