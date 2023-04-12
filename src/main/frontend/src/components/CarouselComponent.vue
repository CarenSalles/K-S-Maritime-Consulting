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
          class="image-slider"
          alt="caren-offshore-life"
        />
      </div>
      <div class="carousel-item" data-bs-interval="5000">
        <img
          src="../../src/assets/images/dof-subsea-rov-.jpg"
          class="image-slider"
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
.image-slider {
  width: 100%;
  height: 365px;
  object-fit: contain;
  object-position: inherit;
}
.image-slider-3 {
  width: 100%;
  height: 365px;
  object-fit:contain;
  object-position:inherit;
  
}
.control-button {
  background-color: rgb(17, 17, 63);
  height: 5rem;
  width: 5rem;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: 100%;
}
@media (min-width: 1471px) and (max-width: 2560px) {
  .image-slider {
    height: 460px;
  }
  .image-slider-3 {
    height: 460px;
  }
}
@media (max-width: 1024px) {
  .control-button {
    height: 4rem;
    width: 4rem;
  }
  .image-slider {
    height: 269px;
  }
  .image-slider-3 {
    height: 269px;
  }
}
@media (max-width: 768px) {
  .image-slider {
    object-position: center;
  }
  .image-slider {
    height: 305px;
  }
  .image-slider-3 {
    height: 305px;
  }
}
@media (max-width: 425px) {
  .control-button {
    height: 3rem;
    width: 6rem;
  }
}
@media (max-width: 320px) {
  .control-button {
    height: 2.5rem;
    width: 2.5rem;
  }
}
</style>