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
  data.append('skills', skillArr);

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

let skillArr = [];
const watchedSkills = new Proxy(
  skillArr,
  {
    set(target, property, value, receiver){
      target[property] = value;
      renderSkillBadge(target);
      return true;
    },
    deleteProperty(target, property){
      delete target[property];

      renderSkillBadge(target);
      return true;
    },
  }
)

document.getElementById('inputSkill')
.addEventListener('input', (e)=>{
  if (e.target.value.includes(",")) {
    const commaIndex = e.target.value.indexOf(",");
    const skillVal = e.target.value.substring(0, commaIndex);
    if (!skillArr.includes(skillVal)) {
      watchedSkills.push(skillVal);
      e.target.value='';
    }
  }
});

const renderSkillBadge = (arr)=>{
  const container = document.getElementById('skillBadge');
  container.innerHTML='';
  
  arr.forEach((item, index) => {
    const badge = document.createElement('div');
    badge.classList.add('badge'); 
    badge.textContent = item;

    const closeBtn = document.createElement('span');
    closeBtn.classList.add('close-btn'); 
    closeBtn.textContent = '✕';

    closeBtn.addEventListener('click', () => {
     delete watchedSkills[index];
    });

    badge.appendChild(closeBtn);

    container.appendChild(badge);
  });
}