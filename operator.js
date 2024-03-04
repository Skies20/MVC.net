let num1 = 1;
let num2 = 2;
let num3 = 3;
let num4 = 4;
let num5 = 5;
let num6 = 36;
let num7 = 25;
let num = 0;
let difference = 0;
let product = 0;
let quotient = 0;
function addition(){
    let a = 1;
    let b = 2;
    let c = a + b;
    document.getElementById("addition").innerHTML = a + "+" + b + "=" + c;
}

function subtraction(){
    let a = 1;
    let b = 2;
    let c = a - b;
    document.getElementById("subtraction").innerHTML = a + "-" + b + "=" + c;
}

function multiplication(){
    let a = 1;
    let b = 2;
    let c = a * b;
    document.getElementById("multiplication").innerHTML = a + "*" + b + "=" + c;
}

function division(){
    let a = 1;
    let b = 2;
    let c = a / b;
    document.getElementById("division").innerHTML = a + "/" + b + "=" + c;
}


function assignmentaddition(){
    let a = 1;
    let b = 2;
    let c = a += b;
    document.getElementById("assignmentaddition").innerHTML = a + "+=" + b + "=" + c;
}

function assignmentsubtraction(){
    let a = 1;
    let b = 2;
    let c = a -= b;
    document.getElementById("assignmentsubtraction").innerHTML = a + "-=" + b + "=" + c;
}

function assignmentmultiplication(){
    let a = 1;
    let b = 2;
    let c = a *= b;
    document.getElementById("assignmentmultiplication").innerHTML = a + "*=" + b + "=" + c;
}

function assignmentdivision(){
    let a = 1;
    let b = 2;
    let c = a /= b;
    document.getElementById("assignmentdivision").innerHTML = a + "/=" + b + "=" + c;
}


function equalsOperators(){
    let firstNum = document.getElementById("num1").value;
    let secondNum = document.getElementById("num2").value;
    document.getElementById("equalsAns")
    .innerHTML = firstNum == secondNum;
}

function notequalsOperators(){
    let thirdNum = document.getElementById("num3").value;
    let forthNum = document.getElementById("num4").value;
    document.getElementById("notequalsAns")
    .innerHTML = thirdNum != forthNum;
}

function lessthanOperators(){
    let fifthNum = document.getElementById("num5").value;
    let sixthNum = document.getElementById("num6").value;
    document.getElementById("lessthanAns")
    .innerHTML = fifthNum <= sixthNum;
}

function greaterthanOperators(){
    let seventhNum;
    let eigthNum;
    if(document.getElementById("r1").checked){
    seventhNum = document.getElementById("r1").value;
    }else if(document.getElementById("r2").checked){
    seventhNum = document.getElementById("r2").value;
    }else if(document.getElementById("r3").checked){
    seventhNum = document.getElementById("r3").value;
    }else if(document.getElementById("r4").checked){
    seventhNum = document.getElementById("r4").value;    
    }else if(document.getElementById("r5").checked){
    seventhNum = document.getElementById("r5").value;
}
    if(document.getElementById("r6").checked){
    eigthNum = document.getElementById("r6").value;
    }else if(document.getElementById("r7").checked){
    eigthNum = document.getElementById("r7").value;
    }else if(document.getElementById("r8").checked){
    eigthNum = document.getElementById("r8").value;
    }else if(document.getElementById("r9").checked){
    eigthNum = document.getElementById("r9").value;    
    }else if(document.getElementById("r10").checked){
    eigthNum = document.getElementById("r10").value;
}


document.getElementById("greaterthanAns").innerHTML = seventhNum >= eigthNum;
}