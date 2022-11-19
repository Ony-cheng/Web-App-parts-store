
document.forms.myForm.onsubmit = function (event){
    event.preventDefault();

    let userinput = new Object();
        userinput.name = document.forms.myForm.name.value;
        userinput.partNumber = document.forms.myForm.part_number.value;
        userinput.description = document.forms.myForm.description.value;
        userinput.imageURL = document.forms.myForm.image_URL.value;
        userinput.price = document.forms.myForm.price.value;


    console.log(JSON.stringify(userinput));


    // jQuery.get("http://localhost:8080/test/", {query:userinput}, "json");

    $.ajax({
        url:'http://localhost:8080/parts/add',
        type:'post',
        dataType:'json',
        data:JSON.stringify(userinput),
        contentType:'application/json; charset=utf-8',
        // success:function(result){
        //
        //     console.log(result);
        //     console.log(result.message);
        //  // $('#response').append(result.message)
        //     document.getElementById('response').innerHTML = result.message
        // }
        })
}