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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>article no sidebar | Amaze UI Examples</title>
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

<body id="blog-article-sidebar">
<!-- header start -->
<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
    <div class="am-u-sm-8 am-u-sm-centered">
        <img width="200" src="http://s.amazeui.org/media/i/brand/amazeui-b.png" alt="Amaze UI Logo"/>
        <h2 class="am-hide-sm-only">中国首个开源 HTML5 跨屏前端框架</h2>
    </div>
</header>
<!-- header end -->
<hr>
<jsp:include page="/view/tools/nav.jspx"></jsp:include>

<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed blog-content">
    <div class="am-u-sm-12">
        <article class="am-article blog-article-p">

        </article>

        <div class="am-g blog-article-widget blog-article-margin">
            <div class="am-u-lg-4 am-u-md-5 am-u-sm-7 am-u-sm-centered blog-text-center">
                <span class="am-icon-tags"> &nbsp;</span><a href="#">标签</a> , <a href="#">TAG</a> , <a href="#">啦啦</a>
                <hr>
                <a href=""><span class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a>
                <a href=""><span class="am-icon-wechat am-icon-fw blog-icon"></span></a>
                <a href=""><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
            </div>
        </div>

        <hr>
        <div class="am-g blog-author blog-article-margin">
            <div class="am-u-sm-3 am-u-md-3 am-u-lg-2">
                <img src="${ctx}/assets/i/f15.jpg" alt="" class="blog-author-img am-circle">
            </div>
            <div class="am-u-sm-9 am-u-md-9 am-u-lg-10">
                <h3><span>作者 &nbsp;: &nbsp;</span><span class="blog-color">amazeui</span></h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                    et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                    aliquip ex ea commodo consequat.</p>
            </div>
        </div>
        <hr>
        <ul class="am-pagination blog-article-margin">
            <li class="am-pagination-prev"><a href="#" class="">&laquo; 一切的回顾</a></li>
            <li class="am-pagination-next"><a href="">不远的未来 &raquo;</a></li>
        </ul>

        <hr>

        <form class="am-form am-g">
            <h3 class="blog-comment">评论</h3>
            <fieldset>
                <div class="am-form-group am-u-sm-4 blog-clear-left">
                    <input type="text" class="" placeholder="名字">
                </div>
                <div class="am-form-group am-u-sm-4">
                    <input type="email" class="" placeholder="邮箱">
                </div>

                <div class="am-form-group am-u-sm-4 blog-clear-right">
                    <input type="password" class="" placeholder="网站">
                </div>

                <div class="am-form-group">
                    <textarea class="" rows="5" placeholder="一字千金"></textarea>
                </div>

                <p>
                    <button type="submit" class="am-btn am-btn-default">发表评论</button>
                </p>
            </fieldset>
        </form>
        <hr>
    </div>
</div>
<!-- content end -->
<jsp:include page="/view/tools/footer.jspx"></jsp:include>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${ctx}/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="${ctx}/assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="${ctx}/assets/js/amazeui.min.js"></script>
<!-- <script src="assets/js/app.js"></script> -->
</body>
</html>