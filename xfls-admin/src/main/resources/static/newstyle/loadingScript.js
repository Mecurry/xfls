    /**
 * @author lishuaiwu
 * @module 加载所以文件
 */
(function() {
    /**
     * 获取当前文件的路径
     *
     * Returns: {String} 当前脚本文件路径
     */
    //动态加载css
    function dynamicLoadCss(url) {
        var head = document.getElementsByTagName('head')[0];
        var link = document.createElement('link');
        link.type = 'text/css';
        link.rel = 'stylesheet';
        link.href = url;
        head.appendChild(link);
    }
    var cssFiles = [
        "../static/newstyle/cssFile.css"
    ];
    var cssTags = new Array(cssFiles.length);
    for (var k = 0, len = cssTags.length; k < len; k++) {
        dynamicLoadCss(cssFiles[k]);
    }
    // 加载所有js文件
    var jsFiles = [
        "../static/newstyle/jquery.min.js",
        "../static/newstyle/getTime.js",
        "../static/newstyle/createTip.js",
        "../static/newstyle/createSpeed.js",
        "../static/newstyle/drawMap.js"
    ];
    var scriptTags = new Array(jsFiles.length);
    for (var i = 0, len = jsFiles.length; i < len; i++) {
        scriptTags[i] = "<script type='text/javascript' src='"+ jsFiles[i] + "' ></script>";
    }
    if (scriptTags.length > 0) {
        document.write(scriptTags.join(""));
    }
})();
