import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

const router = new Router({
  routes: [
    {
      path: '/',
      redirect: '/index'
    },
    {
      path: '/index',
      name: 'index',
      component: resolve => require(['@/components/index'], resolve),
      children:[
        {
          path: '/index/main',
          name: 'main',
          component: resolve => require(['@/components/main'], resolve),
          children:[
            {
              path: '/index/main/articlelist',
              name: 'articlelist',
              component: resolve => require(['@/components/articlelist'], resolve),
            }
          ],redirect:{name:'articlelist'}
        },
        {
          path: '/index/about',
          name: 'About',
          component: resolve => require(['@/components/About'], resolve),
        }
      ]
    },{
      path: '/content',
      name: 'content',
      component: resolve => require(['@/components/content'], resolve),
    }
  ]
})
export default router;