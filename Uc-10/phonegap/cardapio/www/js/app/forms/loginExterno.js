function logarRedesSociais(provider, texto){
  provider.addScope(texto);

  firebase.auth().signInWithPopup(provider)
    .then((res)=>window.location.assign(`inicio.html?name=${res.user.displayName}`))
    .catch((res)=>console.log(`erro ${res.message}`));
}

document.getElementById('facebook-ico').addEventListener('click', ()=>{
  let provider = new firebase.auth.FacebookAuthProvider();
  logarRedesSociais(provider, 'user_birthday');
})

document.getElementById('github-ico').addEventListener('click', ()=>{
  let provider = new firebase.auth.GithubAuthProvider();
  logarRedesSociais(provider, 'repo');
})