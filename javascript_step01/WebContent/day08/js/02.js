window.onload = function(){

};
function addWord(){
    var hangle, enlish;
//    hangle = document.getElementById("han").value;
//    enlish = document.getElementById("eng").value;

    hangle = $("#han").val();
    enlish = $("#eng").val();
    
    //1번만 들어감
    //$(".wordArea").text("류완선 하이");
    //계속 들어감
    //$(".wordArea").append("류완선 하이");
    
    //1번만 들어감(태그도 됨)
    //$(".wordArea").html("<h1>안녕</h1>");

    $(".wordArea").append("<h1>" + hangle + ":" + enlish + "</h1>");
    
    console.log(hangle, enlish);
}