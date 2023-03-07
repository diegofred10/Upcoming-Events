import { describe, it, expect } from "vitest";

import { mount } from "@vue/test-utils";
import { HamburguerMenu } from "../HamburguerMenu.vue";
describe("Hamburguer Menu has two texts", () => {
  it("should have button tag", () => {
    const wrapper = mount(HamburguerMenu);
    const buttonTag = wrapper.find("button").text();
    expect(buttonTag).toBe('Home');
  });
});
