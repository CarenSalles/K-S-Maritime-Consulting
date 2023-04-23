<script setup></script>

<template>
  <footer class="footer w-100">
    <!-- <div class="footer__container-log">
      <img
        src="../assets/images/K&S-Maritime-logo2.png"
        alt="logo K&S Maritime Consulting"
      /> -->
    <!-- </div> -->
    <div class="footer__container-title">
      <p class="footer__container-title__direction">
        K&S Maritime Consulting<br />
        Phone:+3465886874<br />
        San Antonio Street, 09 <br />
        33201 - Gijón <br />
        Astúrias - Spain
      </p>
      <p class="footer__container-title__copyright">
        &copy; K&S Maritime Consulting
      </p>
    </div>
    <div class="footer__container-navigation">
      <ul>
        <li>
          <RouterLink class="nav-link" to="/">Home</RouterLink>
        </li>
        <li>
          <RouterLink class="nav-link" to="/service">Services</RouterLink>
        </li>
        <li>
          <RouterLink class="nav-link" to="/servicelist">Service List</RouterLink>
        </li>
        <li>
          <RouterLink class="nav-link" to="/serviceform">Service Form</RouterLink>
        </li>
        <li>
          <RouterLink class="nav-link" to="/login">Login</RouterLink>
        </li>
      </ul>
    </div>
    <div class="footer__container-social-media">
      <a href="https://github.com/CarenSalles" target="_blank"
        ><img
          class="image-icon icons"
          src="../assets/images/icon-Facebook.png"
          alt="facebbok-icon"
      /></a>

      <a href="https://www.instagram.com/kralj.valentin/?igshid=YmMyMTA2M2Y%3D" target="_blank"
        ><img
          class="image-icon icons"
          src="../assets/images/icon-Instagram.png"
          alt="instagram-icon"
      /></a>

      <a href="https://www.linkedin.com/in/carensalles" target="_blank"
        ><img
          class="image-icon icons"
          src="../assets/images/icon-Linkedin.png"
          alt="linkedln-icon"
      /></a>
    </div>
  </footer>
</template>

<style lang="scss" scoped>
.footer {
  background-color: rgb(17, 17, 63);
  display: flex;
  flex-wrap: wrap;
  gap: 3rem;
  justify-content: space-between;
  align-items: end;
  color: aliceblue;
  padding: 2rem;

  &__container-log {
    img {
      width: 8vh;
      min-width: 140px;
      margin-bottom: 2vh;
    }
  }

  &__container-title {
    font-family: "Libre Baskerville", serif;
    display: flex;
    flex-direction: column;
    justify-content: end;
    align-items: start;

    &__direction {
      font-size: 2.5vh;
    }

    &__copyright {
      font-size: 3.3vh;
      color: #ddbb44;
      margin-bottom: 0.2rem;
    }
  }

  &__container-navigation {
    background-color: rgb(17, 17, 63);
    ul {
      list-style: none;
      padding: 0;
      margin-bottom: 7.8vh;
      font-size: 3vh;
    }
    a {
      color: aliceblue;
      transition: all 0.4s;
    }
    a.router-link-exact-active,
    a:hover {
      color: #ddbb44;
      letter-spacing: 1px;
    }
  }

  &__container-social-media {
    align-self: center;
    display: flex;
    flex-wrap: nowrap;
    flex-direction: row;
    justify-content: center;
    align-items: center;
    cursor: pointer;
  }
  .icons {
    margin: 1vh;
    opacity: 100%;
  }
  .icons a:hover {
    opacity: 50%;
  }
}
</style>
