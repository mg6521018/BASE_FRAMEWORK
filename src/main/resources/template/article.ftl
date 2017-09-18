<article class="am-g blog-entry-article">
    <div class="am-u-lg-6 am-u-md-12 am-u-sm-12 blog-entry-img">
        <img src="${imgPath}" alt="" class="am-u-sm-12">
    </div>
    <div class="am-u-lg-6 am-u-md-12 am-u-sm-12 blog-entry-text">
        <span><a href="${article.id}" class="blog-color">${article.userName} &nbsp;</a></span>
        <span> @amazeUI &nbsp;</span>
        <#setting datetime_format="yyyy年MM月dd日"/>
        <span>${article.createtime?number_to_datetime}</span>
        <h1><a href="">${article.title}</a></h1>
        <p>${article.content}</p>
        <p><a href="" class="blog-continue">continue reading</a></p>
    </div>
</article>