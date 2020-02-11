const imagens = [
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 1",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 1",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 2",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 2",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 3",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 3",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 4",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 4",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 5",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 5",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 6",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 6",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 7",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 7",
    nomeGenero: "Genero"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Album ou playlist 8",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album 8",
    nomeGenero: "Genero"
  },
];

function cardAlbum(data) {
  return (`
        ${data.map((elemnt, index) => `
        <div class="container container-album">
            <h2>${data[index].titulo}</h2>
            <div class="cards">
                ${data.map((data) => `
                <div class="card-item">
                    <img src="${data.caminho}"alt="${data.alt}" >
                    <h3>${data.nomeAlbum}</h3>
                    <h4>${data.totalFaixas}</h4>
                </div>
                `).join('')}
            </div>
        </div>

        ${cardGenero(data, index)}

        `).join('')}
    `);
}

function cardGenero(data, index) {
  return (`
        <div class="container container-genero">
            <h2>${data[index].nomeGenero}</h2>
            <div class="cards">
                ${data.map((data) => `
                <div class="card-item card-item-genero">
                    <img src="${data.caminho}"a.lt="${data.alt}" >
                </div>
                `).join('')}
            </div>
        </div>
    `);
}

function createFooter() {
  return (`
        <ul class="menu-footer">
            <li class="link-item home">
                <a href="#"><i class="fas fa-home fa-lg"></i>Home</a>
            </li>

            <li class="link-item flow">
                <a href="#"><i class="fas fa-compact-disc fa-lg"></i>Flow</a>
            </li>

            <li class="link-item favoritos">
                <a href="#"><i class="fas fa-star fa-lg"></i>Favorito</a>
            </li>

            <li class="link-item busca">
                <a href="#"><i class="fas fa-search fa-lg"></i> Busca</a>
            </li>
        </ul>
    `)
}


const footerHtml = document.querySelector('.footer');
const mainHtml = document.querySelector('.main');

mainHtml.insertAdjacentHTML("beforeend", cardAlbum(imagens));
footerHtml.innerHTML = createFooter();