// console.log(add(10, 20));                       // 30
// console.log(add2(100, 200));                    // 300


// // 선언적 함수  -> 미리 메모리에 저장되어 먼저 실행된다.
// function add(a, b) {
//   let sum = a + b;
//   return sum;
// }

// // 익명 함수 -> 변수 안에 함수가 들어가 있으므로 먼저 실행되지 않는다. 익명함수를 선언한 위치의 위에서는 함수를 선언할 수 없다. 
// let add2 = function(a, b) {                     // 변수 안에 함수가 들어갈 수 있다.
//   let sum = a + b;
//   return sum;
// };

// // add2  VS  add2()
// let plus = add2;                                                      // 함수의 주소값  => plus가 add2 함수를 사용
// let plus2 = add2(20, 30);                                             // 함수 호출 -> 리턴값을  plus2에게 전달

// console.log(plus);                                                    // add2의 메모리 주소값을 출력 [Function: add2]
// console.log(plus(20,30));                                             // 50
// console.log(plus2);                                                   // 50

// console.log('============================================');

// // 함수의 매개변수(파라미터)에 함수를 전달할 수 있다. (callback function)
// let foo = function(func) {                                            // func : callback function
//   if(typeof func === 'function') {
//     func();
//   }
// };

// foo(function() {                      
//   console.log('파라미터에 함수를 전달하는 예제');  
// });

// // 함수가 함수를 리턴할 수 있다.
// // 함수를 리턴하는 예제와 함께 리턴된 함수를 호출해보자

// let foo2 = function() {
//   return function() {
//     console.log('함수를 리턴하는 예제');
//   }
// }

// let box = foo2();

// box();

// // 함수의 파라미터에(plus or minus) 호출
// // plus => plus기능을 하는 함수를 리턴
// // minus => minus기능을 하는 함수를 리턴
// // 리턴 받은 해당 함수를 호출해서 사용

// function call(mode) {
//   let obj = {
//     'plus' : function(left, right) {
//       return left + right;
//     },
//     'minus' : function(left, right) {
//       return left - right;
//     }
//   };

//   return obj[mode];
// }

// let func2 = call('plus');
// let func3 = call('minus');

// console.log(func2(10, 20));
// console.log(func3(10, 20));


// // 콜백 함수(함수의 파라미터로 전달되는 함수)
// function sortDescending(a, b) {
//   return b - a;
//   // if(a > b) {
//   //   return -1;
//   // } else if {
//   //   return 1;
//   // } else {
//   //   return 0;
//   // }
// }

// let arr = [94, 2, 45, 21, 33];
// console.log(arr.sort(sortDescending));                  // [2, 21, 33, 45, 94]

// 즉시실행함수 : 함수의 정의와 동시에 호출
// (function(a,b) {
//   console.log(a+b);
// })(10,5);


//  mission 01. 정수 n이 매개변수로 주어질 때 각 자리 숫자의 합을 return하도록 solution 함수를 완성하시오.

function solution(arr) {
  let str = arr + '';

  let sum = 0;
  for (let i = 0 ; i < str.length; i++) {
    sum += parseInt(str[i]);
  }
  return sum;
}

console.log(solution(29999034));





























