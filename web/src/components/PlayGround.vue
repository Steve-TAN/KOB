<template>
    <div class="playground">
        <GameMap />
    </div>
</template>

<script>
import GameMap from './GameMap.vue'

export default {
    components: {
        GameMap,
    }
}
</script>

<style scoped>
div.playground {
    /**
        60%屏幕宽度 70%屏幕长度 居中
     */
    width: 60vw;
    height: 70vh;
    margin: 40px auto;
    
}
</style>
