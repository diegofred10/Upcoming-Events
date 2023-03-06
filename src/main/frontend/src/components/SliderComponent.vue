<script setup></script>
<template>
  <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active d-flex justify-content-center" id="sideOne">
      <img src="../assets/resources/talleresempleabilidad.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/cometcon.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/talleresempleabilidad.svg" class="d-block" alt="...">
      <img src="../assets/resources/example.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/cometcon.svg" class="img-fluid d-block" alt="...">
    </div>
    <div class="carousel-item d-flex justify-content-center" id="sideTwo">
      <img src="../assets/resources/cometcon.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/cometcon.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/talleresempleabilidad.svg" class="d-block" alt="...">
      <img src="../assets/resources/example.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/talleresempleabilidad.svg" class="d-block" alt="...">
    </div>
    <div class="carousel-item d-flex justify-content-center" id="sideThree">
      <img src="../assets/resources/talleresempleabilidad.svg" class="d-block" alt="...">
      <img src="../assets/resources/example.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/cometcon.svg" class="img-fluid d-block" alt="...">
      <img src="../assets/resources/talleresempleabilidad.svg" class="d-block" alt="...">
      <img src="../assets/resources/example.svg" class="img-fluid d-block" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
<p class="sidebar-text">SideBar</p>
</template>
<style scoped>
.sidebar-text{
  color: #eaeaea;
  margin-left: 20px;
}

#sideOne, #sideTwo, #sideThree {
height: 10em;
}

</style>
