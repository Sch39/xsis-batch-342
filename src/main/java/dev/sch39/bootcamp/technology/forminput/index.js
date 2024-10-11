submitButton.addEventListener('click', (e)=>{
  e.preventDefault();
  let data = new FormData();
  let state = document.getElementById('marriageState');
  data.append('state', state.value);
  let gender = document.getElementsByName("gender");
  let hobies = document.getElementsByName('hoby');
  let hobiesArr = [];
  hobies.forEach((v,k)=>{
    if (v.checked) {
      hobiesArr.push(v.value);
    }
  });

  gender.forEach((v,k) => {
    if (v.checked) {
      data.append('gender', v.value);
    }
  });
  data.append('hobies', hobiesArr);
  data.append('name', document.getElementById('name').value);
  data.append('birth_place', birthplace.value);
  data.append('bod', bod.value);
  data.append('about_me', aboutMe.value);

  modalDialog.showModal();
  let biodataModal = document.getElementById('biodata');
  biodataModal.innerHTML = "";
  data.forEach((v, k)=>{
    console.log(`key: ${k}, value: ${v}`);
    const p = document.createElement('p');
    p.innerText = `${k} = ${v}`;
    biodataModal?.appendChild(p);
  });
});


