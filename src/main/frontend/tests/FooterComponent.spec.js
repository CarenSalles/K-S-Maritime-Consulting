import { describe, expect, it, test } from "vitest";
import { mount } from "@vue/test-utils";
import { shallowMount } from "@vue/test-utils";
import FooterComponent from "../src/components/FooterComponent.vue";

describe('FooterComponent', () => {
    test('exist text K&S Maritime Consulting' ,() => {
    const wrapper = mount(FooterComponent)
    expect(wrapper.text()).toContain('K&S Maritime Consulting')    
    });
})

describe('FooterComponent', () => {
    test('exist la ruta home on FooterComponent',() => {
    const routerLink = mount(FooterComponent)
    expect(routerLink.text()).toContain('Home')
    });
  
})

describe('Testing classes', () => {
    const wrapper  = shallowMount(FooterComponent);
    it('checks the class to be nav-link',() => {
        expect(wrapper.classes()).toContain('footer', 'w-100');
    })
})
