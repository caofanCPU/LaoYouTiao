# LaoYouTiao

<a href="https://github.com/caofanCPU/LaoYouTiao"><img alt="GitHub commit activity" src="https://img.shields.io/github/commit-activity/m/caofanCPU/LaoYouTiao"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/stargazers"><img src="https://badgen.net/github/stars/caofanCPU/LaoYouTiao" alt="stars"></a>
<a href="https://plugins.jetbrains.com/plugin/15255-laoyoutiao"><img src="https://img.shields.io/jetbrains/plugin/d/15255"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao"><img src="https://img.shields.io/github/v/release/caofanCPU/LaoYouTiao"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/issues"><img src="https://badgen.net/github/open-issues/caofanCPU/LaoYouTiao" alt="issues"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/pulls"><img src="https://badgen.net/badge/PRs/welcome/cyan" alt="PRs Welcome"></a>
<a href="https://github.com/D8ger"><img src="https://badgen.net/badge/organization/join%20us/cyan" alt="open-source-organization"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/blob/master/LICENCE"><img src="https://badgen.net/github/license/caofanCPU/LaoYouTiao?color=green" alt="license"></a>


## IDEA代码插件•`Common版本`
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/LaoYouTiao-V1.png" /> 
</div>

## 说明
最新版本为**1.1**, 在 _**`10月1号`**_ 已通过官方审核发布  
如果无法获取, [戳此](https://github.com/caofanCPU/LaoYouTiao/releases/tag/1.1) 下载~~.zip~~压缩包  
如果用的不错, 给我点个🌟呗, thx!

### 序言
正如JetBrains所说, 我相信你在繁忙编码工作中时应该善用工具以节省宝贵的时间。

我时常在思考, "如果其他人已经解决了这些重复工作, 为什么我还需要重复解决?"

这个问题一直驱动着我, 在日常工作中探寻重复部分并开发此插件以节省时间。 

### [快速开始](http://www.debuggerpowerzcy.top/home/2020/03/14/D8gerAutoCode%E6%8F%92%E4%BB%B6%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8D%97/)

### 约定
- 通用问题提供规范解法
- 个性化问题只提供示例解法

### 设计初衷
- 移除开发中的固定的重复编码过程, 提升开发效率
- 提供可用的代码模板, 基本不用修改就可使用的代码
- 支持代码目录配置, 一键自动生成代码, 仅需自行导包即可完成智能编程
- 支持用户自定义配置, 可指定需要生成的文件

### 功能特性
- 驼峰-下划线-大写-首字母小写-小写, 时间戳与标准时间字符串(香!), 一键转换, 默认快捷键`alt` + `shift` + `cmd` + `U`  
- JSON格式化与单行文本转换, 默认快捷键 `alt`+`shift`+`cmd`+`J` | `S`
- MySQL格式化, 默认快捷键 `alt`+`shift`+`cmd`+`J` | `B`
- 预留彩蛋, 在IDEA中编辑空白文件输入`nasa`即可得到NASA模板, 针对多行字符串批量处理, 尤其是SQL字段命名处理   
- 预留彩蛋, 在IDEA中编辑空白文件输入`regex`即可得到一些常用的有趣正则表达式, 后期会增加其他代码彩蛋
- 预留彩蛋, 在IDEA中编辑空白文件输入`ohmyzsh`即可得到常用Shell命令及函数

### 使用手册
1. JSON美化与空白字符简化:
    - 任意文件选中指定文本字符串, 按下快捷键`alt` + `shift` + `cmd` + `J`, 即可完成格式化
    - 选中文本, 按下快捷键`alt` + `shift` + `cmd` + `S`, 即可剔除空白字符: 换行符、制表符、空格
    - 如果不选中文本, 直接按下快捷键`alt` + `shift` + `cmd` + `J` 或('S'), 则会对当前文件全部文本内容进行处理
    - 对于非JSON格式的文本, 不会做任何修改

2. 驼峰-下划线-大写-首字母小写-小写, 一键循环转换
    - 选中任意编辑状态下文件里的单词, 按下快捷键`alt` + `shift` + `cmd` + `U`, 你会发现选中单词转换了
    - 如果不是你想要的结果那就继续重复按下快捷键, 直到是你想要的为止
    - 买一送一, 对于日期与时间戳的想换转换, 操作同上, 支持格式:
        - 'yyyy-MM-dd HH:mm:ss'      -> 时间戳, 2020-09-14 15:45:57      -> 1600069557000
        - 'yyyy-MM-dd HH:mm:ss:SSS'  -> 时间戳, 2020-09-14 15:45:57:000  -> 1600069557000
        - 'yyyy-MM-dd HH:mm:ss.SSS'  -> 时间戳, 2020-09-14 15:45:57.000  -> 1600069557000
        - 'yyyy年MM月dd日HH时mm分ss秒' -> 时间戳, 2020年09月14日15时45分57秒 -> 1600069557000
        - 时间戳 -> 'yyyy-MM-dd HH:mm:ss.SSS',  1600069557000 -> 2020-09-14 15:45:57.000

3. MySQL美化:
    - 任意文件选中指定文本字符串, 按下快捷键`alt` + `shift` + `cmd` + `B`, 即可完成格式化
    - 如果不选中文本, 直接按下快捷键`alt` + `shift` + `cmd` + `B`, 则会对当前文件全部文本内容进行处理
    - 对于非SQL格式的文本, 不会做任何修改

4. 代码彩蛋, 空白文本输入关键字, 然后按下快捷键`alt` + `shift` + `cmd` + `N`:
    - NASA模板(多行文本批处理)
        - 任意空文本, 输入`NASA`(可忽略大小写), 你会得到NASA操作手册
        - 按照NASA手册提示, 自定义配置并输入需要处理的多行文本, 然后你会得到处理结果
    - 正则表达式模板
        - 任意空文本, `REGEX`(可忽略大小写), 你会得到骚气的正则表达式处理技巧
    - Shell命令与函数技巧, 一个命令触发脚本, 多出来的时间用来聊天喝茶不香吗?
        - 任意空文本, `OHMYZSH`(可忽略大小写), 你会得到骚气的shell命令与函数

>以上默认快捷键针对MacOS系统, 对于Windows用户将`cmd`看做`ctrl`即可

### 如何安装
- `Preference` --> `Plugins` --> `Marketplace` --> type `LaoYouTiao` --> install
- [IDEA官方插件库安装](https://plugins.jetbrains.com/plugin/15255-laoyoutiao)  
- 源码安装, 这需要你熟悉Gradle, 后期我会详细补充如何使用Gradle开发一个插件  

### Bug&问题
- 已知问题(最新版本3.0中已修复)
> 插件图标显示异常, 图标内只出现相交的红叉
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/W-D8ger.png" /> 
</div>

```
1.这是Intelij IDEA新版本特性遗留的兼容性小BUG
2.升级Intelij IDEA版本, 至少为2019.3.*(2019.2.*及以下都会显示异常)
```

[其他问题, 欢迎前来查房](https://github.com/caofanCPU/D8gerAutoCode/issues)

### 版本演进历史
觉得LaoYouTiao不错的,请给个🌟 <a href="https://github.com/caofanCPU/LaoYouTiao">插件地址</a>, 感谢老铁!
- 1.0.RELEASE</h1></li>
    - 自从'今日油条'被'今日头条'起诉侵权后, 本人夙兴夜寐, 久不得眠
    - 连隔壁王家的撕葱都要一口吞的好油条, 怎么就被干趴了呢?
    - 经过以下一系列的探索:
        - 1.一键JSON美化与简化(以及剔除空白字符)
        - 2.一键MySQL格式化
        - 3.一键驼峰下划线(以及'-'拼接)自由转化, 居然还可以转换时间戳, 你敢信?
        - 4.彩蛋集锦, 字符串批处理(对齐), 正则表达式的奇淫巧技
    - 终究悟得真相: 油条虽好, 但不够老道! 丰富的工作去重经验助你省时免坑, 请认准独家: LaoYouTiao(老油条)

### 参与贡献
- 帮我点亮一颗🌟
- 提需求, 在[issue](https://github.com/caofanCPU/D8gerAutoCode/issues)描述工作中经常处理的重复问题
- 请我到🍦店坐坐
<table>
    <tr>
      <td align="center" style="width: 200px;">
        <a href="https://github.com/D8ger">
          <img src="http://file.debuggerpowerzcy.top/power/WX.png" style="width: 400px;"><br>
          <sub>微信</sub>
        </a><br>
      </td>
      <td align="center" style="width: 200px;">
        <a href="http://www.debuggerpowerzcy.top/">
          <img src="http://file.debuggerpowerzcy.top/power/ZFB.png" style="width: 400px;"><br>
          <sub>支付宝</sub>
        </a><br>
      </td>
      <td align="center" style="width: 200px;">
          <a href="https://github.com/caofanCPU">
            <img src="http://file.debuggerpowerzcy.top/power/MX.jpg" style="width: 400px;"><br>
            <sub>MiXin</sub>
          </a><br>
      </td>
    </tr>
</table>

### 致谢

<a href="https://www.jetbrains.com/idea">
    <img src="http://file.debuggerpowerzcy.top/power/jetbrains-variant-4.svg" style="width: 40px;"><br>
    <sub>感谢JetBrains团队的开源证书支持, 本项目将秉承开源精神持续开发</sub>
</a>