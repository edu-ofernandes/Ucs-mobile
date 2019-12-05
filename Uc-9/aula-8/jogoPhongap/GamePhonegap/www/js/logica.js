document.addEventListener("DOMContentLoaded", function (){
    trocarParaTelaJogo();
});

const perguntas = [
{
    pergunta: 'Pergunta 1?',
    resposta: 'Resposta 1!'
    },
{
    pergunta: 'Pergunta 2?',
    resposta: 'Resposta 2!'
    }, 
{
    pergunta: 'Pergunta 3?',
    resposta: 'Resposta 3!'
    }
]


let tempo = 20;
let acertos = [];
let erros = [];


const conteudo = document.documentElement.querySelector(".conteudo");
const footer = document.documentElement.querySelector(".footer");
const comeco = document.documentElement.querySelector(".comeco");

function responder(elemento){
    
   
}
const valorResppsta = document.documentElement.querySelector(".resposta").textContent;





function trocarParaTelaJogo() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        if(conteudo.classList.contains("disable") && footer.classList.contains("disable") && comeco.classList.contains("active")){
            conteudo.classList.remove("disable");
            conteudo.classList.add("active");
            
            footer.classList.remove("disable");
            footer.classList.add("active");
            
            comeco.classList.remove("active");
            comeco.classList.add("disable");
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