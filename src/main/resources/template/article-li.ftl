<li>
    <img src="${imgPath}">
    <div class="blog-slider-desc am-slider-desc ">
        <div class="blog-text-center blog-slider-con">
            <span><a href="" class="blog-color">${article.userName} &nbsp;</a></span>
            <h1 class="blog-h-margin"><a href="">${article.title}</a></h1>
            <p>${article.content}
            </p>
            <span class="blog-bor">
            <#setting datetime_format="yyyy年MM月dd日"/>
            ${article.createtime?number_to_datetime}</span>
        </div>
    </div>
</li>