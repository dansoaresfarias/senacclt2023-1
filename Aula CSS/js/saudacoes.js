const ola = document.getElementById("ola");
ola.addEventListener("click", saudacoes);

function saudacoes(){
    let nome = prompt("Informe seu Nome:");
    // alert("Olá " + nome + " !");
    alert(`Olá ${nome}!`);
}