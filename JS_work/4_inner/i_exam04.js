/**
 * 정규표현식(regExp)
 * 
 */

// // 1. 문자열.match(정규표현식) => 매칭된 결과(문자열) 리턴
// const result = 'sports'.match(/sp/);
// console.log(result);                // [ 'sp', index: 0, input: 'sports', groups: undefined ]

// // 2. regExp.exec('문자열') => 매칭된 결과(문자열) 리턴
// const str = 'dsadbjkaskfjaks dosajdais kodensjs';
// const reg = /JS/ig;                                     // i : 소대문자 구분없이, g: 전역 검사
// let r = reg.exec(str);

// while(r) {
//   console.log(r);
//   r = reg.exec(str);
// }


// // 퀴즈 => July 16 2024
// const str = 'This is a date : July 16 2024';
// const reg = /\w*\s\d+\s\d+/;
// const result = str.match(reg);
// console.log(result);


// // 퀴즈 > 문자열.replace()를 사용해서 SW를 소프트웨어로 변경
// const str = '오늘 우리는 sw 세상에서 살고 있다. SW가 매우 중요한 시기이다. 그래서 SW를 열심히 공부하자.';
// const reg = /SW+/ig;
// const result = str.replace(reg, '소프트웨어');
// console.log(result);


// const str = 'Java--JavaScript';
// const reg = /(\w+)-*(\w+)/;
// const result = str.replace(reg, "$2-$1");
// console.log(result);

// 이메일 체크
// 정규표현식.test(문자열) => 해당 문자열이 정규표현식에 매칭 유무 (true OR false) 리턴
// 정상 : dolsam77@nate.com
// 비정상 : 33dolsam@nate.com
// 비정상 : dolsamnate.com
// 비정상 : 33dolsam@nate.comdasdadsal;

const email = 'dolsam33@nate.com';
const reg = /^\D+\w+@+\w+.+com$/;
console.log(reg.test(email));