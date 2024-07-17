function showPic(obj) {
  const source = obj.getAttribute('href');
  const placeholder = document.getElementById('placeholder');
  placeholder.setAttribute('src', source);
  const title = obj.getAttribute('title');
  // document.getElementById('description').innerHTML = title;
  const description = document.getElementById('description');
  
  // if(description.firstChild.nodeType === 3) {
  //   description.firstChild.nodeValue = title;
  // }

  description.insertAdjacentHTML('beforeend', title);       // 기존의 데이터를 추가하는 방법
}

function prepareGallery() {
  const imageGallery = document.getElementById('imagegallery');
  const links = imageGallery.getElementsByTagName('a');

  for(let i = 0; i <links.length; i++) {
    links[i].addEventListener('click', function(e) {
      e.preventDefault();
      showPic(this);
    }, false)
  }
}

window.onload = prepareGallery;