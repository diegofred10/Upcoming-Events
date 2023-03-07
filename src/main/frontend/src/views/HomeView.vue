<script setup>
import SliderComponent from "../components/SliderComponent.vue";
import EventComponent from "../components/EventComponent.vue";
import Header from "../components/Header.vue";
import PaginationComponent from "../components/PaginationComponent.vue";
import SliderChecking from "../components/SliderChecking.vue";
</script>
<template>
  <Header/>
  <SliderChecking/>

<SliderComponent/>
  <EventComponent />
  <PaginationComponent/>
  
</template>
<style scoped></style>
