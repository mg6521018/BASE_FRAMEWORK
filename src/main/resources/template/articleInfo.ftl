<div class="am-article-hd">
    <h1 class="am-article-title blog-text-center">${article.title}</h1>
    <p class="am-article-meta blog-text-center">
        <span><a href="#" class="blog-color">${article.userName} &nbsp;</a></span>-
        <span><a href="#">@amazeUI &nbsp;</a></span>-
        <#setting datetime_format="yyyy年MM月dd日"/>
        <span><a href="#">${article.createtime?number_to_datetime}</a></span>
    </p>
</div>
<div class="am-article-bd">
    <img src="${imgPath}" alt="" class="blog-entry-img blog-article-margin">
    <p class="class="am-article-lead"">
        ${article.content}
    </p>
</div>