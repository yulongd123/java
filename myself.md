1、github 生成SSH keys命令：  cat ~/.ssh/id_rsa.pub

2、git提交代码到github每次都要输入用户名和密码的解决方式
git bash进入你的项目目录，输入：
git config --global credential.helper store
 然后你会在你本地生成一个文本，上边记录你的账号和密码。当然这些你可以不用关心。

然后你使用上述的命令配置好之后，再操作一次git pull，然后它会提示你输入账号密码，这一次之后就不需要再次输入密码了。