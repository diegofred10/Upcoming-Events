<<script setup>
import SliderComponent from './SliderComponent.vue';

</script>
<template>
  <button
    type="button"
    class="log-in-button"
    data-bs-toggle="modal"
    data-bs-target="#staticSlider"
  >
    Check Slider
  </button>

  <div
    class="modal fade"
    id="staticSlider"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    tabindex="-1"
    aria-labelledby="staticBackdropLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog modal-fullscreen">
      <div class="modal-content">
        <div class="modal-header">
          <h2 class="login-text">Slider Check
          </h2>
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
        </div>

        <div class="modal-body" id="formBody">
          
<SliderComponent/>

        </div>
      </div>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/styleForm.css";
@import "../assets/css/NavBarComponent.css";

</style>
