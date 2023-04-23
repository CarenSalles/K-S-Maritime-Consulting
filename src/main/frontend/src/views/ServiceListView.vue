<script setup>
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import { useServiceStore } from "../stores/service.js";
import router from "../router/index";

const serviceStore = useServiceStore();

//Api
const repository = new ApiRepository("services");
const api = repository.chooseApi();

const serviceCardxPage = 6;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + serviceCardxPage, servicesList.value.length)
);

let servicesList = ref([]);

onBeforeMount(async () => {
  servicesList.value = await api.getAll();
  serviceStore.saveServices(servicesList.value);
});

function update(service) {
  serviceStore.saveServiceToEdit(service);
  router.push({ name: "servicechange", params: { id: service.id } });
}

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

function deletePost(id) {
  if (confirm("Are you sure you want to delete this service?") == true) {
    fetch(`http://localhost:8080/api/services/${id}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
    });
    alert("Delete successfull");
    location.reload();
  }
}
</script>

<template>
  <main>
    <div
      class="card mb-5"
      v-for="service in servicesToShow"
      :key="service.id"
      :member="service"
    >
      <div class="row g-0">
        <div>
          <img
            src="../assets/images/cbo-bossanova-capa.png"
            class="img-fluid"
            alt="..."
          />
        </div>

        <div class="gap-5">
          <div class="text-name">
            <p class="font-name">Service Title: <span>{{ service.name }}</span></p>

            <p class="font-italic">
              {{ service.description }}
            </p>
          </div>
          <div class="card-body">
            <button
              type="button"
              class="btn btn-danger"
              @click="deletePost(service.id)"
            >
              DELETE
            </button>
            <button
              type="button"
              class="btn btn-warning"
              @click="update(service)"
            >
              EDIT
            </button>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<style lang="scss" scoped>
.card {
  width: 90%;
  height: 50vh;
  margin-left: 10vh;
  margin-top: 6vh;

  .row {
    width: 90%;
    margin: auto;
    margin-top: 5vw;
    display: grid;
    grid-template-columns: 2fr 8fr;
  }
  img {
    aspect-ratio: 16/9;
    object-fit: fill;
    width: 100%;
    height: 30vh;
  }
  .btn {
    margin: 0.3em;
    width: 5.4em;
  }
  .card-body {
    display: flex;
    justify-content: end;
    align-items: flex-end;
  }
  .col-md-1 {
    display: flex;
    justify-content: center;
  }
  .font-name {
    font-weight: bold;
    font-size: 3vh;
    span{
      color: #cc0033;
    }
  }

  .font-italic {
    font-weight: bold;
    font-size: 3vh;
  
    
    
  }
  .gap-5 {
    width: 100%;
    display: flex;
    padding: 0.7rem;
    background-color: rgb(211, 211, 214);
    color: rgb(17, 17, 63);
    max-height: 30vh;

    .text-name{
      padding-top: 6vh;
    }
  }
}

@media (max-width: 767px) {
  .row {
    grid-template-columns: 1fr;
  }
  img {
    width: 100%;
    margin-top: 5vw;
    aspect-ratio: 16/9;
    object-fit: cover;
  }
  .btnsUser {
    display: flex;
    justify-content: space-around;
    // width: 100%;
    // justify-content: center;
  }
  .font-name {
    font-size: 1rem;
  }
  .gap-5 {
    display: block;
    width: 100%;
    margin: auto;
    margin: 1rem;
  }
  .card-body {
    display: flex;
    justify-content: center;
    margin-top: 0.7rem;
  }
}
.card {
  background-color: #fffff2;
}
</style>
