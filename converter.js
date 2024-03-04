function CalculateLength(){
    var fromLength = Number(document.getElementById("fromLength").value)

    if(ValidateLengthConvereter(fromLength)){
        //start calculation
        alert("1000");

    var fromUnit = document.getElementById("fromUnit").value;
    var toUnit = document.getElementById("toUnit").value;

    var outputlength = document.getElementById("fromUnit").value;

    if(fromUnit == "Millimeter"){
        if(toUnit == "Centimeter"){
            //cm = mm/10
            var ans = fromLength / 10;
            alert("Amogus ඞ"); 
            }
        }
    }
}
function ValidateLengthConvereter(fromLength){
    if(fromLength<=0){
        alert("Impostor ඞ");
        return false;
    }
    return true;
}