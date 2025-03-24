const base = {
    get() {
        return {
            url : "http://localhost:8080/xiquwenhuaxiaochengxu/",
            name: "xiquwenhuaxiaochengxu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiquwenhuaxiaochengxu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "戏曲文化苑"
        } 
    }
}
export default base
