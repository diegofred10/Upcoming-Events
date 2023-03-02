<script setup>
function changeColor() {
  let button = document.querySelector(".button");
  if (button.className == "button") {
    button.className = "button-click"
  }
}
</script>
<template>
  <button
    type="button"
    class="button"
    data-bs-toggle="modal"
    data-bs-target="#editForm"
    @click="changeColor()"
  >
    Edit
  </button>

  <div
    class="modal fade"
    id="editForm"
    data-bs-backdrop="static"
    data-bs-keyboard="false"
    tabindex="-1"
    aria-labelledby="staticBackdropLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="staticBackdropLabel">MODIFY EVENT</h5>
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
          ></button>
        </div>
        <div class="modal-body" id="formBody">

          <form class="row g-3">
            <div class="col-md-12">
              <label for="inputTitle" class="form-label">Title</label>
              <input type="text" class="form-control" id="inputTitle" />
            </div>

            <div class="col-12">
              <label for="inputDate" class="form-label">Date</label>
              <input type="date" class="form-control" id="inputDate" />
            </div>
            <div class="col-12">
              <label for="inputEntryMax" class="form-label">Max Entry</label>
              <input
                type="number"
                class="form-control"
                id="inputEntryMax"
                min="0"
                max="30"
              />
            </div>
            <div class="col-md-12">
              <label for="inputDescription" class="form-label">Description</label>
              <input type="text" class="form-control" id="inputDescription" />
            </div>
            <div class="col-md-12">
              <label for="inputImage" class="form-label">Image</label>
              <input type="image" class="form-control" id="inputImage" />
            </div>

            <div class="col-12 d-flex justify-content-center">
              <button type="button" class="btn btn-success" id="ADDbutton">
                UPDATE
              </button>
            </div>
            <div class="col-12 d-flex justify-content-center">
              <div class="">
                <button type="reset" class="btn btn-warning">RESET</button>
              </div>
              <div class="">
                <button
                  type="button"
                  class="btn btn-danger ms-2"
                  data-bs-dismiss="modal"
                >
                  CANCEL
                </button>
              </div>
            </div>
          </form>


        </div>
      </div>
    </div>
  </div>
</template>
<style scoped>
@import "../assets/css/styleForm.css";
@import '../assets/css/eventComponent.css';
@import "../assets/css/NavBarComponent.css";
</style>
