<template>
  <div class="content">
      <v-header></v-header>
      <el-main>
        <el-card class="box-card">
            <div slot="header" class="clearfix blog_card_article_title">
              <span class="blog_card_title">{{article.title}}</span>
            </div>
            <div class="text item blog_card_text">
              <p class="blog_card_content">{{article.content}}</p>
            </div>
          </el-card>
      </el-main>
  </div>
</template>

<script>
import header from './common/header'
 export default {
    data() {
      return {
        art_id:'',
        article:{}
      };
    },
    components: {
        "v-header": header
    },
    methods: {
      
    },
     //进入页面后请求的初始数据
    created() {
        this.art_id = this.$route.query.id;
        console.log(this.art_id)
        let that = this;
       
        let reqUrl = "/article/findArticleById?id="+that.art_id;
        that.$http.get(reqUrl).then((response) => {
          this.article = response.data
            console.log(response)
            console.log(this.article)
        }, function(err) {
            console.log(err);
        })
    },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.content{
  height: 100%;
}
.blog_card_title{
  font-size: 18px;
}
.blog_card_text {
    font-size: 14px;
    margin-bottom: 18px;
}

.blog_card_content {
    text-indent: 2em;
    text-align: left;
    line-height: initial;
}
</style>
