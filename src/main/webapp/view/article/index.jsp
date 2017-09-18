<%--
  Created by IntelliJ IDEA.
  User: magang
  Date: 2017/9/13
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" autoFlush="true" %>
<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>BLOG index with sidebar & slider  | Amaze UI Examples</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="icon" type="image/png" href="${ctx}/assets/i/favicon.png">
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="${ctx}/assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="apple-touch-icon-precomposed" href="${ctx}/assets/i/app-icon72x72@2x.png">
    <meta name="msapplication-TileImage" content="${ctx}/assets/i/app-icon72x72@2x.png">
    <meta name="msapplication-TileColor" content="#0e90d2">
    <link rel="stylesheet" href="${ctx}/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="${ctx}/assets/css/app.css">
</head>

<body id="blog">

<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
    <div class="am-u-sm-8 am-u-sm-centered">
        <h2 class="am-hide-sm-only">这是XX的小窝</h2>
    </div>
</header>
<hr>
<jsp:include page="/view/tools/nav.jspx"></jsp:include>
<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed">
    <div id="articles" class="am-u-md-8 am-u-sm-12">

    </div>

    <div class="am-u-md-4 am-u-sm-12 blog-sidebar">
        <div id="userInfo" class="blog-sidebar-widget blog-bor">

        </div>
        <div class="blog-sidebar-widget blog-bor">
            <h2 class="blog-text-center blog-title"><span>Contact ME</span></h2>
            <p>
                <a href=""><span class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a>
                <a href=""><span class="am-icon-github am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-reddit am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-weixin am-icon-fw blog-icon"></span></a>
            </p>
        </div>
        <div class="blog-clear-margin blog-sidebar-widget blog-bor am-g ">
            <h2 class="blog-title"><span>TAG cloud</span></h2>
            <div class="am-u-sm-12 blog-clear-padding">
                <a href="" class="blog-tag">amaze</a>
                <a href="" class="blog-tag">妹纸 UI</a>
                <a href="" class="blog-tag">HTML5</a>
                <a href="" class="blog-tag">这是标签</a>
                <a href="" class="blog-tag">Impossible</a>
                <a href="" class="blog-tag">开源前端框架</a>
            </div>
        </div>
        <div class="blog-sidebar-widget blog-bor">
            <h2 class="blog-title"><span>么么哒</span></h2>
            <ul class="am-list">
                <li><a href="#">每个人都有一个死角， 自己走不出来，别人也闯不进去。</a></li>
                <li><a href="#">我把最深沉的秘密放在那里。</a></li>
                <li><a href="#">你不懂我，我不怪你。</a></li>
                <li><a href="#">每个人都有一道伤口， 或深或浅，盖上布，以为不存在。</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- content end -->
<jsp:include page="/view/tools/footer.jspx"></jsp:include>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${ctx}/assets/js/jquery.min.js"></script>
<script src="${ctx}/assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="${ctx}/assets/js/amazeui.min.js"></script>
<script src="${ctx}/assets/js/articles.js"></script>
</body>
</html>
