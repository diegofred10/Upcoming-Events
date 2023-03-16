<script setup>
import PopUpForm from "./PopUpForm.vue";
import PopUpLogin from "./PopUpLogin.vue";
let userInfo = localStorage.getItem("username")

</script>
<template>
  <header>
    <div class="header-content navbar navbar-expand-sm">
      <div class="col-md-2 p-2">
        <img
          src="../assets/resources/Upcomming-events-logo.png"
          class="img img-fluid"
          alt="Upcoming Events Logo"
          id="logoHeader"
        />
      </div>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#opciones"
      >
        <span class="navbar-toggler-icon" id="pp"></span>
      </button>

      <!-- <div v-if="userInfo==null" class="collapse navbar-collapse justify-content-end" id="opciones">
        <div class="front-page-container" id="login-view">
          <PopUpLogin />
        </div> -->

        <div class="user-view-container" id="user-view">
          <button class="home-button" id="button-on">Home</button>
          <button class="my-events-button" id="button-off">My events</button>
          <p class="hi-user">Hi, {{userInfo}}</p>
        
        </div>

        <!-- <div v-if="userInfo==null" class="admin-view-container" id="admin-view">
          <PopUpForm />
          <p class="hi-user">Hi, {{userInfo}}</p> -->
        <!-- </div> -->
      </div>
    <!-- </div> -->
  </header>
</template>
<style scoped>
@import "../assets/css/NavBarComponent.css";
</style>
