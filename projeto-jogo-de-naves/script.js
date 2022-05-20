let inicio = document.getElementById("inicio");
let fundoGame = document.getElementById("fundoGame");
let pagina = document;

let criaDivJogador = document.createElement("div");
let criaDivInimigo1 = document.createElement("div");
let criaDivInimigo2 = document.createElement("div");
let criaDivAmigo = document.createElement("div");

function start() {
  criaDivJogador.id = "jogador";
  criaDivInimigo1.id = "inimigo1";
  criaDivInimigo2.id = "inimigo2";
  criaDivAmigo.id = "amigo";

  criaDivJogador.className = "anima1";
  criaDivInimigo1.className = "anima2";
  criaDivAmigo.className = "anima3";

  inicio.style.display = "none";

  fundoGame.append(criaDivJogador);
  fundoGame.append(criaDivInimigo1);
  fundoGame.append(criaDivInimigo2);
  fundoGame.append(criaDivAmigo);

  let jogo = {};

  jogo.timer = setInterval(loop, 30);

  function loop() {
    movefundo();
  }

  function movefundo() {
    let valorbg = Number(fundoGame.style.backgroundPosition);
    valorbg = (valorbg - 1 + "px").toString();
    console.log(valorbg);
  }
}
