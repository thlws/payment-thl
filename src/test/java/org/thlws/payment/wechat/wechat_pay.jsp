<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	trimDirectiveWhitespaces="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" style="overflow:auto" dir="ltr" class="uk-notouch">

<!-- 公账号支付示例JSP -->

<script type="text/javascript">

	function onBridgeReady() {
		WeixinJSBridge.invoke('getBrandWCPayRequest', {
			"appId" : '${appId}',
			"timeStamp" : '${timeStamp}',   
			"nonceStr" : '${nonceStr}',
			"package" : '${packageStr}',
			"signType" : '${signType}',   
			"paySign" :  '${paySign}'
		}, function(res) {
			if (res.err_msg == "get_brand_wcpay_request:ok") {

                setTimeout(pay_ok,1500);//支付成功并进行页面跳转

			}else{

				if(res.err_msg == "get_brand_wcpay_request:cancel"){
                    //支付被取消 FIXME
				}else{
                    //其他异常弹出对应异常信息 FIXME
				}
				setTimeout(pay_ng,1500);
			}
		});
	}


	if (typeof WeixinJSBridge == "undefined") {
		if (document.addEventListener) {
			document.addEventListener('WeixinJSBridgeReady',onBridgeReady, false);
		} else if (document.attachEvent) {
			document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
			document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
		}
	} else {
		onBridgeReady();
	}


	function retry(){
		window.location.reload();
	}


	/*支付成功*/
	function pay_ok() {
	    //跟进自己业务决定跳转页面,pay_ok.html仅为示例URL
        window.location.href="${pageContext.request.contextPath}/pay_ok.html";
    }

    /*支付失败*/
    function pay_ng() {
        //跟进自己业务决定跳转页面,pay_ng.html仅为示例URL
        window.location.href="${pageContext.request.contextPath}/pay_ng.html";
    }

</script>
<head>

</head>
<body>

</body>
</html>
