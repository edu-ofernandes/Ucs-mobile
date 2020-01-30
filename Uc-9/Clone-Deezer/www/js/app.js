const imagens = [
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   >"
  },
  {
    caminho: "./res/img/card.png",
    alt: "cards de playlists, albuns, generos de musicas etc",
    titulo: "Titulo X",
    totalFaixas: "100 Faixas",
    nomeAlbum: "Album ou Playlist   >",
    nomeGenero: "Genero   "
  },
];

function cardAlbum(data) {
  return (`
        ${data.map(() => `
        <div class="container container-album">
            <h2>Album ou playlist  ></h2>
            <div class="cards">
                ${data.map((data) => `
                <div class="card-item">
                    <img src="${data.caminho}"alt="${data.alt}" >
                    <h3>${data.titulo}</h3>
                    <h4>100 Faixas</h4>
                </div>
                `).join('')}
            </div>
        </div>

        ${cardGenero(data)}

        `).join('')}
    `);
}

function cardGenero(data) {
  return (`
        <div class="container container-genero">
            <h2>Generos  ></h2>
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