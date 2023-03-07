import { describe, it, expect } from "vitest";

import { mount } from "@vue/test-utils";
import Header from "../Header.vue";

describe("Header", () => {
  it("should have header tag", () => {
    const wrapper = mount(Header);
    const headerTag = wrapper.find("header").exists();
    expect(headerTag).toBe(true);
  });
  it("should have img in header tag", () => {
    const wrapper = mount(Header);
    const imgTag = wrapper.find("img").exists();
    expect(imgTag).toBe(true);
  });
});
