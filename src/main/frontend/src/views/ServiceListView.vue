<script setup>
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import { service } from "../stores/service.js";
import router from "../router/index";

const serviceItem = service();

function update(service) {
    serviceItem.serviceObject = service;
    router.push("/servicechange");
}

//Api
const repository = new ApiRepository("services");
const api = repository.chooseApi();

const serviceCardxPage = 3;
const start = ref(0);
const end = computed(() =>
    Math.min(start.value + serviceCardxPage, servicesList.value.length)
);

let servicesList = ref([]);
onBeforeMount(async () => {
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

function deletePost(id) {
    if (confirm("Are you sure you want to delete this service?") == true)  {
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
      class="card mb-3"
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

        <div class="gap-3">
          <div class="text-name">
          <p class="font-name" >{{ service.name }}</p>
            
          <p class="font-italic">Service Description: {{ service.description }}</p>

          </div>
          <div class="card-body">
            <p class="btnservice">
              <button
                type="button"
                class="btn btn-danger"
                @click="deletePost(service.id)">DELETE</button>
              <button type="button" class="btn btn-warning" @click="update(service)">EDIT</button>
            </p>
          </div>
        </div>
      </div>
    </div>
 </main>
</template> 

<style lang="scss" scoped>
.row{
  width: 90%;
  margin: auto;
  margin-top: 5vw;
  display: grid;
  grid-template-columns: 2fr 8fr;
}
img {
  aspect-ratio: 16/9;
  object-fit: cover;
  width: 200px;
}
.btn {
  margin: 0.3em;
  width: 5.4em;
}
.card-body{
  display: flex;
  justify-content: end;
  align-items: flex-end;
}
.col-md-1{
  display: flex;
  justify-content: center;
}
.gap-3{
  width: 90%;
  display: flex;
  padding: 0.7rem;
  background-color:  #feffd7;
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
  .btnsUser{
    display: flex;
    justify-content: space-around;
    // width: 100%;
    // justify-content: center;
  }
  .font-name{
    font-size: 1rem;
    
  }
  .gap-3{
    display: block;
    width: 100%;
    margin: auto;
    margin-top: 1rem;
  }
  .card-body{
    display: flex;
    justify-content: center;
    margin-top: 0.7rem;
  }
}
.card{
  background-color:#fffff2;
}
</style>