const splashHtml = document.querySelector('.splash');

window.onload = () => {
  splashHtml.style.display = 'flex';
  setTimeout(() => {
    splashHtml.style.display = 'none';
    window.location.assign('../../../app/entrar.html')
  }, 2000);
}