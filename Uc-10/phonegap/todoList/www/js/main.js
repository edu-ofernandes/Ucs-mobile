// Your web app's Firebase configuration
var firebaseConfig = {
  apiKey: "AIzaSyAs80ufIbebNoiVQ0TYhZIr5qvEYIu16Ec",
  authDomain: "edusupremo-3f4d2.firebaseapp.com",
  databaseURL: "https://edusupremo-3f4d2.firebaseio.com",
  projectId: "edusupremo-3f4d2",
  storageBucket: "edusupremo-3f4d2.appspot.com",
  messagingSenderId: "317692959225",
  appId: "1:317692959225:web:14b4683d5ed867242ac528"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);

const formCriar = document.getElementById("criar");
var counter = new Date().getTime();
const tarefaHtml = document.querySelector('.tarefas');

formCriar.addEventListener("submit", (e) => {
  var nomeTarefa = formCriar.querySelector("#nomeTarefaText").value;
  var descricaoTarefa = formCriar.querySelector("#descricaoTarefaText").value;
  e.preventDefault();
  formCriar.reset();

  var tarefaObj = {
    id: counter,
    nomeTarefa: nomeTarefa,
    descricaoTarefa: descricaoTarefa
  };

  criarTarefa(tarefaObj, counter);
})

function criarTarefa(tarefaObj, counter) {
  console.log(counter)
  counter += 1;
  console.log(counter)
  let db = firebase.database().ref(`tarefas/${counter}`);
  db.set(tarefaObj);

  tarefaHtml.innerHTML = '';
  lerTarefa();

}

function lerTarefa() {
  var tarefa = firebase.database().ref('tarefas/');
  tarefa.on('value', (dado) => {
    tarefaHtml.innerHTML = '';
    dado.forEach((element) => {
      var tarefaValor = element.val();
      tarefaHtml.innerHTML += `
      <div class="tarefa">
        <p id="nomeTarefa">${tarefaValor.nomeTarefa}</p>
        <p id="descricaoTarefa">${tarefaValor.descricaoTarefa}</p>
        <div class="botoes">
          <button id="alterar" data-id="${tarefaValor.id}"><i class="far fa-edit"></i></button>
          <button id="deletar" data-id="${tarefaValor.id}"><i class="far fa-trash-alt"></i></button>
        </div>
      </div>
    `;
    })

  })
}