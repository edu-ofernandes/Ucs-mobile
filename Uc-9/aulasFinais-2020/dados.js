const games = [
  {
    nome: "Dark Souls Remastered",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/5b0467082a1c6e250aceff3f/banners/t7wk5ojrnuff2osmz28g.jpg",
    categoria: ["AÇÃO", "FANTASIA", "RPG"],
    lancamento: "23/05/2018",
    desenvolvedor: "FromSoftware, Inc",
    trailer: "https://youtu.be/KfjG9ZLGBHE",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/dark-souls-remastered",
    descricao: "Então, houve fogo. Vivencie novamente o jogo que iniciou tudo, que definiu o gênero e aclamado pela crítica. Belamente remasterizado e, agora, legendado em português, retorne a Lordran em deslumbrantes detalhes de alta definição a 60 fps. Dark Souls Remastered inclui o jogo principal mais o DLC Atorias of the Abyss.",
  },
  {
    nome: "The Elder Scrolls V: Skyrim",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/557dbaee69702d0a9c645e00/banners/k25bup1zctwfymjdbjml.jpg",
    categoria: ["FANTASIA", "MUNDO", "ABERTO", "RPG"],
    lancamento: "11/11/2011",
    desenvolvedor: "Bethesda",
    trailer: "https://youtu.be/5xwboyafbwc",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/the-elder-scrolls-v-skyrim",
    descricao: "O Império de Tamriel está no limite. O Rei de Skyrim foi assassinado. Alianças com pretensões ao trono são criadas. No meio de todo esse conflito, um mal muito mais perigoso e antigo é despertado. Dragões, perdidos há muito tempo para as passagens de The Elder Scrolls, voltaram a Tamriel. O futuro de Skyrim, mesmo do Império em si, está em jogo enquanto eles esperam pela profecia de um herói nascido com o poder da voz e o único capaz de enfrentar os temíveis dragões.",
  },
  {
    nome: "PLAYERUNKNOWN'S BATTLEGROUNDS",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/599b5c3aefd2f007a300113a/banners/ar7wpk7ecergqk0dj6tm.jpg",
    categoria: ["AÇÃO", "ACESSO", "ANTECIPADO", "FPS", "SOBREVIVÊNCIA", "TIRO"],
    lancamento: "23/03/2017",
    desenvolvedor: "PUBG Corporation",
    trailer: "https://youtu.be/dolvjnq_mZs",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/playerunknowns-battlegrounds",
    descricao: "PLAYERUNKNOWN'S BATTLEGROUNDS é um FPS de última geração que está sendo desenvolvido por meio de feedback da comunidade. Com alto grau de detalhamento, os jogadores devem começar o jogo em busca de recursos básicos como suprimentos e armas",
  },
  {
    nome: "The Witcher 3: Wild Hunt – GOTY Edition",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/57c47e2ed2773452a4000127/banners/ajwqs4pm3ltp3ceqqcdp.jpg",
    categoria: ["FANTASIA", "MUNDO", "ABERTO", "RPG"],
    lancamento: "30/08/2016",
    desenvolvedor: "CDProjekt",
    trailer: "https://youtu.be/WViB3B-5D-k",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/witcher-3-wild-hunt-game-year-edition",
    descricao: "The Witcher: Wild Hunt é um RPG de mundo aberto, ambientado em um mundo fantástico cheio de escolhas importantes e consequências de impacto. Em The Witcher, você joga como o caçador de monstros profissional Geralt da Rívia, que está em busca da criança da profecia em um vasto mundo aberto, rico em cidades mercantis, ilhas com piratas vikings, passagens perigosas nas montanhas e cavernas esquecidas a serem exploradas.",
  },
  {
    nome: "Grand Theft Auto V",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/557dbb7f69702d0a9c7c9c00/banners/p0cfb2ic7pompjaxvtrs.jpg",
    categoria: ["AÇÃO", "AVENTURA", "MUNDO", "ABERTO"],
    lancamento: "14/04/2015",
    desenvolvedor: "Rockstar North",
    trailer: "https://youtu.be/QkkoHAzjnUs",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/grand-theft-auto-v",
    descricao: "Quando um malandro de rua, um ladrão de bancos aposentado e um psicopata aterrorizante se envolvem com alguns dos criminosos mais assustadores e loucos do submundo, o governo dos EUA e a indústria do entretenimento, eles devem realizar golpes ousados para sobreviver nessa cidade implacável onde não podem confiar em ninguém, nem mesmo um no outro.",
  },
  {
    nome: "Max Payne 3",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/557dbb9569702d0a9cf9a300/banners/mhnenuyakn8ft3f9nloo.jpg",
    categoria: ["AÇÃO"],
    lancamento: "01/06/2012",
    desenvolvedor: "Rockstar",
    trailer: "https://www.youtube.com/watch?v=veFgqFj5IH0",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/max-payne-3",
    descricao: "Max Payne 3 é o mais novo game da série homônima que debutou em 2001 nos PCs. Neste game de ação, o jogador controla o mesmo Max Payne, que se encontra mais velho e com muito mais problemas. Desta vez, o plano de fundo não é a cidade de Nova Iorque, como nos antecessores, mas sim São Paulo, uma das maiores metrópoles do Brasil. Payne, após ser despedido do Departamento de Polícia de Nova Iorque, vem para o país tupiniquim para tentar ganhar a vida, e trabalha como segurança para uma família rica.",
  },
  {
    nome: "Call of Duty 4: Modern Warfare",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/557dbc6a69702d0a9cc8ee00/banners/cwt5yp9otxkealpyyq77.jpg",
    categoria: ["FPS"],
    lancamento: "12/11/2007",
    desenvolvedor: "Infinity Ward",
    trailer: "https://www.youtube.com/watch?v=LhuIjNSg7Gg",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/call-of-duty-4-modern-warfare-mac",
    descricao: "Call of Duty 4: Modern Warfare arma os jogadores com um poderoso arsenal composto das mais avançadas armas do momento e os transporta para as zonas de conflito mais perigosas do mundo, em uma jornada contra um grupo rebelde que ameaça todo o planeta.",
  },
  {
    nome: "Mafia II",
    imagemSrc: "https://assets.nuuvem.com/image/upload/t_banner_big/v1/products/557dba9769702d0a9ce93500/banners/iuakabbw1ch0baz9x98y.jpg",
    categoria: ["AÇÃO", "MUNDO", "ABERTO"],
    lancamento: "26/08/2010",
    desenvolvedor: "2K",
    trailer: "https://youtu.be/FF9bloQNtDY",
    plataforma: "PC",
    linkCompra: "https://www.nuuvem.com/item/mafia-ii",
    descricao: "Os jogadores serão levados ao submundo do crime, em cenário fictício do final dos anos 40 e início dos anos 50. Similar a um filme hollywoodiano, o jogo é ambientado numa cidade cheia de vida, misturando tiroteios, corridas cheias de tensão e narrativa cativante.",
  },
];
const farmacias = [
  {
    nome: "Droga Campos Farmácia",
    endereco: [
      {
        rua: "Dr. Gurgel",
        numero: "660",
        bairro: "Centro",
        cep: "19010000",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832216006",
    aberto24hrs: false,
  },
  {
    nome: "Farmácia Drogaria Presidente",
    endereco: [
      {
        rua: "Dr. Gurgel",
        numero: "548",
        bairro: "Centro",
        cep: "19010020",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832233653",
    aberto24hrs: false,
  },
  {
    nome: "Droga Rizzo",
    endereco: [
      {
        rua: "Av. Manoel Goulart",
        numero: "1217",
        bairro: "Centro",
        cep: "19015240",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832231052",
    aberto24hrs: false,
  },
  {
    nome: "Botica Nativa Farmácia de Manipulação",
    endereco: [
      {
        rua: "Dr. Gurgel",
        numero: "526",
        bairro: "Centro",
        cep: "19015140",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1821045189",
    aberto24hrs: false,
  },
  {
    nome: "Farmácia Santa Catarina Barão",
    endereco: [
      {
        rua: "Barão do Rio Branco",
        numero: "599",
        bairro: "Vila do estadio",
        cep: "19015120",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832265555",
    aberto24hrs: false,
  },
  {
    nome: "Drogasil",
    endereco: [
      {
        rua: "Manoel Goulart",
        numero: "2106",
        bairro: "Vila Santa Helena",
        cep: "19015241",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832211589",
    aberto24hrs: true,
  },
  {
    nome: "Drogasil",
    endereco: [
      {
        rua: "Joaquim Nabuco",
        numero: "635",
        bairro: "Centro",
        cep: "19010071",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832233603",
    aberto24hrs: true,
  },
  {
    nome: "Droga Raia",
    endereco: [
      {
        rua: "Av. Manoel Goulart",
        numero: "514",
        bairro: "Vila Nova",
        cep: "19010270",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1832238801",
    aberto24hrs: true,
  },
  {
    nome: "Drogaria São Paulo",
    endereco: [
      {
        rua: "Av. Cel. José Soares Marcondes",
        numero: "1906",
        bairro: "Vila Euclides",
        cep: "19010082",
        cidade: "Presidente prudente",
      }
    ],
    telefone: "1839030986",
    aberto24hrs: true,
  },
];