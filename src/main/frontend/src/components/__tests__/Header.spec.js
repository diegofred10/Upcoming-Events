// import { describe, expect, test } from "vitest";
// import { mount } from "@vue/test-utils";
// import { Header } from "../Header.vue";
import { describe, it, expect } from 'vitest'

import { mount } from '@vue/test-utils'
import Header from '../Header.vue'

describe('Header', () => {
  it('should have header tag', () => {
    const wrapper = mount(Header)
    const headerTag = wrapper.find('header').exists()
    expect(headerTag).toBe(true)
  })
})