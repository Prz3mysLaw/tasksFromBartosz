

function sending() {


    var mySelect = document.getElementById("inputGroupSelect");
    var mySelection = mySelect.selectedIndex;


    var element = document.forms["sendArray"]["numbersList"].value;
    var re = new RegExp("[0-9\\,]");


    if (!re.test(element) || mySelection == 0) {
        document.getElementById("array").innerHTML = "Something Wrong";
    } else {
        var elements = element.split(',');

        for (var i=0; i<elements.length; i++)
        {
            elements[i] = parseInt(elements[i], 10);
        };

        var data = JSON.stringify({"numbers": elements, "order": mySelect.value});
        var xhr = new XMLHttpRequest();
        var url = "http://localhost:8080/numbers/sort-command";
        xhr.open("POST", url, true);
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.send(data);




        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                var json = JSON.parse(xhr.responseText);
                document.getElementById("array").innerHTML = json.numbers;
            } else {
                document.getElementById("array").innerHTML = "Bad Request";

            }
        }
    }


}