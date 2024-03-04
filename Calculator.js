var num1, num2answer;//numbers
var operator;//String
var decimalUsed = false;//if the decimal is already used

function insert (num){
    if(num=='.')
        if(decimalUsed){
    }else{
        document.input.numview.value=document.input.numview.value + num;
        decimalUsed=true;
    }else{
        document.input.numview.value=document.input.numview.value + num;
    }
}

function backspace(){
    var numero = document.input.numview.value;
    document.input.numview.value = numero.substring(0,numero.length -1);
    var numero2 = document.input.numview.value;
    var numPoint = 0;
    var char = "";
    for(let i = 0; i <numero2.length;i++){
        char = numero.substring(i,i + 1);
        if(char=='.'){
            numPoint = 1;
        }
    }
}
if(numPoint>0){
    decimalUsed=true;
}else{
    decimalUsed=false;
}

function keypress(op){
    operator = op;
    num1 = Number(document.input.numview.value);
    input.numview.value-='';
    decimalUsed=false;
}

function equals(){
    num2 = Number(document.input.numview.value);
    switch(operator){
        case "+":
            answer = num1 + num2;break;
        case "-":
            answer = num1 - num2;break;
        case "*":
            answer = num1 * num2;break;
        case "/":
            answer = num1 / num2;break;
    }
    document.input.numview.value = answer;
    decimalUsed=false;
}