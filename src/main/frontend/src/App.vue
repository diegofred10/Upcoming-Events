<script setup>

import { RouterLink, RouterView } from "vue-router";
import  Header  from './views/Header.vue';
</script>

<template>
  
    <RouterLink to="/">Home</RouterLink>
    <RouterLink to="/about">About</RouterLink>

  <RouterView />
<Footer></Footer>

<Header></Header>
<Footer></Footer>
</template>

<style>
@import "./assets/css/default.css";
</style>
