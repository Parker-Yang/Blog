<template>
    <div class="articleList">
        <div class="blog_card_article">
            <el-card v-for="(article,index) in data" :key="index" class="box-card" shadow="never" style="margin:10px 0">
                <div slot="header" class="clearfix blog_card_article_title">
                    <span class="blog_card_title">{{article.title}}</span>
                    <router-link :to="'/content?id='+article.art_id">
                        <el-button style="float: right; padding: 3px 0" type="text">详情</el-button>
                    </router-link>
                </div>
            <div class="text item blog_card_text">
                <p class="blog_card_describes">{{article.describes}}</p>
            </div>
        </el-card>
        </div>
    </div>
</template>
<script>
 export default {
    data() {
      return {
        activeNames: ['1'],
        data:[],
        art_type:''
      };
    },
    methods: {
      handleChange(val) {
        console.log(val);
      }
    },
     //进入页面后请求的初始数据
    created() {
        let that = this;
        this.art_type = this.$route.query.art_type;
         if(this.art_type===undefined){
          let reqUrl = "/article/findArticle";
        that.$http.get(reqUrl).then((response) => {
          console.log(response.data)
          this.data = response.data;
        }, function(err) {
            console.log(err);
        })
        }else{
        console.log(this.art_type);
        let reqUrl = "/article/findArticle?art_type="+this.art_type;
        that.$http.get(reqUrl).then((response) => {
          console.log(response.data)
          this.data = response.data;
        }, function(err) {
            console.log(err);
        })
        }
    },
}
</script>
<style scoped>
#blog_button_person{
  width: 100%;
  height: 100%;
}
.blog_card_article{
  width: 65%;
  float: left;
  margin-left: 4%;
}
.blog_card_article_title{
  line-height: 2em;
}
.blog_card_collapse{
  width: 20%;
  float: left;
  margin: 5%;
  
}
.blog_card_title{
  font-size: 18px;
}
.blog_card_text {
    font-size: 14px;
    margin-bottom: 18px;
}

.blog_card_describes {
    text-indent: 2em;
    text-align: left;
    line-height: initial;
}
</style>