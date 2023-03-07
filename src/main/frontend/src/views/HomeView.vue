<script setup>
import SliderComponent from "../components/SliderComponent.vue";
import EventComponent from "../components/EventComponent.vue";
import Header from "../components/Header.vue";
import PaginationComponent from "../components/PaginationComponent.vue";
<<<<<<< HEAD
import { onBeforeMount } from "vue";
import { useEventsStore } from "../stores/EventsStore";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
=======
import SliderChecking from "../components/SliderChecking.vue";
>>>>>>> b238b7cdc8bb23778ba3f565cac42423cc5a3645
</script>
<template>
  <Header/>
  <SliderChecking/>

<SliderComponent/>
  <EventComponent />
  <PaginationComponent/>
  
</template>
<style scoped></style>
