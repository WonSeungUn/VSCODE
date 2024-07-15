/**
 * 자바스크립트 객체
 * 1. 사용자 정의 객체
 *    1) Object
 *    2) 객체 리터럴
 *    3) 생성자 함수(Prototype)
 * 
 * 2. 내장 객체(Built-in Objects)
 *    1) Core 객체 : string, number, math, array
 *    2) Browser 객체 : window, document, navigator, history
 *    3) DOM(Document Object Model) 객체 : 문서 내 모든 요소 : div, form, p
 */

// 사용자 정의 객체
// 1) Object 객체 이용
//    - 자바스크립트 객체는 동적으로 프로퍼티를 추가/삭제할 수 있다.

// let obj = new Object();
// console.log(obj);

// obj.name = 'kosa';
// obj.age = 30;

// console.log(`이름 : ${obj.name}, age: ${obj.age}`);                                                                                                                      

// // 함수는 1급 객체이다.

// function add(a, b) {
//   let sum = a + b;
//   return sum;
// }

// console.log(typeof add);                                                                           // function
// console.log(add instanceof Object);                                                                // true

// add.result = add(10, 20);
// console.log(`결과 : ${add.result}`);                                                               // 결과 : 30


// // 2) 리터럴 형식으로 객체 사용 => 1개의 객체를 생성하여 사용하는 경우
// let obj2 = {
//   name : '김길동',
//   age : 30,
//   display : function() {
//     console.log(`이름 : ${this.name}, age: ${this.age}`);
//   }

// };

// obj2.display();                                                                                   // 이름 : 김길동, age: 30
// console.log(`나이 : ${obj2.age}`);                                                                // 나이 : 30
// console.log(`나이 : ${obj2['age']}`);                                                             // 나이 : 30

// 퀴즈> 리터럴 형식으로 빈 객체를 생성한 후 동적 프로퍼티와 함수를 추가 후 호출하는 예제를 구현하시오.

let obj3 = {};
obj3.name = 'kosa';
obj3.age = 30;
obj3.display = function() {
  console.log(`이름 : ${this.name}, age: ${this.age}`);
}

obj3['display']();

// 객체 디스트럭처링(distructuring) : 객체의 프로퍼티를 풀어서 별개의 변수에 저장하는 방식
let person = {
  first : 'John',
  last : 'Doe'
};

let { first, last } = person;

console.log(first, last);                                                                    // John Doe

// const 객체 생성
// 1) const로 선언할 경우 객체 자체를 변경할 수 없다.
// 2) 객체 안의 프로퍼티나 메소드는 변경할 수 있다.


const person2 = {
  name : 'kosa',
  age : 30
};
console.log(person2['name'], person2['age']);                                              // kosa 30 

person2.name = 'kim';
person2.age = 35;

const { name, age } = person2;  
console.log(name, age);                                                                    // kim 35













































































































