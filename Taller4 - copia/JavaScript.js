const nombre = document.getElementById('name');
const apellido = document.getElementById('lastName');
const direccion = document.getElementById('adress');
const ccusuario = document.getElementById('ccusuario');
const ccpaswd = document.getElementById('id_usr');
const email = document.getElementById('email');
const parrafo = document.getElementById('warnings');
const form = document.getElementById('form1');

function myFunction() {
    document.getElementById('labelname').innerHTML = "Hello JavaScript!";
}

function submitFunction(event) {
    parrafo.innerHtml = "Enviado";
    let warnings = ""
    let entrar = false
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    let regexPaswd = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{15,20}$/
    let regexUsuario = /[A-Za-z0-9]/
    let regexDireccionCll = /^cll/
    parrafo.innerHTML = ""
    if (nombre.value.length > 25 || nombre.value.length < 1) {
        warnings += "El nombre no es valido <br>"
        entrar = true
    }
    if (apellido.value.length > 25 || apellido.value.length < 1) {
        warnings += "El apellido no es valido <br>"
        entrar = true
    }
    if (!regexEmail.test(email.value)) {
        warnings += "El email no es valido <br>"
        entrar = true
    }
    if (!regexPaswd.test(ccpaswd.value)) {
        warnings += "La contraseña no es valido <br>"
        entrar = true
    }
    if (!regexUsuario.test(ccusuario.value) || ccusuario.value.length > 20 || ccusuario.value.length < 10) {
        warnings += "El usuario no es valido <br>"
        entrar = true
    }
    if (!regexDireccionCll.test(direccion.value)) {
        warnings += "La dirección no es valida <br>"
        entrar = true
    }

    if (entrar) {
        //window.alert(warnings);
        parrafo.innerHtml = warnings
    } else {
        parrafo.innerHtml = "Enviado"
    }


}

form.addEventListener("submit", submitFunction)