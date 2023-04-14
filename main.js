// codificando relogio analogico and digital

let hrs = document.querySelector('#hrs');
let min = document.querySelector('#min');
let sec = document.querySelector('#sec');

//setando intervalo
setInterval(() => {
  let day = new Date();
  let hh = day.getHours() * 30;
  let mm = day.getMinutes() * 6;
  let ss = day.getSeconds() * 6;
  
  //formatando intervalo
  hrs.style.transform = `rotateZ(${hh+(mm/12)}deg)`;
  min.style.transform = `rotateZ(${mm}deg)`;
  sec.style.transform = `rotateZ(${ss}deg)`;

  //configurando elemnetos pelo id
  let hours =document.getElementById('hours');
  let minutes =document.getElementById('minutes');
  let seconds =document.getElementById('seconds');
  let ampm =document.getElementById('ampm');
  
//configurando nova data
let h = new Date().getHours();
let m = new Date().getMinutes();
let s = new Date().getSeconds();
let am = h>=12 ? "PM" : "AM";

//condição da hora am ou pm
if (h>12){
  h = h - 12;
}
h = (h<10) ? "0" + h : h;
m = (m<10) ? "0" + m : m;
s = (s<10) ? "0" + s : s;

hours.innerHTML = h;
minutes.innerHTML = m;
seconds.innerHTML = s;
ampm.innerHTML = am;
})