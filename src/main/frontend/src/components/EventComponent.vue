<script setup>
import PopUpEditForm from './PopUpEditForm.vue';
</script>
<template>
  <div class="event-container">
    <!-- <div class="sidebar-select">
      <input type="checkbox" class="checkbox" name="" id="" />
    </div> -->
    <img id = "imgEvent" src="../assets/resources/cometcon.svg" alt="cometcon logo" class="logo"/>
    <div class="info-container">
      <div class="info-top">
        <h2>Cometcon</h2>
        <span class="info-date" id="dateEvent">20-06-2023</span>
      </div>
      <p class="info-text">
        Talleres y cursos online gratuitos sobre empleo, formación y
        emprendimiento para desempleados, trabajadores en activo, autónomos y
        empresas.
      </p>
    </div>
    <div class="data-container">
      <!-- para que aparezcan los estilos del boton clickeado = button-click -->
      <!-- <button class="button">Sign up</button> -->
      <!-- <button class="using-button">Using</button> -->
      <!-- <span class="full">FULL</span> -->

      <PopUpEditForm/>
      <span id="aforum">11/20</span>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/eventComponent.css";

</style>
