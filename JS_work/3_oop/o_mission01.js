/**
 * 과1  1. Rectangle 생성자 함수를 클래스 기반으로 수정
 *      2. 상속을 이용해서 Square 구현해보기.
*/

// function Rectangle(width, height) {
//   this.width = width;
//   this.height = height;
//   this.getArea = function() {
//     return this.width * this.height;
//   }
// }

class Rectangle {
  width;
  height;

  constructor(width, height) {
    this.width = width;
    this.height = height;
  }

  getArea() {
    return this.width * this.height;
  }

}

class Square extends Rectangle {

  // constructor(width, height) {
  //   super(width, height);
  // }

  constructor(length) {
    super(length, length);
  }

  // getArea() {
  //   if(this.width === this.height) {
  //     return `${super.getArea()}`;
  //   } else {
  //     return `정사각형은 가로 세로 같아야 합니다.`
  //   }
  // }
}

const rectangle = new Rectangle(3,4);

// console.log(rectangle.getArea());

// // const square = new Square(4,4);
// const square = new Square(4);
// console.log(square.getArea());

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