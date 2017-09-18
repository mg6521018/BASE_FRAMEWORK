$(function () {
    $('#log-form').validator({
        onValid: function (validity) {
            $(validity.field).closest('.am-input-group').find('.am-alert').hide();
        },

        onInValid: function (validity) {
            var $field = $(validity.field);
            var $group = $field.closest('.am-input-group');
            var $alert = $group.find('.am-alert');
            // 使用自定义的提示信息 或 插件内置的提示信息
            var msg = $field.data('validationMessage') || this.getValidationMessage(validity);

            if (!$alert.length) {
                $alert = $('<div class="log-alert am-alert am-alert-danger am-radius"></div>').hide().appendTo($group);
            }

            $alert.html(msg).show();
        },
        submit: function () {
            var formValidity = this.isFormValid();
            if (!formValidity) {
                return formValidity;
            }
            //序列化数据
            var data = $("#log-form").serialize();
            data = decodeURIComponent(data, true);

            //提交代码
            $.ajax({
                url : "/lazyegg/login",
                data : data,
                method : 'post',
                contentType : 'application/x-www-form-urlencoded',
                encoding : 'UTF-8',
                cache : false,
                dataType:'json',
                success : function(result) {
                    if (result.success) {
                        setTimeout("openMain()", 1000);
                    } else {
                        alert(result.msg);
                    }
                },
                error : function() {
                    alert('系统异常');
                }
            });

            //只使用当前表单验证功能，取消当前的提交事件
            return false;
        }
    });

    $('#regButton').on('click', function () {
        window.location.href = "/lazyegg/view/login/reg.jsp";
    });
});

function openMain(){
    window.location.href = "/lazyegg/view/article/index.jsp";
}