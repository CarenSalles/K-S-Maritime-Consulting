import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('../views/LoginView.vue')
    },
    {
      path: '/service',
      name: 'service',
      component: () => import ('../views/ServiceView.vue')
    },  
    {
      path: '/serviceform',
      name: 'serviceform',
      component: () => import ('../views/ServiceFormView.vue')
    },
    {
      path: '/servicelist',
      name: 'servicelist',
      component: () => import ('../views/ServiceListView.vue')
    },
    {
    path: '/servicechange',
      name: 'servicechange',
      props: true,
      component: () => import ('../views/EditServiceView.vue'),
    }
  ],
});

export default router
