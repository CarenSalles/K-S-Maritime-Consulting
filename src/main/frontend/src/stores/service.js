import { ref } from "vue";
import { defineStore } from "pinia";

export const useServiceStore = defineStore("auth", () => {
  const serviceObject = ref([]);
  const serviceToEdit = ref({});

  function saveServices(services) {
    serviceObject.value = services;
  }

  function saveServiceToEdit(service) {
    serviceToEdit.value = service;
  }

  return { serviceObject, saveServices, serviceToEdit, saveServiceToEdit };
});
