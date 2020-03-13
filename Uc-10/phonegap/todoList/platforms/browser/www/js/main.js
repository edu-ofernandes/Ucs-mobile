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
const tarefaHtml = document.querySelector('.tarefas');
const btnAddTarefa = document.querySelector('#addTarefa');
let counter = new Date().getTime();
//usar onclick em vez de eventListener
formCriar.addEventListener("submit", (e) => {
  var nomeTarefa = formCriar.querySelector("#nomeTarefaText").value;
  var descricaoTarefa = formCriar.querySelector("#descricaoTarefaText").value;
  e.preventDefault();
  formCriar.reset();
  var tarefaObj = {
    nomeTarefa: nomeTarefa,
    descricaoTarefa: descricaoTarefa,
    id: counter
  };
  counter = new Date().getTime();
  criarTarefa(tarefaObj);
})

function criarTarefa(tarefaObj) {
  let db = firebase.database().ref("tarefas");
  db.push(tarefaObj);

  tarefaHtml.innerHTML = '';
  lerTarefa();

}

function alterarTarefa(id) {
  console.log('alterar' + id)
}
function deletarTarefa(id) {
  console.log('deletar' + id)
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
          <button id="alterar" onclick="alterarTarefa(${tarefaValor.id})" data-id="${tarefaValor.id}"><i class="far fa-edit"></i></button>
          <button id="deletar" onclick="deletarTarefa(${tarefaValor.id})" data-id="${tarefaValor.id}"><i class="far fa-trash-alt"></i></deletartton>
        </div>
      </div>
    `;
    })

  })
}

