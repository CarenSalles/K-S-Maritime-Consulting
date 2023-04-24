<script setup>
import ServiceFormComponent from '../components/ServiceFormComponent.vue';

</script>

<template>
     <div class="view-container">
        <ServiceFormComponent />

     </div>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";
.view-container{

background-color:$background-body;
height: 60vh;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;
background-repeat: no-repeat;
background-size:cover;
}
</style>