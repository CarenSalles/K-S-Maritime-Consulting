<script setup>
import { useRouter } from "vue-router";
import { useServiceStore } from "../stores/service.js";
import { onMounted, reactive, ref, watch } from "vue";

const router = useRouter();
const serviceStore = useServiceStore();
let serviceToEdit = ref({});

onMounted(() => {
  serviceToEdit.value = serviceStore.serviceToEdit;
});


async function update() {
  if (serviceToEdit.name === "") {
    alert("You need to add a name");
    return;
  }

  if (serviceToEdit.description === "") {
    alert("You need to add a description");
    return;
  }

  const payload = JSON.stringify(serviceToEdit.value);
  const url = `http://localhost:8080/api/services/${serviceToEdit.value.id}`;
  const response = fetch(url, {
    method: "PUT",
    body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
  })
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      // if (data.service != "") {
      //   serviceToModify.serviceObject = service;
      //   alert(data.service + "Updated successfully.");
      // } else {
      //   alert("An error has occurred. \nPlease try again later.");
      // }
    });
}
</script>

<template>
  <form>
    <div class="container mt-2">
      <div class="col-12 col-md-8">
        <h2 class="mt-2">
          Change Service {{ serviceToEdit.name }} with id:
          {{ serviceToEdit.id }}
        </h2>
        <div class="mb-3">
          <label for="name" class="form-label">Service Title:</label>
          <input
            v-model="serviceToEdit.name"
            id="name"
            class="form-control"
            type="text"
            placeholder="Name"
          />
        </div>
        <div class="col-12">
          <label for="exampleFormControlTextarea1" class="form-label"
            >Service Description:</label
          >
          <textarea
            v-model="serviceToEdit.description"
            class="form-control"
            placeholder="Description"
            id="exampleFormControlTextarea1"
            rows="5"
          >
          </textarea>
        </div>
        <div class="d-flex mb-3 mt-3">
          <button
            @click.prevent="update()"
            type="submit"
            class="btn btn-success me-2"
          >
            CHANGE
          </button>
          <button type="reset" class="btn btn-danger">DELETE</button>
        </div>
      </div>
    </div>
  </form>
</template>

<style lang="scss" scoped>
h2 {
  font-family: "Libre Baskerville", serif;
  text-align: center;
}

.container {
  width: 80%;
  max-width: none;
  margin: 0 auto;
  display: flex;
  justify-content: space-around;
  align-items: center;
  flex-direction: column;
  background-color: rgb(211, 211, 214);
  height: 100%;
}

.form-control {
  width: 100%;
  border-radius: 10px;
}

.label {
  font-family: "Libre Baskerville", serif;
}

input {
  width: 100%;
  background-color: #ffffff;
}

.btn {
  width: 100%;
}

@media (min-width: 768px) {
  .w-10 {
    width: 10%;
  }
}
</style>
