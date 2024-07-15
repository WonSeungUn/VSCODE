/**
 * 인스턴스 __proto__ 변경
 */

function IdolModel(name, year) {
  this.name = name;
  this.year = year;
}

IdolModel.prototype.sayHello = function() {
  return `${this.name}이 인사를 합니다.`;
}

function FemaleIdolModel(name, year) {
  this.name = name;
  this.year = year;

  this.dance = function() {
    return `${this.name}가 춤을 춥니다.`;
  }

}

const gaEul = new IdolModel('가을', 2004);
const ray = new FemaleIdolModel('레이', 2003);

console.log(gaEul.__proto__);                                 // { sayHello : [Function (annoymous)] }
console.log(gaEul.__proto__ === IdolModel.prototype);         // true

console.log(gaEul.sayHello());                                // 가을이 인사를 합니다.
console.log(ray.dance());                                     // 레이가 춤을 춥니다.


Object.setPrototypeOf(ray, IdolModel.prototype);                    // ray의 프로토타입 참조관계를 변경
console.log(ray.sayHello());
console.log(ray.dance());

console.log(ray.constructor === IdolModel);                           // true
console.log(ray.constructor === FemaleIdolModel);                     // false

console.log(gaEul.constructor === IdolModel);                         // true
console.log(FemaleIdolModel.prototype === IdolModel.prototype);       // false

/**
 * 함수의 prototype 변경
 */

FemaleIdolModel.prototype = IdolModel.prototype;
const eSeo = new FemaleIdolModel('이서', 2007);
console.log('===========================');
console.log(Object.getPrototypeOf(eSeo) === FemaleIdolModel.prototype);        // true;   
console.log(Object.getPrototypeOf(eSeo) === IdolModel.prototype);              // true;
console.log(FemaleIdolModel.prototype === IdolModel.prototype);                // true;
console.log(eSeo.sayHello());                                                  // 이서가 인사를 합니다.
console.log(eSeo.dance());                                                     // 이서가 춤을 춥니다.
