/**
 * 함수 클로저
 * => 함수 호출 이후에도 함수의 실행컨택스트 영역을 계속 유지하는 것
 */

// function outerFunc(){
//   let x = 10;
//   var innerFunc = function(){
//     console.log(x);
//   }

//   return innerFunc;
// }

// let inner = outerFunc();

// inner(); // 10


// // 데이터 캐싱
// function casheFunction(newNumber) {
//   // 아주 오래 소요되는 작업
//   var number = 10 * 10;
  
//   return number * newNumber;
// }

// console.log(casheFunction(10)); 
// console.log(casheFunction(20)); 


// console.log('============================================');

// function casheFunction2() {
//   // 아주 오래 소요되는 작업
//   var number = 10 * 10;

//   function innerCasheFunction(newNumber) {
//     return number * newNumber;
//   }

//   return innerCasheFunction;
// }

// const runner = casheFunction2();

// console.log(runner(10));
// console.log(runner(20));
// console.log(runner(30));
// console.log(runner(40));



  function outer(arg1, arg2) {
    let num1 = arg1;
    let num2 = arg2;

    function inner(num3) {
      console.log((num1 + num2) / num3);

    }
    return inner;
  }

  let inner2 = outer(16, 14);
  inner2(2);                      // 15
  outer(16, 14)(2);               // 15