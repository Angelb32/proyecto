$(document).ready(init);


function init() {
    //single book
    $('#mi_libro').booklet({
        width: 800,
        height: 600,
        
        closed: true,
        covers:true,
        autoCenter: true,
        
        pagePadding: 0,
        hoverWidth: 100,
        
        shadows: true,
        shadowTopFwdWidth: 100
    });
    
    $("#bt_go").click(function(){
        $('#mi_libro').booklet("gotopage", $("#in_go").val());
    })
}
