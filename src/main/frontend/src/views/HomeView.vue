<script setup>
import SliderComponent from "../components/SliderComponent.vue";
import EventComponent from "../components/EventComponent.vue";
import Header from "../components/Header.vue";
import PaginationComponent from "../components/PaginationComponent.vue";
import { onBeforeMount } from "vue";
import { useEventsStore } from "../stores/EventsStore";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>
<template>
  <Header />
  <SliderComponent />
  <EventComponent />
  <PaginationComponent />
</template>
<style scoped></style>
