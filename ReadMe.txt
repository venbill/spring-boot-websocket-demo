
启动服务
用浏览器打开client.html
使用get请求http://localhost:8084/push?user=002&msg=推送给002的消息

可以修改client.html中的ws://localhost:8084/websocket?token=002
改为ws://localhost:8084/websocket?token=001
保存后用浏览器打开client.html
使用get请求http://localhost:8084/push?user=001&msg=推送给001的消息

查看两个页面的消息显示情况

本案例为websocket做消息推送demo