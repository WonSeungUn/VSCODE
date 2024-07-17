/**
 * Promise
 */

// const timeoutPromise = new Promise((resolve, reject) => {
//   setTimeout(() => {
//    resolve('완료');
//   }, 2000);
// });

// timeoutPromise.then((res) => {
//   console.log('===then===');
//   console.log(res);
// })

// const getPromise = (seconds) => new Promise((resolve, reject) => {
//   setTimeout(() => {
//     resolve('완료');
//   }, seconds * 1000);
// })

// getPromise(3).then((res) => {
//   console.log('=============then============');
//   console.log(res);
//   return getPromise(3);
// }).then((res) => {
//   console.log('-------------then---------');
//   console.log(res);
// });

// -- reject
// const getPromise = (seconds) => new Promise((resolve, reject) => {
//   setTimeout(() => {
//     reject('에러');
//   }, seconds * 1000);
// });

// getPromise(3).then((res) => {
//   console.log(res);
// }). catch((res) => {
//   console.log('=========catch============');
//   console.log(res);
// }).finally(() => {
//   console.log('=======final------');
// })

// mission> 빌린돈에 대한 원금 + 이자(10%)에 대한 상환금액을 비동기식으로 구현하시오

// const borrow = 20;

// const getBorrowPromise =  new Promise((resolve, reject) => {
//   resolve(borrow * 1.1);
// });

// getBorrowPromise.then(result => {
//   console.log(result + '만원');
// });

// console.log('완료');

const getPromise = (seconds) =>
  new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("완료");
    }, seconds * 1000);
  });

Promise.all([getPromise(1), getPromise(4), getPromise(1)]).then((res) => {
  console.log(res);
});
