$(document).ready(function() {
        wallinfo();
    });


function wallinfo() {
        $.ajax({  
                url: 'https://rest-wall.herokuapp.com/public/posts/',
                dataType: "json",  
                method: 'post',  
                success: function (data) { 
				console.log(data); 
                    var postTable = $('#poststbl tbody');  
                    postTable.empty();  
                    $(data).each(function (wall, posts) {  
                        postTable.append('<tr><td> <img  style="width: 100px;" alt="" title="" src="images/avatar.png" /> </td><td>'  
                            + posts.user.name+" "+posts.user.lastName + '</td><td>' + posts.content + '</td><td>' + posts.createdDate  
                            + '</td></tr>');  
        });
}});
}
