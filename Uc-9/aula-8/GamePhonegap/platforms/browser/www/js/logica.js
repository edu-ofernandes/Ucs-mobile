document.addEventListener("DOMContentLoaded", function (){
    trocarParaTelaJogo();
    
});



const perguntas = [
    {
        pergunta: "Pergunta 1?",
        resposta: [
            {
                todas: ["Respo Err 1 - perg 1", "Respo Err 2- perg 1", "Respo Cert - perg 1"], certa: "Respo Cert - perg 1"
            }
        ],
        acerto: "",
        erro: "",
        tempo: 5
    },
    {
        pergunta: "Pergunta 2?",
        resposta: [
            {
                todas: ["Respo Err 1 - perg 2", "Respo Err 2- perg 2", "Respo Cert - perg 2"], certa: "Respo Cert - perg 2"
            }
        ],
        acerto: "",
        erro: "",
        tempo: 5
    },
    {
        pergunta: "Pergunta 3?",
        resposta: [
            {
                todas: ["Respo Err 1 - perg 3", "Respo Err 2- perg 3", "Respo Cert - perg 3"], certa: "Respo Cert - perg 3"
            }
        ],
        acerto: "",
        erro: "",
        tempo: 5
    }
]

const conteudo = document.querySelector(".conteudo");
const footer = document.querySelector(".footer");
const comeco = document.querySelector(".comeco");






function trocarParaTelaJogo() {
    document.querySelector(".startGame").addEventListener("click", function(){
        if(conteudo.classList.contains("disable") && footer.classList.contains("disable") && comeco.classList.contains("active")){
            conteudo.classList.remove("disable");
            conteudo.classList.add("active");
            
            footer.classList.remove("disable");
            footer.classList.add("active");
            
            comeco.classList.remove("active");
            comeco.classList.add("disable");
            startGame();
            
        }
  
        
    })
}



function startGame(){

    for(let i = 0; i < perguntas.length; i++){
        // console.log(perguntas[i].resposta[i])

        const perguntaElement = `<h2 class="perguntah2">${perguntas[i].pergunta}</h2>`;
        const respostaElement = `
            <label class="resposta" for="resposta3" >${perguntas[i].resposta[i].todas[i]}</label>
            <input type="checkbox" id="resposta3" value="${perguntas[i].resposta[i].todas[i]}"> `;

        conteudo.insertAdjacentHTML("beforeend", respostaElement);
        document.querySelector(".pergunta").insertAdjacentHTML("afterbegin", perguntaElement); 
    }
    

}



/*function reset() {
    if(conteudo.classList.contains("active") && footer.classList.contains("active") && comeco.classList.contains("disable")){
            location.reload();
            conteudo.classList.remove("active");
            conteudo.classList.add("disable");
            
            footer.classList.remove("active");
            footer.classList.add("disable");
            
            comeco.classList.remove("disable");
            comeco.classList.add("active");
    }
}*/


function darkMode() {
    document.querySelector('body').classList.toggle("dark");
    document.querySelector('h3').classList.toggle("dark");
}