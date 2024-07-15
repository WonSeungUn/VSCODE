// 함수의 실행컨텍스트
// Lexical Scope : 선언된 위치가 상위 스코프를 결정하는 방식 => JavaScript
// Dynamic Scope : 실행한 위치가 상위 스코프를 결정하는 방식


// Lexical Scope의 예제
// let var1 = 10;

// function func() {
//   let var2 = 20;
//   console.log(var1);                                    // 10
//   console.log(var2);                                    // 20
// }
// 
// func();



// let value = "value1";

//   function printFunction() {
//     let value = "value2";

//     function printValue() {
//       return value;
//     }

//     console.log(printValue());
//   }

//   printFunction();

// let value = "value1";

//   function printValue() {
//     return value;
//   }

//   function printFunction(func) {
//     let value = "value2";

//     console.log(func());
//   }
//   printFunction(printValue);          // value1


//   console.log('============================================');

//   var numberThree = 3;

//   function functionOne() {
//     var numberThree = 100;
//     functionTwo();
//   }

//   function functionTwo() {
//     console.log(numberThree);
//   }

//   functionOne();                    // 3
//   functionTwo();                    // 3

  // console.log('============================================');

  // var i = 999;
  // for (var i = 0; i < 10; i++) {
  //   console.log(i);                                                          // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
  // }

  // console.log('============================================');
  // console.log(i);                                                            // 10  

  // console.log('============================================');

  // let i = 999;
  // for (let i = 0; i < 10; i++) {                                  
  //   console.log(i);                                                             // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
  // }

  // console.log('============================================');
  // console.log(i);                                                               // 999

  var var3 = 100;

  function func3() {
    var var3 = 200;                                                               // 함수 안에서의 var는 let 과 동일하다.
    console.log(var3);
  }
  func3();                                                                        // 200
  console.log(var3);                                                              // 100

















































































