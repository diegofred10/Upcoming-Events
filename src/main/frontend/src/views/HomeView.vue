<script setup>
import SliderComponent from "../components/SliderComponent.vue";
import EventComponent from "../components/EventComponent.vue";
import Header from "../components/Header.vue";
import PaginationComponent from "../components/PaginationComponent.vue";
import SliderChecking from "../components/SliderChecking.vue";
import { onBeforeMount } from "vue";
import { useEventsStore} from "../stores/EventsStore";
import EventComponent1 from "../components/EventComponent1.vue";


const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>
<template>
  <Header/>
  <SliderChecking/>
<SliderComponent/>
<EventComponent1/>
  <EventComponent1/>
  <PaginationComponent/>  
</template>
<style scoped></style>
