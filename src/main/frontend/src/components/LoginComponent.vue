<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter()

// const props = defineProps({
//   title:{
//     type: String,
//     default: 'login'
//   }
// })

const username = ref("")
const password = ref("")

const submit = async () => {
  username.value.length || password.value.length < 4 ? alert("Fields must contain at least 8 characters"):null;
}

function required (value) {
  return !!value || 'This field is required'
}

function counter(value) {
  return value.length < 40 || 'Max 40 charecters'
  
}

</script>

<template>
    <form class="wrapper">
        <h1>Login</h1>
        <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Username:</label>
        <input
            v-model="username"
            maxlength="40"
            :rules="[required, counter]"
            required
            type="email"
            class="form-control"
            id="exampleInputEmail1"
            aria-describedby="emailHelp"
        />
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Password:</label>
      <input 
      v-model="password"
      type="password" 
      maxlength="40"
      :rules="[required, counter]"
      required
      class="form-control" 
      id="exampleInputPassword1" />
    </div>
    <div class="btn-container">
      <button type="reset" id="btn-delete" class="btn btn" >Reset</button>
      <button type="submit" id="btn-send" class="btn btn" @click="submit()">Submit</button>
    </div>
  </form>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

body {
  .wrapper {
    width: 80%;
    height: 22em;
    margin: 5em;
    padding: 5em;
    background-color: $background-container;
    border-radius: 0.5em;
    display: flex;
    flex-direction: column;
    justify-content: space-around;

    h1 {
      text-align: center;
      font-weight: bold;
    }

    .form-label {
      color: $background-blue;
      font-weight: bold;
      font-size: 3vh;
    }
   

    #btn-delete {
      background-color: $text-red;
      width: 20vw;
      color: $text-button;
      font-size: 2.5vh;
    }

    #btn-send {
      background-color: $background-blue;
      width: 20vw;
      color: $text-button;
      font-size: 2.5vh;
    }
    .btn-container {
      display: flex;
      justify-content: space-around;
      gap: 1.5vw;
      //                                               
    }
  }
}

@media (min-width: 1024px) {
  body {
    .wrapper {
      width: 50%;
      height: 70%;
      margin: 5em;
      padding: 5em;
      background-color: rgba(255, 255, 255, 0.75);
      border-radius: 0.5em;
      display: flex;
      flex-direction: column;
      justify-content: space-around;

      #btn-delete {
        
        width: 10vw;
        color: $text-button  ;
      }
      #btn-send {
        
        width: 10vw;
        color: $text-button ;
      }
      
      .btn-container {
        display: flex;
        justify-content: flex-end;
        gap: 1.5vw;
        margin-right: 1vw;
      }
    }
  }
}
</style>