// import { ref } from "vue";
// import { defineStore } from "pinia";
// const url = "http://localhost:8080/api/events";

// // export const useEventsStore = defineStore("events", () => {
// //   const events = ref([]);
// //   async function fetchEvents() {
// //     await fetch(url);
// //     const responseJson = await response.json();
// //     this.events = responseJson;
// //   }

// //   return { events, fetchEvents };
// // });

// export const useEventsStore = defineStore({
//   id: "events",
//   state: () => ({
//     events: [],
//   }),
//   actions: {
//     async fetchEvents() {
//       const response = await fetch(url);
//       const data = await response.json();
//       console.log(data);
//       this.events = data;
//     },
//   },
// });
import { defineStore } from "pinia";

export const useEventsStore = defineStore({
  id: "Events", 
  state: () => ({
    Events: [],
  }),
  actions: {
    async fetchEvents() {
      const response = await fetch("http://localhost:8080/api/events");
      const responseJson = await response.json();
      this.Events = responseJson;
      console.log(this.Events);
    },
  },
});