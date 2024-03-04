function AddOpe(){
    let first1 = parseInt(document.getElementById("num1").value);
    let second1 = parseInt(document.getElementById("num2").value);
    let sum = first1 + second1;
    document.getElementById("answer").innerHTML = sum;
}
function SubOpe(){
    let first1 = parseInt(document.getElementById("num1").value);
    let second1 = parseInt(document.getElementById("num2").value);
    let difference = first1 - second1;
    document.getElementById("answer").innerHTML = difference;
}
function MulOpe(){
    let first1 = parseInt(document.getElementById("num1").value);
    let second1 = parseInt(document.getElementById("num2").value);
    let product = first1 * second1;
    document.getElementById("answer").innerHTML = product;
}
function DifOpe(){
    let first1 = parseInt(document.getElementById("num1").value);
    let second1 = parseInt(document.getElementById("num2").value);
    let quotient = first1 / second1;
    document.getElementById("answer").innerHTML = quotient;
}


function EOpe(){
    let first2 = parseInt(document.getElementById("num3").value);
    let second2 = parseInt(document.getElementById("num4").value);
    document.getElementById("answer").innerHTML = first2 == second2;
}
function NEOpe(){
    let first2 = parseInt(document.getElementById("num3").value);
    let second2 = parseInt(document.getElementById("num4").value);
    document.getElementById("answer").innerHTML = first2 != second2;
}
function LOpe(){
    let first2 = parseInt(document.getElementById("num3").value);
    let second2 = parseInt(document.getElementById("num4").value);
    document.getElementById("answer").innerHTML = first2 <= second2;
}
function GOpe(){
    let first2 = parseInt(document.getElementById("num3").value);
    let second2 = parseInt(document.getElementById("num4").value);
    document.getElementById("answer").innerHTML = first2 >= second2;
}


function AssAddOpe(){
    let first3 = Number(document.getElementById("num5").value);
    let second3 = Number(document.getElementById("num6").value);

    document.getElementById("answer").innerHTML = first3 + "+=" + second3 + "=" + (first3 += second3);
}
function AssSubOpe(){
    let first3 = Number(document.getElementById("num5").value);
    let second3 = Number(document.getElementById("num6").value);

    document.getElementById("answer").innerHTML = first3 + "-=" + second3 + "=" + (first3 -= second3);
}
function AssMulOpe(){
    let first3 = Number(document.getElementById("num5").value);
    let second3 = Number(document.getElementById("num6").value);
    document.getElementById("answer").innerHTML = first3 + "*=" + second3 + "=" + (first3 *= second3);
}
function AssDivOpe(){
    let first3 = Number(document.getElementById("num5").value);
    let second3 = Number(document.getElementById("num6").value);
    document.getElementById("answer").innerHTML = first3 + "/=" + second3 + "=" + (first3 /= second3);
} 