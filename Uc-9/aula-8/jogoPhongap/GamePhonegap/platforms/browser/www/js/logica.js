document.addEventListener("DOMContentLoaded", function (){
    trocarParaTelaJogo();
});

let pergunta = ["Pergunta 1?", "Pergunta 2?", "Pergunta 3?", "Pergunta 4?", "Pergunta 5?"];
let resposta = ["Resposta 1?", "Resposta 2?", "Resposta 3?", "Resposta 4?", "Resposta 5?"];
let tempo = 20;
let acertos = [];
let erros = [];


const conteudo = document.documentElement.querySelector(".conteudo");
const footer = document.documentElement.querySelector(".footer");
const comeco = document.documentElement.querySelector(".comeco");

    

console.log(document.documentElement.querySelector(".pergunta").innerHTML=pergunta[0]);
console.log(document.documentElement.querySelector(".resposta").innerHTML=resposta[0]);


function trocarParaTelaJogo() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        if(conteudo.classList.contains("disable") && footer.classList.contains("disable") && comeco.classList.contains("active")){
            conteudo.classList.remove("disable");
            conteudo.classList.add("active");
            
            footer.classList.remove("disable");
            footer.classList.add("active");
            
            comeco.classList.remove("active");
            comeco.classList.add("disable");
            // startGame();
        }
  
        
    })
}

function reset() {
    if(conteudo.classList.contains("active") && footer.classList.contains("active") && comeco.classList.contains("disable")){
        // setTimeout(function(){
            conteudo.classList.remove("active");
            conteudo.classList.add("disable");
            
            footer.classList.remove("active");
            footer.classList.add("disable");
            
            comeco.classList.remove("disable");
            comeco.classList.add("active");
        // }, 500 )
    }
}


function darkMode() {
    document.documentElement.querySelector('body').classList.toggle("dark");
    document.documentElement.querySelector('h3').classList.toggle("dark");
}