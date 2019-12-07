document.addEventListener("DOMContentLoaded", function (){
    trocarParaTelaJogo();
    
});



const perguntas = [
    {
        pergunta: "Pergunta 1?",
        resposta: "Resposta 1!",
        acerto: "",
        erro: "",
        tempo: 5
    },
    {
        pergunta: "Pergunta 2?",
        resposta: "Resposta 2!",
        acerto: "",
        erro: "",
        tempo: 5
    },
    {
        pergunta: "Pergunta 3?",
        resposta: "Resposta 3!",
        acerto: "",
        erro: "",
        tempo: 5
    }
]

const conteudo = document.documentElement.querySelector(".conteudo");
const footer = document.documentElement.querySelector(".footer");
const comeco = document.documentElement.querySelector(".comeco");






function trocarParaTelaJogo() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        if(conteudo.classList.contains("disable") && footer.classList.contains("disable") && comeco.classList.contains("active")){
            conteudo.classList.remove("disable");
            conteudo.classList.add("active");
            
            footer.classList.remove("disable");
            footer.classList.add("active");
            
            comeco.classList.remove("active");
            comeco.classList.add("disable");
            startGame();
            temporizador();
        }
  
        
    })
}


function startGame(){
    for(let i = 0; i < perguntas.length; i++){
        setInterval(function(){
            console.log("pergunta: " + perguntas[i].pergunta)
            document.documentElement.querySelector(".perguntah2").innerText = perguntas[i].pergunta;
        }, perguntas[0].tempo * 1000);
        
    }
    

}

function temporizador(){
    setInterval(function(){
        document.documentElement.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:0' + perguntas[0].tempo--;
    }, 1000);
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