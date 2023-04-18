import { ref } from 'vue'
import { defineStore } from 'pinia'

export const service = defineStore ('auth', () => {
  const serviceObject = ref([]);
  return serviceObject
})

