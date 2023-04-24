<script setup>
const props = defineProps({
  service: {
    type: Object,
    required: true,
  },
});
</script>

<template>
  <div :id="`card-size${service.id}`" class="card-container">
    <img src="../assets/images/dp-cosole.jpg" alt="DP console Training" />
    <div class="text-container">
      <h3>{{ service.name }}</h3>
      <p>{{ service.description }}</p>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.card-container {
  display: flex;
  width: 90%;
  background-color: #ffffff;
  margin-bottom: 2em;
  border-radius: 1em;

  img {
    width: 45%;
    object-fit: cover;
  }
  h3 {
    font-weight: bold;
    font-size: 2em;
    color: #cc0033;
  }

  .text-container {
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;
    padding: 1em;
    flex-wrap: wrap;
    max-width: 35em;
  }
}

@media (max-width: 768px) {
  .card-container {
    h3 {
      font-size: 1.5em;
    }
  }
}
</style>
