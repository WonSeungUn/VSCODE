// console.log(5 == 5);                     // true
// console.log(5 == '5');                   // true
// console.log(5 === '5');                  // false

// console.log(0 =='')                      // true
// console.log(true == 1)                   // true

// console.log(null == undefined)           // true

// for ~ in VS. for ~ of

// const gilDong = {
//     name: '홍길동', 
//     year : 2000,
//     company : 'KCC'
// };

// for ~ in => key

// for(let key in gilDong) {
//     console.log(key);                       // name, year, company
//     console.log(gilDong[key]);              //  홍길동, 2000, KCC
// };

const kccMember = ['노승우', '김상학', '황철원', '송예림'];
// console.log('============================================');

// for(let key in kccMember) {
//   console.log(key);                           // 0, 1, 2, 3
//   console.log(`${key} : ${kccMember[key]}`);  // 0 : 노승우, 1: 김상학, 2: 황철원, 3: 송예림
// };

console.log('============================================');

// for ~ of => value

for(let value of kccMember) {
    console.log(value);
};

console.log('Cat' || 'Dog');                  // Cat

let event = '';

event =  event || '영화보기';                   
console.log(event);                           // 영화보기

// 놀기가 나온다.
if(event) {
  console.log('놀기');
} else {
  console.log('일하러 가기');
}