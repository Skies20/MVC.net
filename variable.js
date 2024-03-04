var a = 9;
var b = 13;
var c = b - a;
function autoDeclare(){
x = 12;
y = 89;
z = x + y;
window.alert(z);
}
function varDeclaration(){
    window.alert('the value of c is ' + z);
}
function letDeclaration(){
    let b = 7;
    let c = b * a;
    window.alert('the value of c is ' + c);
}
function constDeclaration(){
    const f = 81;
    const g = 123;
    let h = f + g;
    window.alert('the value of c is ' + h);
}
function caseSensitive(){
    let length = 3;
    let width = 6.5;
    let area = length + width;
    window.alert('the value of c is ' + area)
}
