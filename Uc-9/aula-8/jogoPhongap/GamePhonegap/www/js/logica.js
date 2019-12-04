function reset() {
    window.location.reload();
}
function darkMode() {
    alert("darkMode ");
}
function startGame() {
    document.documentElement.querySelector(".startGame").addEventListener("click", function(){
        const conteudo = document.documentElement.querySelector(".conteudo").classList;
        const footer = document.documentElement.querySelector(".footer").classList;
        if(conteudo.contains("disable") || footer.contains("disable")){
            conteudo.add("active");
            conteudo.remove("disable");
            footer.add("active");
            footer.remove("disable");
            document.querySelector(".comeco").classList.add("disable");
        }
        
    })
}
startGame();