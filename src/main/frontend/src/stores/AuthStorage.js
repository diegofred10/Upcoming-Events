import { reactive, ref } from "vue";
import { defineStore } from "pinia";

export const useAuthStore = defineStore ('auth', ()=>{
    const isAuthenticate = ref(false);
    const username = ref("");
    const roles = ref([])

    return {isAuthenticate,username,roles};
}) 