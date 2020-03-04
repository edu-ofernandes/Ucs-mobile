const splashHtml = document.querySelector('.splash');

window.onload = () => {
  splashHtml.style.display = 'flex';
  setTimeout(() => {
    splashHtml.style.display = 'none';
  }, 2000);
}