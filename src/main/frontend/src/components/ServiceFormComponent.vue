<script setup>
import { useRouter } from 'vue-router';

let service = {
  name: "",
  description: "",
};

const router = useRouter();

async function save() {
  if (service.name === "") {
    alert("Need to add name.");
    return;
  }

  if (service.description === "") {
    alert("You need to add a service description.")
    return;
  }

  let results = {};
  const payload = JSON.stringify(service);
  const url = "http://localhost:8080/api"
  const response = fetch(url, {
    method: "POST",
    body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
  });
}

</script>

<template>
   <div class="container ">
    <h1>Service registration form:</h1>
    <p class="titleDescrip">Here the administrator will be able to register the services that can be inserted in the list of services offered to the user of the web page.</p>
</div>
    <div class="container d-flex justify-content-center">
    <div id="formStyle">

<form class="row g-3" >
  <div class="col-12">
    <label for="inputName" class="form-label">Service name:</label>
    <input 
    v-model="service.name"
    id="inputName"
    class="form-control"
    type="text" 
    placeholder="Name"
    >
  </div>
  <div class="col-12">
  <label for="exampleFormControlTextarea1" class="form-label">Service Description:</label>
  <textarea 
  v-model="service.description"
  class="form-control" 
  placeholder="Description"
  id="exampleFormControlTextarea1" rows="5">
</textarea>
</div>
<div class="col-12 d-flex justify-content-center">
    <button 
    @click.prevent="save"
    type="submit" 
    class="btn btn-success">
    ADD +
  </button>
  </div>
</form>
</div>
</div>
</template>

<style lang="scss" scoped>
.container {
  margin-bottom: 8em;
  flex-direction: column;
  font-size: 1em;
  width: 40vw;
  font-weight: bold;
  color: rgb(17, 17, 63);
}
#formStyle{
    width: 70%;
    height: 10em;
 
}
h1{
    margin-top: 1.5em;
    margin-bottom: 1em;
    color:#cc0033;
    margin-left: 1.2em;
}
.titleDescrip{
 
    font-size: 1.3em;
}
button{
    width: 10em;
}
.form-label{
margin-left: 0.5em;
font-weight: bold;
color: rgb(17, 17, 63);
font-size: 1.5em;
}
</style>