const caio = document.getElementById("caio");
caio.addEventListener("click", trocarDados);

function trocarDados(){
    let img = document.getElementById("imgCurriculo");
    let titulo = document.getElementById("titulo")
    if(img.alt == "Danilo"){
        img.src = "./img/caio.jpg";
        img.alt = "Caio";
        titulo.innerHTML = "Caio Rodrigues dos Santos Silva"
        window.scrollTo(0, 0);
    }else{
        img.src = "./img/Danilo.png";
        img.alt = "Danilo";
        titulo.innerHTML = "Danilo Farias Soares da Silva"
        window.scrollTo(0, 0);
    }
}

