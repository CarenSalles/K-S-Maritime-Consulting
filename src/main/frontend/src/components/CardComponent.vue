<script setup>
const props = defineProps({
    service: {
        type: Object,
        required: true,
    },
});
</script>

<template>
 <div :id="`card-size${service.id}`"  class="card-container">
    <figure>
        <img src="../assets/images/dp-cosole.jpg" alt="DP console Training">
    </figure>
 </div>
 <div class="text-container">
    <h3>{{ service.name }}</h3>
    <p>{{ service.description }}</p>
 </div>

</template>

<style lang="scss" scoped>
.card-container{
    display: flex;
    width: 90%;
    background-color: #feffd7;
    margin-bottom: 2em;

    img{
        width:45%;
        object-fit:cover;
    }
    h3{
        font-weight: bold;
    }

    .text-container{
        display:flex;
        flex-direction:colum;
        justify-content: space-evenly;
        padding:1em;
    }
}
</style>