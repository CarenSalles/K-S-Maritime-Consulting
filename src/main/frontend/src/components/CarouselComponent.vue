<script setup>

</script>

<template>
    <div
    id="carouselExampleInterval"
    class="carousel slide"
    data-bs-ride="carousel"
  >
    <div class="carousel-inner">
      <div class="carousel-item active" data-bs-interval="5000">
        <img
          src="../../src/assets/images/ponte-barco.jpg"
          class="image-slider-3"
          alt="vessel-bridge"
        />
      </div>
      <div class="carousel-item" data-bs-interval="5000">
        <img
          src="../../src/assets/images/caren-offshore.jpg"
          class="image-slider-3"
          alt="caren-offshore-life"
        />
      </div>
      <div class="carousel-item" data-bs-interval="5000">
        <img
          src="../../src/assets/images/dof-subsea-rov-.jpg"
          class="image-slider-3"
          alt="dp-console"
        />
      </div>
    </div>
    <button
      class="carousel-control-prev"
      type="button"
      data-bs-target="#carouselExampleInterval"
      data-bs-slide="prev"
    >
      <div class="control-button">
        <span class="carousel-control-prev-icon"></span>
      </div>
      <span class="visually-hidden">Previous</span>
    </button>
    <button
      class="carousel-control-next"
      type="button"
      data-bs-target="#carouselExampleInterval"
      data-bs-slide="next"
    >
      <div class="control-button">
        <span class="carousel-control-next-icon"></span>
      </div>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
</template>

<style lang ="scss" scoped>
@import "../assets/sass/variables";

.image-slider-3 {
  width: 100%;
  height: 40em;
  object-fit:cover;
  object-position:inherit;
  
}
.control-button {
  background-color: $background-blue;
  height: 5rem;
  width: 5rem;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: 100%;
}
@media (min-width: 1471px) and (max-width: 2560px) {
  .control-button {
    height: 6rem;
    width: 6rem;
  }
  .image-slider-3 {
    width: 100%;
    height: 80vh;
    object-fit: cover;
    object-position: top;

  }
}
@media (max-width: 1024px) {
  .control-button {
    height: 4rem;
    width: 4rem;
  }
  .image-slider-3 {
    width: 100%;
    height: 30em;
    
  }
}
@media (max-width: 768px) {
  .image-slider-3 {
    height: 15em;
    width: 100%;
    object-fit: fill;
    object-position:center center;
  }
  .control-button {
    height: 2.5rem;
    width: 2.5rem;
  }
}

@media (max-width: 425px) {
  .image-slider-3{
    height: 10em;
  }
  .control-button {
    height: 2.5rem;
    width: 2.5rem;
  }
}
@media (max-width: 320px) {
  .control-button {
    height: 2.5rem;
    width: 2.5rem;
  }
    .image-slider-3{
    height: 10em;
  }
}
</style>