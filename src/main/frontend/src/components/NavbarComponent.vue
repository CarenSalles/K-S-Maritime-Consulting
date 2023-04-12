<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <nav class="navbar navbar-expand-lg">
    <div class="container">
      <a href="/" class="navbar-brand"
        ><img
          src="../assets/images/K&S-Maritime-logo2.png"
          alt="K&S Maritime Consulting logo"
          class="logo"
      /></a>
      <i class="bi bi-wechat"></i>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <RouterLink class="nav-link" to="/">Home</RouterLink>
          </li>

          <li class="nav-item">
            <RouterLink to="/login" class="nav-link">Login</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/service" class="nav-link">Service</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/serviceform" class="nav-link">Service Form</RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<style lang="scss" scoped>
nav {
  .container {
    img.logo {
      width: 8vh;
      min-width: 100px;
     
    }
  }
}
.navbar{
 background-color: rgb(17, 17, 63);
 a{
    color:aliceblue;
    transition: all 0.4s;
 }
 a.router-link-exact-active,
 a:hover{
    color:#DDBB44;
    letter-spacing: 1px;
 }
}

.nav-item{
    font-size: 4vh;
}
</style>
