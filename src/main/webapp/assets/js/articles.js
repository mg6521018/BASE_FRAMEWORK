$(function () {
    //加载文章数据
    loadArticles();

    loadUserInfo();
});

function loadArticles(){
    var data = {};
    $.ajax({
        url : "/lazyegg/article/selectArticles",
        data : data,
        method : 'post',
        contentType : 'application/x-www-form-urlencoded',
        encoding : 'UTF-8',
        cache : false,
        dataType:'json',
        success : function(result) {
            for(var article in result.rows){
                $('#articles').append(result.rows[article].templateHtml);
            }
        },
        error : function() {
            alert('系统异常');
        }
    });
}

function loadUserInfo(){
    var data = {};
    $.ajax({
        url : "/lazyegg/user/userInfo",
        data : data,
        method : 'post',
        contentType : 'application/x-www-form-urlencoded',
        encoding : 'UTF-8',
        cache : false,
        dataType:'json',
        success : function(result) {
            $('#userInfo').append(result.templateHtml);
        },
        error : function() {
            alert('系统异常');
        }
    });
}