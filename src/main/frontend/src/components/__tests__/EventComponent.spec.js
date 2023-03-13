import { describe, it, expect } from "vitest";

import { mount } from "@vue/test-utils";
import EventComponent from "../EventComponent.vue";

describe("Header", () => {
  it("should have header tag", () => {
    const wrapper = mount(EventComponent);
    const headerTag = wrapper.find("header").exists();
    expect(headerTag).toBe(false);
  });
})