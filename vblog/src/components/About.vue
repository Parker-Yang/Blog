<template>
    <div id="About">
        <v-BackHeader></v-BackHeader>
        <v-InfoCard></v-InfoCard>
        <!-- <div id="CardInfo">
            <el-card class="box-card_about">
                <div slot="header" class="clearfix">
                    <span></span>
                </div>
                <div class="about_text item">
                    <img src="" alt="" class="image">
                    <p class="about_text-p"></p>
                </div>
            </el-card>
        </div> -->
    </div>
</template>

<script>
import BackHeader from './common/BackHeader';
import InfoCard from './common/InfoCard'
export default {
    name: 'About',
    data() {
        return {
            about: {}
        }
    },
    components: {
        "v-BackHeader": BackHeader,
        "v-InfoCard": InfoCard
    }
}
</script>

<style scoped>
#About {
    width: 100%;
}

#CardInfo {
    position: relative;
}
.about_text {
    font-size: 18px;
    margin-bottom: 18px;
}

.about_text-p {
    text-indent: 2em;
    text-align: left;
}

.image {
    width: 40%;
    display: block;
    float: left;
}

.clearfix:before,
.clearfix:after {
    display: table;
    content: "";
}

.clearfix:after {
    clear: both
}

.box-card_about {
    width: 80%;
    height: 60%;
    margin: 0 auto;
}
</style>
