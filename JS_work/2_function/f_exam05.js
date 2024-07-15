// let replyService = (function() {

//   function create() {
//     console.log('create');
//   }
  
//   function update() {
//     console.log('update');
//   }

//   function getList(params, callback) {
//     let data = '결과값: ' + params;
//     if(typeof callback === 'function') {
//       callback(data);
//     }
//   }

//   return {
//     create: create,
//     update: update,
//     getList: getList
//   };

// })();


// function show() {
//   // replyService['create']();
//   // replyService.create();
//   replyService.getList('kosa', function(result) {
//     console.log('내가 원하는 형태의 출력: ' + result);
//   });
// };

// show();

function orderService(item, price, quantity, callback) {
  console.log('커피 주문');
  // 주문 관련 서비스 구현
  
  let result = price * quantity;
  callback(result);
  
};

function order() {
  orderService('커피', 1000, 2, function(result) {
    console.log('가격: ' + result + '원');
  })
}

order();                