document.addEventListener("DOMContentLoaded", function (){
    trocarParaTelaJogo();
});

let pergunta = ["Pergunta 1?", "Pergunta 2?", "Pergunta 3?", "Pergunta 4?", "Pergunta 5?"];
let resposta = ["Resposta 1?", "Resposta 2?", "Resposta 3?", "Resposta 4?", "Resposta 5?"];
let tempo = 20;
let acertos = [];
let erros = [];




    




function trocarParaTelaJogo() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        const conteudo = document.documentElement.querySelector(".conteudo").classList;
        const footer = document.documentElement.querySelector(".footer").classList;
        if(conteudo.contains("disable") && footer.contains("disable")){
            conteudo.add("active");
            conteudo.remove("disable");
            footer.add("active");
            footer.remove("disable");
            document.querySelector(".comeco").classList.add("disable");
            // startGame();
            // temporizador();
        }
  
        
    })
}

function startGame() {
    for (let contador = 0; contador < pergunta.length; contador++) {
        
    }
}

function temporizador(){
    setInterval(function (){
        tempo--;
        if(tempo.toString().length == 1){
            document.documentElement.querySelector("h3").innerText = "00:0"+tempo;
        }else{
            document.documentElement.querySelector("h3").innerText = "00:"+tempo;
        }
        
    }, 1000)

    
}

function reset() {
    window.location.reload();
}
function darkMode() {

    document.documentElement.querySelector('body').classList.toggle("dark");
    document.documentElement.querySelector('h3').classList.toggle("dark");
    
  
    

}