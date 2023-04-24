<script setup>
import NavbarComponent from "../components/NavbarComponent.vue";
import CarouselComponent from "../components/CarouselComponent.vue";
import FooterComponent from "../components/FooterComponent.vue";
</script>

<template>
  <main>
    <CarouselComponent />
    <section class="aboutus-container">
      <img
        src="../assets/images/sistema-dp.jpg"
        alt="anchor-handling-operations"
      />
      <div>
        <h2>Marine Consultancy and Training a Global independent partner</h2>
        <h4>
          With a vast experience in supporting the maritime and offshore
          industry our knowledge and entrenched experience in marine and
          shipping disciplines from seafaring backgrounds, we deliver effective
          and efficient solutions worldwide, K&S is a company integrated by
          efficiency-orientated professionals with vast experience in
          management, engineering and navigation.
        </h4>
        <p>
          Working towards the reduction of risks and engineering efficient
          results, we offer our customers quality solutions and the best
          support.
        </p>
        <div>
          <button class="ir-arriba">
            <RouterLink class="nav-link" to="/service"
              >Ours Services</RouterLink
            >
          </button>
        </div>
      </div>
    </section>
    <div class="card-container">
      <div class="card-one" style="width: 22rem">
        <img
          src="../assets/images/offshore-wind-area.jpg"
          class="card-img-top"
          alt="Wind offshore field"
        />
        <div class="card-body">
          <h5 class="card-title">
            Norway has Room for 338 GW of Offshore Wind, Analysis Finds.
          </h5>
          <p class="card-text">
            Norway has Room for 338 GW of Offshore Wind, Analysis Finds. Norway
            has the potential to develop up to 338 GW of offshore wind in areas
            with a low level of conflict, according to a new analysis performed
            by Multiconsult and commissioned by the industry organisation
            Norwegian Offshore Wind, Equinor, Source Galileo, Hafslund and Deep
            Wind Offshore.
          </p>
          <a href="https://www.offshorewind.biz/news/" class="btn btn-primary"
            >Read more</a
          >
        </div>
      </div>
      <div class="card-two" style="width: 22rem">
        <img
          src="../assets/images/Skandi_Niteroi_Macaé.jpg"
          class="card-img-top"
          alt="Dp operator"
        />
        <div class="card-body">
          <h5 class="card-title">
            DP Revalidation CPD New Requirements - 11 April 2023
          </h5>
          <p class="card-text">
            The Nautical Institute works with Industry Stakeholders who
            recognise the importance of the mandatory CPD for the DPOs and DPVMs
            for their DP Certificate revalidation to improve their DP knowledge
            through a systematic approach to continuing professional
            development.
          </p>
          <a href="https://www.nialexisplatform.org/" class="btn btn-primary"
            >Read more</a
          >
        </div>
      </div>
      <div class="card-three" style="width: 22rem">
        <img
          src="../assets/images/navio-autonomo.jpg"
          class="card-img-top"
          alt="autonomous ships"
        />
        <div class="card-body">
          <h5 class="card-title">
            Autonommous ship project, key facts about Yara Birkeland.
          </h5>
          <p class="card-text">
            The vessel YARA Birkeland is on route to becoming a fully electric
            and autonomous container ship, with zero emissions. KONGSBERG is
            responsible for development and delivery of all key enabling
            technologies including the sensors and integration required for
            remote and autonomous ship operations, in addition to the electric
            drive, battery and propulsion control systems.
          </p>
          <a
            href="https://www.kongsberg.com/maritime/support/themes/autonomous-ship-project-key-facts-about-yara-birkeland/"
            class="btn btn-primary"
            >Read more</a
          >
        </div>
      </div>
    </div>
  </main>
</template>
<style lang="scss" scoped>
@import "../assets/sass/variables";

main {
  height: 120em;
  .aboutus-container {
    display: flex;
    flex-direction: row;
    width: 90%;
    padding: 1rem;
    max-height: 25rem;
    gap: 1rem;
    margin: 5rem 0 5rem 5rem;
    text-align: center;
    background-color: $background-container;
    border-radius: 1rem;
    img {
      height: 22rem;
    }
    h2 {
      font-size: 2rem;
      color: $text-blue;
      font-weight: bold;
    }

    p {
      font-size: 1.5rem;
      font-weight: bold;
      color: $text-blue;
    }

    button {
      width: 8rem;
      padding-inline: 1rem;
      padding-block:.5rem;
      font-size: 1rem ;
      border-radius: .3rem;   
      margin-top: 3rem;
      margin-left: 45rem;
      border: none;
      background-color: $background-button;
      color: $text-button;
      transition: all 0.4s;

    }
    button:hover{
      background-color: $background-blue;
      
    }
  }

  background-color: $background-container;
  .description-container {
    width: 50%;
    text-align: center;
    border-radius: 1rem;
    padding: 1rem;
    display: block;
  }

  .card-container {
    display: flex;
    justify-content: space-evenly;
    aspect-ratio: 16/9;
    margin-top: 2rem;

    .card-img-top {
      aspect-ratio: 16/9;
      width: 100%;
      object-fit: cover;
    }

    .card-body {
      background-color: $background-container;
      display: flex;
      flex-direction: column;
      padding: 1rem;
      align-items: flex-end;
      .card-title {
        min-height: 6rem;
      }
      .card-text {
        min-height: 14rem;
      }
      .btn {
        width: 6rem;
       
      }
    }
  }
}
</style>
