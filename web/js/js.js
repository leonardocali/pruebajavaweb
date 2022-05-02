document.addEventListener("DOMContentLoaded", function() {

var btnModalabrir = document.getElementById("btnModalabrir");
btnModalabrir.style.visibility = "hidden"; 


});

function validarFormulario() {
  
  var usuario = document.getElementById('usuario').value;
  var clave = document.getElementById('passw').value;
  
  if((usuario.length && clave.length)>0) {
    
    let btnModalabrir = document.getElementById("btnModalabrir");
    btnModalabrir.click();
  } 
 
  
}



