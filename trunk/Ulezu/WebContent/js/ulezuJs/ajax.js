// 得到服务器json数据
//callBack函数接收一个json格式参数，参数为服务器返回数据
function ajax(url, async, body, callBack) {
	var xmlHttpReg = createXmlHttpObject();
	// 如果实例化成功,就调用open()方法,就开始准备向服务器发送请求
	if (xmlHttpReg != null) {
		xmlHttpReg.open("post", url, async);
		xmlHttpReg.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;");
		xmlHttpReg.onreadystatechange = function() {
			// 设置回调函数
			if (xmlHttpReg.readyState == 4) {// 4代表执行完成
				if (xmlHttpReg.status == 200) {// 200代表执行成功
					// 将xmlHttpReg.responseText
					callBack(eval('(' + xmlHttpReg.responseText + ')'));
				}
			}
		};
		xmlHttpReg.send(body);
	}
}

//创那建XMLHttpRequest对象
function createXmlHttpObject() {
	var xmlHttpReg = null;
	try {
		// Firefox, Opera 8.0+, Safari
		xmlHttpReg = new XMLHttpRequest();
	} catch (e) {
		// Internet Explorer
		try {
			xmlHttpReg = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			xmlHttpReg = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttpReg;
}