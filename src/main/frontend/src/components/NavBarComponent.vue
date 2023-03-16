<script>

</script>

<template>
  <header>
    <nav class="navbar navbar-expand-md">
      <div class="container">
        <a>
          <img src="../assets/upcomming-events-logo.png" alt="Upcoming Events Logo"/>
        </a>
      </div>
      <button
      class="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#opciones"
      >
      
    </button>
    <div class="container collapse navbar-collapse">
      <button class="home">
        Home
      </button>
      <button class="myevents">
        My Events
      </button>
      <div class="hi m-4">
        Hi, Username
      </div>
    </div>
  </nav>
</header>
</template>

<RouterLink :to="/home" v-if="!auth.isAtuhenticate">Login</RouterLink>
<RouterLink :to="/about" v-if="{name:'about'}"v-else>about</RouterLink>

<style scoped>
@import "../assets/css/NavBarComponent.css"
</style>