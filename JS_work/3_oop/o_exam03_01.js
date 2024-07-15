/**
 * Prototype
 */

// __proto__ : 모든 객체에 존재하는 프로퍼티

// const testObj = {};
// // console.log(testObj.__proto__); 

// 생성자 함수
// function IdolModel(name, year) {
//   this.name = name;
//   this.year = year;
// }

// 모든 생성자 함수에는 prototype이 존재한다.
// console.log(IdolModel.prototype);
// console.dir(IdolModel.prototype, {
//   showHidden: true
// });
// console.log(IdolModel.prototype.constructor.prototype === IdolModel.prototype);

// const yujin = new IdolModel('안유진', 2003);

// console.log(yujin.__proto__ === IdolModel.prototype);                                           // true
// console.log(yujin.toString());
// console.log(Object.prototype.toString());

// console.log(testObj.__proto__ === Object.prototype);                                            // true
// console.log(IdolModel.__proto__ === Function.prototype);                                        // true

// console.log(Function.prototype.__proto__ === Object.prototype);                                 // true
// console.log(IdolModel.prototype.__proto__ === Object.prototype);                                // true
// console.log(yujin.__proto__ === IdolModel.prototype);                                           // true
// console.log('===========================');
// console.log(yujin.__proto__ === Object.prototype);                                              // false
// console.log('===========================');
// console.log(yujin.__proto__ === Function.prototype.__proto__);                                  // true
// console.log('===========================');
// console.log(yujin.protype === Object.prototype);                                                // false
// console.log(IdolModel.prototype.__proto__ === Object.prototype);                                // false
// console.log('===========================');

function IdolModel2(name, year) {
  this.name = name;
  this.year = year;
  this.sayHello = function() {
    return `${this.name}이 인사를 합니다.`;
  }
}

const yujin2 = new IdolModel2('안유진', 2003);
const wonYoung2 = new IdolModel2('장원영', 2002);

console.log(yujin2.sayHello());
console.log(wonYoung2.sayHello());

console.log(yujin2.sayHello === wonYoung2.sayHello);

console.log(yujin2.hasOwnProperty('sayHello'));

// console.log('===========================');


// function IdolModel3(name, year) {
//   this.name = name;
//   this.year = year;
// }
// IdolModel3.prototype.sayHello = function() {
//   return `${this.name}이 인사를 합니다.`;
// }

// const yujin3 = new IdolModel3('안유진', 2003);
// const wonYoung3 = new IdolModel3('장원영', 2002);

// console.log(yujin3.sayHello());                                    // yujin3의 proto가 prototype을 참조하기 때문에 호출 가능

// console.log(wonYoung3.sayHello());                                 // wonYoung3의 proto가 prototype을 참조하기 때문에 호출 가능

// console.log(yujin3.sayHello === wonYoung3.sayHello);               // true
// console.log(yujin3.hasOwnProperty('sayHello'));                    // false


