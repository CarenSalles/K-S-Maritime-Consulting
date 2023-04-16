<script setup>
import { RouterView } from "vue-router";
import NavbarComponent from "./components/NavbarComponent.vue";
import FooterComponent from "./components/FooterComponent.vue";
import LoginComponent from "./components/LoginComponent.vue";
</script>

<template>
  <NavbarComponent />
  <RouterView />
  <FooterComponent />
  
</template>

<style scoped>

</style>
