/**
 * 타입변환(형변환)
 * 1) 명시적
 * 2) 묵시적(암묵적)
 */

// // 명시적
// let age = 20;
// let stringAge = age.toString();
// console.log(typeof stringAge);       // string

// // 암묵적
// let test1 = age + '';
// console.log(typeof test1);           // string

// console.log('100' + '2');             // 1002
// console.log('100' * '2')             // 200
// console.log('100' - '2')             // 98


// 문자열 -> number : eval(), Number(), parseInt(), parseFloat()
let num = '100';
num = eval(num);
let result = num + 100;
console.log(result);                    // 200

let num1 = '100';
num1= Number(num1);
let result1 = num1 + 100;
console.log(result1);                    // 200

let num2 = '100';
num2 = parseInt(num2);                  // 자기가 변환할 수 있는 것만 변환한다.
let result2 = num2 + 100;
console.log(result2);                    // 200

/**
 * JS에서 나올 수 있는 면접 문제
 * Hoisting
 * - 모든 변수 선언문이 코드의 최상단으로 이동되는 것처럼 느껴지는 현상 
 */

console.log('================================================');
// var name;
// console.log(name);                      // undefined
// name ='홍길동';
// console.log(name);                      // 홍길동

// console.log(kim);                       // ReferenceError: Cannot access 'kim' before initialization : 초기화는 안됐을 뿐 HOisting이 발생
// let kim ='김씨';