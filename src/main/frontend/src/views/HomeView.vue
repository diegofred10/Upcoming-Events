<script setup>
import SliderComponent from "../components/SliderComponent.vue";
import Header from "../components/Header.vue";
import PaginationComponent from "../components/PaginationComponent.vue";
import SliderChecking from "../components/SliderChecking.vue";
import { onBeforeMount } from "vue";
import { useEventsStore } from "../stores/EventsStore";
import EventComponent from "../components/EventComponent.vue";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>
<template>
  <Header />
  <SliderChecking />
  <SliderComponent />
  <div v-for="event in store.Events" :key="event">
    <EventComponent
      :available="event.available"
      :date="event.date"
      :description="event.description"
      :id="event.id"
      :image="event.image"
      :max_users="event.max_users"
      :signed_users="event.signed_users"
      :title="event.title"
    />
  </div>
  <PaginationComponent />
</template>
<style scoped></style>
