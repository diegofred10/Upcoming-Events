<script setup>

</script>
<template>
  <div class="card mb" id="mainContainer">
  <div class="row g-0" id="childrenContainer">
    <!-- <div class="col-md" id="containerCheckbox">
        <div class="chekbox">
            <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault"> 
        </div>
    </div> -->
    <div class="col-md" id="imgContainer">
      <img src="../assets/resources/cometcon.svg" alt="Cometcon Image">
    </div>
    <div class="col-md-9">
      <div class="card-body">
        <div class="d-flex" id="titleCard">
        <p class="card-title">Cometcon</p>
        <p id="date">13-05-2023</p>
        </div>
        <p class="card-text">Talleres y cursos online gratuitos sobre empleo, formación y emprendimiento para desempleados, trabajadores en activo, autónomos y empresas.</p>

      </div>
    </div>
    <div class="col-sm-1" id="thirdColumn">
        <div class="card-body" id="btnmaxpeopleContainer">
            <div id="divBtnSign">
                <button class="buttonSign">Sign up</button> 
               
                <!-- para que aparezcan los estilos del boton clickeado = button-click -->
      <!-- <button class="using-button">Using</button> -->
      <!-- <span class="full">FULL</span> -->
            </div>
            <div id="maxPeople">11/30</div>
        </div>
    </div>
  </div>
</div>
</template>
<style scoped>
@import "../assets/css/eventComponent.css";

@media (max-width:768px){
  img{
    width: 35%;
    height: 70%;
  }
  #imgContainer{
    width: 100%;
    height: 50%;
    display: flex;
    justify-content: center;
  }
  #childrenContainer{
    width: 100%;
  }
  #btnmaxpeopleContainer{
    display: flex;
  }
  #date{
    width: auto;
    display: flex;
  }
  #maxPeople{
    margin-left: 15px;
    display: flex;
    align-items: center;
  }
}

</style>
