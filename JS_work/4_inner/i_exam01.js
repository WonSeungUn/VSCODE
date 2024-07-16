// /**
//  * Array (배열)
//  */

// let kccMembers = [
//   '진아',
//   '수호',
//   '한희',
//   '채원',
//   '주언',
//   '연호'
// ];

// console.log(kccMembers);                                                    // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// // push() => 배열의 끝에 하나 이상의 요소를 추가하고, 배열의 새로운 길이를 반환함
// // => 배열안의 실제 데이터 값을 변경할 수 있다. (Literable)
// console.log(kccMembers.push('승언'));                                       // 7
// console.log(kccMembers);

// console.log('========================================');

// // pop() =>배열에서 마지막 요소를 제거하고 그 요소를 반환함
// // => 배열안의 실제 데이터 값을 변경할 수 있다. (Literable)
// console.log(kccMembers.pop());                                            // 승언
// console.log(kccMembers);                                                  // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// console.log('========================================');

// // shift() => 배열에서 첫 번째 요소를 제거하고, 제거된 요소를 반환합니다. 이 메서드는 배열의 길이를 변하게 함
// // => 배열안의 실제 데이터 값을 변경할 수 있다. (Literable)
// console.log(kccMembers.shift());                                          // 진아
// console.log(kccMembers);                                                  // ['수호', '한희', '채원', '주언', '연호' ]


// console.log('========================================');

// // unshift() => 새로운 요소를 배열의 맨 앞쪽에 추가하고, 새로운 길이를 반환함
// // => 배열안의 실제 데이터 값을 변경할 수 있다. (Literable)
// console.log(kccMembers.unshift('현민'));                                  // 6
// console.log(kccMembers);                                                 // [ '현민', '수호', '한희', '채원', '주언', '연호' ]


// // console.log('========================================');

// // splice() => 배열의 기존 요소를 삭제 또는 교체하거나 새 요소를 추가하여 배열의 내용을 변경함
// // => 배열안의 실제 데이터 값을 변경할 수 있다. (Literable)
// console.log(kccMembers.splice(0,3));                                     // [ '현민', '수호', '한희' ]
// console.log(kccMembers);                                                 // [ '채원', '주언', '연호' ]





// console.log('========================================');
// console.log('========================================');
// console.log('========================================');

// // 불변성 함수
// kccMembers = [
//   '진아',
//   '수호',
//   '한희',
//   '채원',
//   '주언',
//   '연호'
// ];

// console.log(kccMembers);                                            // [ '진아', '수호', '한희', '채원', '주언', '연호' ]
// console.log("==============================================");

// // concat() => 불변성 함수
// console.log(kccMembers.concat('승우'));                             // ['진아', '수호', '한희', '채원', '주언', '연호', '승우']
// console.log(kccMembers);                                           // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// console.log("==============================================");

// // slice() => 불변성 함수
// console.log(kccMembers.slice(0,4));                                // [ '진아', '수호', '한희', '채원' ]
// console.log(kccMembers);                                           // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// console.log("==============================================");

// // spread operator => 불변성 함수
// // 원래의 kccMembers와는 주소값이 다르다.
// let kccMembers2 = [...kccMembers];
// console.log(kccMembers2);                                          // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// let kccMembers3 = kccMembers;
// console.log(kccMembers3);                                          // [ '진아', '수호', '한희', '채원', '주언', '연호' ]

// console.log(kccMembers3 === kccMembers);                           // true
// console.log(kccMembers2 === kccMembers);                           // false

// let kccMembers4 = ['HONG', 'PARK',...kccMembers, 'JO', 'HAN'];

// console.log(kccMembers4);                                          // ['HONG', 'PARK', '진아', '수호', '환희', '채원', '주언', '연호', 'JO', 'HAN']

// let arr1 = [100, 200, 300];

// function sum(a,b,c) {
//   return a+b+c;
// }

// console.log(sum(...arr1))                                          // 600



// console.log("==============================================");

// // join()  배열의 모든 요소를 쉼표나 지정된 구분 문자열로 구분하여 연결한 새 문자열을 만들어 반환
// console.log(kccMembers.join())                                        // 진아,수호,한희,채원,주언,연호
// console.log(kccMembers.join('/'));                                    // 진아/수호/한희/채원/주언/연호
// console.log(kccMembers.join(', '));                                   // 진아, 수호, 한희, 채원, 주언, 연호

// console.log("==============================================");

// // sort()  배열의 요소를 적절한 위치에 정렬한 후 그 배열을 반환 
// console.log(kccMembers.sort());                                       // [ '수호', '연호', '주언', '진아', '채원', '한희' ]
// console.log(kccMembers.reverse());                                    // [ '한희', '채원', '진아', '주언', '연호', '수호' ]



// let numbers = [1,8,3,2,6];

// function desc(a, b) {
//   return b - a;
// }

// function asc (a,b) {
//   return a-b;
// }

// console.log(numbers.sort(desc));
// console.log(numbers.sort(asc));
// console.log(numbers.sort((a,b) => a > b ? 1 : -1));
// console.log(numbers.sort((a,b) => a > b ? -1 : 1));

const books = [
  {
    name : '이것이 자바다',
    price : 30000,
    publisher : '한빛미디어'
  },
  {
    name : '스프링 정석',
    price : 35000,
    publisher : '길벗'
  },
  {
    name : '도커의 완성',
    price : 20000,
    publisher : '이지스퍼블릭'
  },
]

// 과1> 이름을 기준으로 오름차순하고 전체 출력하세요 (for ~ in, for ~ of)
books.sort((a,b) => a.name > b.name ? 1 : -1);

// forEach
books.forEach((book) => {
  console.log(`책이름 : ${book.name}, 책가격 : ${book.price}, 출판사 : ${book.publisher}`);
});

console.log('=====================================================================================');

// for ~ in
for(let i in books) {
  let book = books[i];
  console.log(`책이름 : ${book.name}, 책가격 : ${book.price}, 출판사 : ${book.publisher}`);
};

console.log('=====================================================================================');

// for ~ of
for(let book of books) {
  console.log(`책이름 : ${book.name}, 책가격 : ${book.price}, 출판사 : ${book.publisher}`);
}

let iveMembers = ['유진','가을','레이','원영','리즈','이서'];

console.log(iveMembers.map((x) => x));
console.log(iveMembers.map((x) => `아이브 : ${x}`));

console.log(iveMembers.map((x)=>{
  if(x==='유진'){
    return `아이브: ${x}`;
  }else{
    return `${x}`;
  }
}))

// filter => 주어진 배열의 일부에 대한 얕은 복사본을 생성하고, 주어진 배열에서 제공된 함수에 의해 구현된 테스트를 통과한 요소로만 필터링
numbers = [1, 8, 7, 4, 9];
console.log(numbers.filter((x) => x%2 === 0));

console.log('======================================================================');

// find  => 제공된 배열에서 제공된 테스트 함수를 만족하는 첫 번째 요소를 반환
console.log(numbers.find((x) => x%2 === 0));

console.log('======================================================================');


// findIndex() => 주어진 판별 함수를 만족하는 배열의 첫 번째 요소에 대한 인덱스를 반환
console.log(numbers.findIndex((x) => x%2 ==0));

console.log('======================================================================');

// reduce() => 배열의 각 요소에 대해 주어진 리듀서 (reducer) 함수를 실행하고, 하나의 결과값을 반환
console.log(numbers.reduce((p,n) =>p + n, 0));

// 퀴즈> iveMembers 변수에 있는 모든 스트링 값들을 더해보자
console.log(iveMembers.reduce((p, n) => p + n.length, 0));























