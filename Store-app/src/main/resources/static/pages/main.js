
document.forms.myForm.onsubmit = function (event){
    event.preventDefault();

    let userinput = document.forms.myForm.myForm_in.value;

    console.log(userinput);
    // jQuery.get("http://localhost:8080/test/", {query:userinput}, "json");

    $.ajax({
        url:'http://localhost:8080/test/',
        method:'get',
        dataType:'json',
        data:{
          query: userinput
        },
        success:function(result){

            console.log(result);
            console.log(result.message);
         // $('#response').append(result.message)
            document.getElementById('response').innerHTML = result.message
        }
        })
}