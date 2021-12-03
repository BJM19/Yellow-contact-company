$(document).ready(function() {
    $("#InputForm").submit(function(event) {
        event.preventDefault();
        send();
    });

});

function send() {
    var login = $("#InputForm input[name='login']").val();
    var password = $("#InputForm input[name='password']").val();
    $.ajax({
        type: 'POST',
        datatype : "application/json",
        url: '/login/validate',
        data:
            {
                'email': login,
                'password': password
            },
        success: function(msg) {
            console.log(msg);
            if (msg == true){
                document.cookie = "nombre=logeadoNea"
                window.location.href = "selector-options"
            }
            else {
                alert("Usuario o contraseña invalidas")
            }
        },
        error: function(msg) {
            console.log(msg)
        }
    });
}
