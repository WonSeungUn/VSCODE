//변수 선언, 사용
// var num = 100;
// num = '안녕';
// console.log(num);

// var fun = function() {
//   alert('a');
// }

// 컴파일 언어 : 데이터형, 문법 => 엄격히 요구
//인터프리터 언어 : 문법적으로 느슨한거 요구 (한줄씩 내려가면서 실행, 데이터를 넣기 전까지는 데이터 타입이 없음)

//var : 여러 큰 스코프에서 공유하기 위한 최상위 변수 사용 
//let : 작은 스코프에서 로컬변수 사용
//const : 상수값으로 사용

// const a = 10;
// a = '안녕';
// console.log(a);

//데이터 타입(자료형) => 자료형 알고 싶을 때  typeof

// let intNum = 10;
// let floatNum = 3.14;

// console.log(typeof intNum);
// console.log(typeof floatNum);

// // 문자형(string)
// let sinS = 'single';
// let doubleS = "double";

// console.log(typeof sinS);
// console.log(typeof doubleS);

/**
 * Template Literal 
 * 1. newline -> \n
 * 2. tab -> \t
 * 3. back슬래시 문자열 안에 표현 -> \\
 * 
 */

// const kcc ='김진아\n이수호';
// console.log(kcc);

// const kcc = '김진아\\이수호';
// console.log(kcc);

const kcc = `김진아\ ^^V "a" `;
console.log(kcc);


const groupName ='kcc';
// console.log(groupName + '이수호');
console.log(`${groupName} 이한희`);

// 논리형(boolean)
/**
 * false 
 * => String : 빈문자열
 * => 값이 없는 경우 : undefined , null
 * => 0
 */
let boolVar = true;
console.log(typeof boolVar);          // false
console.log(!!false);                 // false
console.log(!!'');                    // false
console.log(!!0);                     // false
console.log(!!null);                  // false
console.log(!!undefined);             // false
console.log(!!{});                    // true
console.log(!![]);                    // true


// undefined
let emptyVar;
console.log(typeof emptyVar);         // undefined

// null
let nullVar = null;
console.log(typeof nullVar);          // Object


// 함수(function)
// let fun = function(){};
// console.log(typeof fun);              // function


// 객체(object)
let person = {
  name : '홍길동',
  age : 20
};
console.log(typeof person);           // Object
console.log(person.name);             // 홍길동
console.log(person['age']);           // 20


const kccMember = [
  "김현민",
  "이수호",
  "안재호",
  "윤채원",
  "원승언"
];

console.log(typeof kccMember);        // object
console.log(kccMember);               // ['김현민', '이수호', '안재호', '윤채원', '원승언']

/**
 * Symbol타입
 * - 유일무이한 값을 생성할 때 사용
 */

const test1 = '1';
const test2 = '1';

console.log(test1 === test2);         // true

const symbol1 = Symbol('1');
const symbol2 = Symbol('1');

console.log(symbol1 === symbol2);     // false

const symbol3 = Symbol('1');
console.log(symbol3 === symbol1);
