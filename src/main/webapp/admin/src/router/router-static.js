import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import wenjianfenlei from '@/views/modules/wenjianfenlei/list'
    import gongzuorenwu from '@/views/modules/gongzuorenwu/list'
    import gongzuohuibao from '@/views/modules/gongzuohuibao/list'
    import qiyewenjian from '@/views/modules/qiyewenjian/list'
    import qiyexiangmu from '@/views/modules/qiyexiangmu/list'
    import kehuxinxi from '@/views/modules/kehuxinxi/list'
    import qiyejingfei from '@/views/modules/qiyejingfei/list'
    import yuangongqingjia from '@/views/modules/yuangongqingjia/list'
    import zhicheng from '@/views/modules/zhicheng/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import bumen from '@/views/modules/bumen/list'
    import xinxixiang from '@/views/modules/xinxixiang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/wenjianfenlei',
        name: '文件分类',
        component: wenjianfenlei
      }
      ,{
	path: '/gongzuorenwu',
        name: '工作任务',
        component: gongzuorenwu
      }
      ,{
	path: '/gongzuohuibao',
        name: '工作汇报',
        component: gongzuohuibao
      }
      ,{
	path: '/qiyewenjian',
        name: '企业文件',
        component: qiyewenjian
      }
      ,{
	path: '/qiyexiangmu',
        name: '企业项目',
        component: qiyexiangmu
      }
      ,{
	path: '/kehuxinxi',
        name: '客户信息',
        component: kehuxinxi
      }
      ,{
	path: '/qiyejingfei',
        name: '企业经费',
        component: qiyejingfei
      }
      ,{
	path: '/yuangongqingjia',
        name: '员工请假',
        component: yuangongqingjia
      }
      ,{
	path: '/zhicheng',
        name: '职称',
        component: zhicheng
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/xinxixiang',
        name: '信息箱',
        component: xinxixiang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
