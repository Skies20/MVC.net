//Connective//

//Statement//

//Symbolic Form//
function negStatement(){
x = 1;
y = 0;
z = x + y;
window.alert('(p ^ ~ q) "I am going to make a juice and I am not going to make a sandwich" is the answer on number ' + z);
}
function conjStatement(){
x = 1;
y = 1;
z = x + y;
    window.alert('(p ^ q) "I am going to make a juice and I am going to make a sandwich" is the answer on number ' + z);
}
function disStatement(){
x = 1;
y = 2;
z = x + y;
    window.alert('(p v q) "I am going to make a juice or I am going to make a sandwich" is the answer on number ' + z);
}
function condStatement(){
x = 2;
y = 2;
z = x + y;
    window.alert('(p → q) "If I am going to make a juice, then I am going to make a sandwich" ' + z);
}
function biStatement(){
x = 2;
y = 3;
z = x + y;
    window.alert('(p ↔ q) "I am going to make a juice if and only if I am going to make a sandwich " ' + z)
}