$(document).ready(function() {
	misCookies = document.cookie;
	listaCookies = misCookies.split(";");
	for (i in listaCookies) {
    busca = listaCookies[i].search("nombre2");
    if (busca > -1)
	 {micookie=listaCookies[i]}
    }
    igual = micookie.indexOf("=");
	valor = micookie.substring(igual+1);		
    $("#comentform").submit(function(event) {
        event.preventDefault();
        publicPost(valor);
    }); 
    });


function publicPost(valor) {
        var content = $("#comentform textarea[id='fname']").val();
        $.ajax({
            type: 'POST',
            datatype : "json",
            url: 'http://localhost:8090/public/addpost/'+valor,
            data:
                {
                'content': content,
            },
            success: function(msg) {
                console.log(msg);
                if (msg != true){
                   alert("tu publicacion fue exitosa")
                }
                else {
                    alert("Revisa tu publicacion")
                }
            },
            error: function(msg) {
               console.log(msg)
            }
        });
}