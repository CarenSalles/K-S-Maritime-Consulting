import { describe, it, expect } from "vitest";
import CarouselComponent from "../src/components/CarouselComponent.vue";
import { mount } from "@vue/test-utils";
describe ("CarouselComponent", () => {
    it('should have div tag', () => {
        const wrapper = mount(CarouselComponent);
        const headerTag = wrapper.find("div").exists();
        expect(headerTag).toBe(true);
        
    });
});