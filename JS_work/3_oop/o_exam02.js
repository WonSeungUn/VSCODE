/**
 * 생성자 함수를 이용한 객체 생성 => 다수의 객체를 생성하기 위해서 사용한다.
 * 
 */

// function Student(name, kor, eng, mat) {
//   this.name = name;
//   this.kor = kor;
//   this.eng = eng;
//   this.mat = mat;

//   this.getSum = function() {
//     return this.kor + this.eng + this.mat;
//   };

//   this.getAverage = function() {
//     return this.getSum() / 3;
//   };

//   this.toString = function() {
//     return `이름 : ${this.name} \t 총점 : ${this.getSum()} \t 평균 : ${this.getAverage()}`;
//   }
// };

// let students = [];

// students.push(new Student("Lee", 90, 85, 95));
// students.push(new Student("Kim", 80, 90, 75));

// for(let i in students) {
//   console.log(students[i].toString());
// }

// for(let student of students) {
//   console.log(student.toString());
// }

console.log('============================================');

// 퀴즈> Rectangle 생성자 함수를 만들고 사각형 넓이를 구해보자
//      (width, height, getArea())


// function Rectangle(width, height) {
//   this.width = width;
//   this.height = height;
//   this.getArea = function() {
//     return this.width * this.height;
//   }
//   // this.toString = function() {
//   //   return `가로 : ${this.width}, 세로 : ${this.height}, 넓이 : ${this.getArea()}`;
//   // }
//   this.toString = () => `가로 : ${this.width}, 세로 : ${this.height}, 넓이 : ${this.getArea()}`;
//   // this.toString = () => '가로 : ' + this.width + ', 세로 :'+ this.height + '넓이 :'+ this.getArea();
// }

// let rectangles = [];
// rectangles.push(new Rectangle(5, 10));
// rectangles.push(new Rectangle(10, 10));
// rectangles.push(new Rectangle(10, 20));

// for(let i in rectangles) {
//   console.log(rectangles[i].toString());
// };


function Student(name, kor, eng, mat) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.mat = mat;

    Student.prototype.getSum = function() {
      return this.kor + this.eng + this.mat;
    };
  
    Student.prototype.getAverage = function() {
      return this.getSum() / 3;
    };
  
    Student.prototype.toString = function() {
      return `이름 : ${this.name} \t 총점 : ${this.getSum()} \t 평균 : ${this.getAverage()}`;
    }
};

  let students = [];
  students.push(new Student("Lee", 90, 85, 95));
  students.push(new Student("Kim", 20, 55, 45));

  for(let i in students) {
    console.log(students[i].toString());
  }
  
  console.log(students[0].hasOwnProperty('toString'));  
  // Student2.prototype = {
  //   getSum : function() {
  //     return this.kor + this.eng + this.mat;
  //   },
  //   getAverage : function() {
  //     return this.getSum() / 3;
  //   },
  //   toString : function() {
  //     return `이름 : ${this.name} \t 총점 : ${this.getSum()} \t 평균 : ${this.getAverage()}`;
  //   }
  // } 