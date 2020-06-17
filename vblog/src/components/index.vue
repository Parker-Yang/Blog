<template>
  <div class="index">
   <el-container>
    <v-header></v-header>
   <router-view></router-view>
    <el-footer>Footer</el-footer>
  </el-container>
  </div>
</template>

<script>
import header from './common/header'
 export default {
    data() {
      return {
      };
    },
    components: {
        "v-header": header
    },
    methods: {
      
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.index{
  height: 100%;
}
.el-header, .el-footer {
    background-color: #ffffff;
    color: #333;
    text-align: center;
    line-height: 60px;
    padding: 0;
  }

body > .el-container {
  margin-bottom: 40px;
}
</style>
