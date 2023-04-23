import { describe, expect, it, vitest, vi } from'vitest';
import { mount, shallowMount } from '@vue/test-utils';
import { createTestingPinia } from '@pinia/testing';

import LoginComponent from '../src/components/LoginComponent.vue'

const pinia = createTestingPinia({
    createSpy: vitest.fn(),
});

describe("Login Component", ()=> {
    it("Login button to the Reset", () => {
        const wrapper = mount(LoginComponent, {
            global:{
                plugins:[pinia],
            },
    });

    const btnExist = wrapper.find("button");
    
    expect(btnExist.exists()).toBe("true");
    expect(btnExist.text()).toBe("Reset");

    })
})


