<script setup>
import CardComponent from "../components/CardComponent.vue"
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository";

const repository = new ApiRepository("services");
const api = repository.chooseApi();

const serviceCardxPage = 3;
const start = ref(0);
const end = computed(() => Math.min(start.value + serviceCardxPage, servicesList.value.length));

let servicesList = ref([]);
onBeforeMount(async() => {
    servicesList.value = await api.getAll();
});

const servicesToShow = computed(() => {
    return servicesList.value.slice(start.value, end.value);
});

const next = () => {
    start.value += serviceCardxPage;
};

const prev = () => {
    start.value = Math.max(start.value - serviceCardxPage, 0);
};

const page = (algo) => {
    start.value = algo;
};

</script>

<template>
   <section class="services-view">
        <h1>Our Services</h1>
        <div class="services-container">
            <CardComponent v-for="service in servicesToShow" :key="service.id" :service="service" />
        </div>
   </section>
</template>

<style lang="scss" scoped>
.services-view{
    display: flex;
    flex-direction: column;
    align-items: center;
   

    h1{
        width: 90%;
        margin: 2em;
        font-weight: bold;
    }

    .services-container{
        display: flex;
        flex-direction: column;
        align-items: center;
    }
}
</style>
