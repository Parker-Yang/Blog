<template>
    <div class="header">
        <el-header class="blog_header">
            <el-menu :default-active="$route.path" :router="true" class="el-menu-demo" menu-trigger="click" mode="horizontal" >
                <el-menu-item index="/index/main/articlelist">首页</el-menu-item>
                <el-submenu index="2">
                    <template slot="title">分类</template>
                    <el-menu-item index="/index/main/articlelist?art_type=vue">Vue</el-menu-item>
                    <el-menu-item index="/index/main/articlelist?art_type=spring">Spring</el-menu-item>
                    <el-menu-item index="/index/main/articlelist?art_type=linux">Linux</el-menu-item>
                </el-submenu>
                <el-menu-item index="/index/about">关于</el-menu-item>
                <el-menu-item style="float:right">
                    <el-button id="blog_button_person" icon="el-icon-user">张三</el-button>
                </el-menu-item>
            </el-menu>
        </el-header>
    </div>
</template>
<style scoped>
.header{
    width: 100%;
    z-index: 2;
}
.blog_header{
    padding: 0;
}
</style>
