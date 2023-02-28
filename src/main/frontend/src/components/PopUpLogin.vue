<script setup></script>
<template>
  <button
    type="button"
    class="btn btn-primary"
    data-bs-toggle="modal"
    data-bs-target="#staticLogIn"
  >
    Log In
  </button>

  <div
    class="modal fade"
    id="staticLogIn"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    tabindex="-1"
    aria-labelledby="staticBackdropLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
        </div>
        <div class="modal-body" id="formBody">

            <form>
  <!-- Email input -->
  <div class="form-outline mb-4">
    <input type="email" id="form2Example1" class="form-control" placeholder="Email Address" />
    
  </div>

  <!-- Password input -->
  <div class="form-outline mb-4">
    <input type="password" id="form2Example2" class="form-control" placeholder="Password"/>
    
  </div>

  <!-- 2 column grid layout for inline styling -->
  <div class="row mb-4">
    <div class="col d-flex justify-content-center">
      <!-- Checkbox -->
      <div class="form-check">
        <input class="form-check-input" type="checkbox" value="" id="form2Example31" checked />
        <label class="form-check-label" for="form2Example31"> Remember me </label>
      </div>
    </div>

    <div class="col">
      <!-- Simple link -->
      <a href="#!">Forgot password?</a>
    </div>
  </div>

  <!-- Submit button -->
  <div class="d-flex justify-content-center">
  <button type="button" class="btn btn-primary btn-block mb-4">Sign in</button>
</div>
</form>


        </div>
      </div>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/styleForm.css";
</style>
