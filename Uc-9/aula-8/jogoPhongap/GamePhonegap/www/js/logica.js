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

const conteudo = document.querySelector(".conteudo");
const footer = document.querySelector(".footer");
const comeco = document.querySelector(".comeco");






function trocarParaTelaJogo() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        if(conteudo.classList.contains("disable") && footer.classList.contains("disable") && comeco.classList.contains("active")){
            conteudo.classList.remove("disable");
            conteudo.classList.add("active");
            
            footer.classList.remove("disable");
            footer.classList.add("active");
            
            comeco.classList.remove("active");
            comeco.classList.add("disable");
            startGame(perguntas);
            
        }
  
        
    })
}

function questaoCorreta() {
    document.querySelector(".resposta").addEventListener("click", function(){
        console.log(this)
    })
}

function trocarPerguntaResposta(i){
    document.documentElement.querySelector(".perguntah2").innerText = perguntas[i].pergunta;
    document.documentElement.querySelector(".resposta").innerText = perguntas[i].resposta;

    questaoCorreta();
}

function startGame(perguntas){
    // for(let i = 0; i < perguntas.length; i++){
        let i = 0;
        trocarPerguntaResposta(i);
        console.log("pergunta: " + perguntas[i].pergunta)
        console.log(i)
        temporizador();
        const meuIntervalo = setInterval(function(){
            trocarPerguntaResposta(i+1);
            console.log("pergunta: " + perguntas[i+1].pergunta)
            console.log(i+ 1)            
            
            i++;
            if(i >= perguntas.length -1){
                clearInterval(meuIntervalo)
                finalJogo();
            }
            
        }, (perguntas[0].tempo * 1000) + 2000);
        
        
    // }

}

function temporizador(){
    let tempo = perguntas[0].tempo ;
    let h3Relogio = document.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:';

    (tempo.toString().length < 2) ? document.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:0' + tempo :  document.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:' + tempo;

    const meuTemporizador = setInterval(function(){
        (tempo.toString().length < 2) ? document.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:0' + tempo-- :  document.querySelector("h3").innerHTML = '<i class="fas fa-hourglass-start"></i>: 00:' + tempo-- ;

        if(tempo < 0){
            clearInterval(meuTemporizador)
            console.log("temporizador parado")
        }
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
    document.querySelector('body').classList.toggle("dark");
    document.querySelector('h3').classList.toggle("dark");
}