// 함수를 호출할 때 함수의 파라미터 개수가 일치하지 않아도 오류가 생기지 않는다.
// 함수에 정의된 파라미터 개수만큼 출력된다.

function add(a, b, c) {
  console.log(a, b, c);
}

add(10, 20, 30, 40);                                                            // 10, 20, 30    

function sumAll() {
  let sum = 0;
  for (let i = 0 ; i < arguments.length; i++) {
    sum += arguments[i];
  }
  
  return sum;
}

console.log(sumAll(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));                    // 550

// 함수 파라미터 기본값 설정

function calculater(total, tax=0.1, tip=0.2) {
  return total + (total * tax) + (total * tip);
}

console.log(calculater(100,0.1,0.1));                                                      // 120
console.log(calculater(100));                                                              // 130


// arrow function || 화살표 함수(함수형 프로그래밍)

var greeting = function(name) {
  return "Hello, " + name;
}

console.log(greeting("Lee"));

var greeting2 = (name) => {
  return `Hello, ${name}`;
};

var greeting3 = name => `Hello, ${name}`;

console.log(greeting2("Kim"));

function multiply(a) {
  return function(b) {
    return function(c) {
      return `x: ${a}, y: ${b}, z: ${c}`;
    }
  }
}

console.log(multiply(2)(3)(4));                                                       // x: 2, y: 3, z: 4

const multiply2 = (a) => (b) => (c) => `x: ${a}, y: ${b}, z: ${c}`;

console.log(multiply2(2)(3)(4));                                                      // x: 2, y: 3, z: 4
 























