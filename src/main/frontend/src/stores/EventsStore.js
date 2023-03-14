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