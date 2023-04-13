const troca = document.getElementById("trocaTema");
troca.addEventListener("click", trocaTema);

function trocaTema(){
    let corpo = document.getElementById("corpo");
    corpo.classList.toggle("black");
    corpo.classList.toggle("white-text");
    window.scrollTo(0, 0);
}