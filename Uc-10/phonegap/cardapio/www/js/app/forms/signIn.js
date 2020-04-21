btnEntrar.addEventListener('click', logar);

function logar() {
  let emailValue = emailHtml.value;
  let senhaValue = senhaHtml.value;
  firebase.auth().signInWithEmailAndPassword(emailValue, senhaValue)
    .then(() => window.location.assign('inicio.html'))
    .catch(() => alert('email ou senha estao errado'))
}