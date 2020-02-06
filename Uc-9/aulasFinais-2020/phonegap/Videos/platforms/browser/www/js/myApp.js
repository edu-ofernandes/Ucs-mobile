const links = [
  "https://www.youtube.com/embed/j6iSONAO6sQ",
  "https://www.youtube.com/embed/Zr1g1KqZaYY",
  "https://www.youtube.com/embed/4wwhyKZjYbY",
  "https://www.youtube.com/embed/8xgqEBE1SKI",
  "https://www.youtube.com/embed/42JwezkHVVI",
  "https://www.youtube.com/embed/fhIDgAfuJZ8",
  "https://www.youtube.com/embed/Z5D_Jj6JStw",
  "https://www.youtube.com/embed/XiAtxDeP-p8",
  "https://www.youtube.com/embed/pbLTGXxTfNo",
  "https://www.youtube.com/embed/ITdr-Z27UCE",
];

const mainHtml = document.querySelector('.main');

function iframeHtml(link, index){
  return(`
    <div class="videos">
      <h2>Titulo do video</h2>
      <iframe src="${link[index]}" frameborder="0"
      allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>`
  )
};



for (let i = 0; i < links.length; i++) {
  mainHtml.insertAdjacentHTML("beforeend", iframeHtml(links, i));
}