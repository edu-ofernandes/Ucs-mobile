const dados = [
    {
        titulo: "Titulo 1",
        descricao: "Video game",
        urlImagem: "./img/ps4.jpg",
        altImagem: "video game playstation 4",
    },
    {
        titulo: "Titulo 1",
        descricao: "Video game",
        urlImagem: "./img/ps4.jpg",
        altImagem: "video game playstation 4",
    },
    {
        titulo: "Titulo 1",
        descricao: "Video game",
        urlImagem: "./img/ps4.jpg",
        altImagem: "video game playstation 4",
    },
    {
        titulo: "Titulo 1",
        descricao: "Video game",
        urlImagem: "./img/ps4.jpg",
        altImagem: "video game playstation 4",
    },
    {
        titulo: "Titulo 1",
        descricao: "Video game",
        urlImagem: "./img/ps4.jpg",
        altImagem: "video game playstation 4",
    },
];

const container = document.querySelector('.container');

function listRender(dados, index){
    return(`
    <div class="list">
        <img src="${dados[index].urlImagem}" alt="${dados[index].altImagem}">
        <div class="info">
            <h2>${dados[index].titulo}</h2>
            <p>${dados[index].descricao}</p>
            <button type="button">Ver mais +</button>
        </div>
    </div>
    `);
}

// console.log(dados[0])

for (let i = 0; i < dados.length; i++) {
    container.insertAdjacentHTML("beforeend", listRender(dados, i));
    
}