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
    <img src="http://file.debuggerpowerzcy.top/power/LaoYouTiao-V3.png" /> 
</div>

## 说明
最新版本为**2.6**, 在 _**`03月10号`**_ 已提交, 待官方审核  
如果无法获取, [戳此](https://github.com/caofanCPU/LaoYouTiao/releases/tag/2.6) 下载~~.zip~~压缩包  
如果用的不错, 给我点个🌟呗, thx!  
本版本已遵循[DSP(D8ger Series Plan)](https://www.processon.com/view/5f96a5f35653bb06ef1870e8).

### 序言
正如JetBrains所说, 我相信你在繁忙编码工作中时应该善用工具以节省宝贵的时间。

我时常在思考, "如果其他人已经解决了这些重复工作, 为什么我还需要重复解决?"

这个问题一直驱动着我, 在日常工作中探寻重复部分并开发此插件以节省时间。 

### [快速开始](http://www.debuggerpowerzcy.top/home/2020/09/05/D8gerAutoCode%E6%8F%92%E4%BB%B6%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8D%97/)

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
- QRCode, 将url转二维码, 此外, 还可以根据关键字定位优质技术文章链接(言简意赅而不失深度, 图文并茂且浑然一体), 默认快捷键`alt` + `shift` + `cmd` + `K`

#### QRCode高质量链接技术文章示例

**转载说明**
> 以下图片均来自技术大佬[SoWhat1412](https://github.com/SoWhat1412)  
> 已征求原作者同意

当你在空白文本输入如下关键字, 然后`alt` + `shift` + `cmd` + `K`, 你将看到一个弹出窗口  
其中二维码用于微信扫描, 二维码正下方的文字用于跳转浏览器打开  
在工作中, 某些敏感文章(例如面试)就使用微信扫描在移动端查看(摸鱼), 其他的则在WEB端学习研究(光明正大摸鱼)

- kafka
- thread_lock_aqs
- hbase
- hadoop

在技术大佬[SoWhat1412](https://github.com/SoWhat1412)的视角里

Kafka长这样:
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/KAFKA-1.png" /> 
</div>

JUC并发-锁长这样:
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/AQS-1.png" /> 
</div>

HBase长这样:
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/HBASE-1.png" /> 
</div>

Hadoop生态圈长这样:
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/HADOOP-1.png" /> 
</div>

当然, 大佬[SoWhat1412](https://github.com/SoWhat1412)的公众号长这样:
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/SoWhat1412-1.jpeg"  style="max-width: 30%"/> 
</div>

### 使用手册

1. JSON美化与空白字符简化:
    - 任意文件选中指定文本字符串, 按下快捷键`alt` + `shift` + `cmd` + `J`, 即可完成格式化
    - 选中文本, 按下快捷键`alt` + `shift` + `cmd` + `S`, 即可剔除空白字符: 换行符、制表符、空格
    - 如果不选中文本, 直接按下快捷键`alt` + `shift` + `cmd` + `J` 或('S'), 则会对当前文件全部文本内容进行处理
    - 对于非JSON格式的文本, 不会做任何修改
    - 支持JSONString直接转换为JSON Object

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

5. 二维码, 支持将url生成二维码图片, 示例:
   - 帝八哥**@=@**https://github.com/caofanCPU
   - 关键字及功能
       - **@=@** ---> 形式: key=url
       - **help** ---> 帮助文档
       - **thread_pool** ---> 线程池
       - **thread_basic** ---> 线程的基本认知
       - **thread_interview** ---> 线程高频面试
       - **thread_lock_aqs** ---> 并发JUC元祖AQS
       - **thread_lock_cas** ---> 并发JUC-CAS
       - **thread_lock_container** ---> 并发JUC-容器
       - **thread_lock_synchronized** ---> 并发JUC-Synchronized
       - **java_interview** ---> Java预热面试
       - **jvm_interview** ---> JVM高频面试
       - **jvm_interview** ---> JVM原理
       - **jvm_end_map** ---> JVM原理高清大图
       - **mysql_interview** ---> MySQL高频面试
       - **mysql** ---> MySQL基础图
       - **mysql_explain** ---> MySQL执行计划
       - **mysql_end** ---> MySQL终极原理图
       - **redis_interview** ---> Redis高频面试
       - **redis_basic** ---> Redis基础
       - **redis_cluster** ---> Redis集群
       - **redis_end** ---> Redis应用设计
       - **kafka** ---> Kafka原理
     - **rabbit_mq** ---> RabbitMQ原理
     - **hbase** ---> HBase超然旅行
     - **hadoop** ---> Hadoop俯视图
     - **flink** ---> Flink真经
     - **zookeeper** ---> 掀开Zookeeper面纱
     - **bg_protocol** ---> 浅析大数据协议
     - **file** ---> 揭秘读取文件内幕
     - **io_reuse** ---> 起底IO多路复用
     - **io_ram_pool** ---> 聊聊OS内存池技术
     - **spring** ---> Spring老生常谈
6. 时间推演, 推算Redis缓存数据插入时间变成一键了:
    - 示例1: +10Y9M8d7h6m54s321, 代表当前时间加上10年9月8天7小时6分钟54秒321毫秒
    - 示例2: -34h67m89s999999, 代表当前时间减去34小时67分钟89秒999999毫秒
    - 示例3: -5s1Y321000, 代表当前时间减去1年5秒321000毫秒

>以上默认快捷键针对MacOS系统, 对于Windows用户将`cmd`看做`ctrl`即可

### 如何安装
<a href="https://plugins.jetbrains.com/plugin/15255-laoyoutiao" target="_blank">
    <img src="https://cdn.jsdelivr.net/gh/YiiGuxing/TranslationPlugin@master/images/button-install.png" alt="Get from Marketplace" title="Get from Marketplace">
</a>

- `Preference` --> `Plugins` --> `Marketplace` --> type `LaoYouTiao` --> install
- [IDEA官方插件库安装](https://plugins.jetbrains.com/plugin/15255-laoyoutiao)
- 源码安装, 这需要你熟悉Gradle, 后期我会详细补充如何使用Gradle开发一个插件

### Bug&问题

[暂无, 等你来提](https://github.com/caofanCPU/D8gerAutoCode/issues)

### 版本演进历史

觉得LaoYouTiao不错的,请给个🌟, [插件地址](https://plugins.jetbrains.com/plugin/15255-laoyoutiao), 感谢老铁!

- 4.0(里程碑版本)
    - 本次版本增加中国区域的[「字节跳动内推」福利链接](https://bytedance.feishu.cn/docx/doxcnXREso6pznDttWehPFIBieh), 没错, 我为各位优秀小伙伴带来大厂机会, 并且准备了很优质的招聘信息资源。你可以在JetBrains开发软件随时找到该福利链接, 因为只需要一个快捷键, 具体参考下文
    - 新增:
        - QRCode::Link 新增bytedance「字节跳动内推」关键词, 在任意空白文本输入'bytedance', 按下快捷键'cmd' + 'alt' + 'shift' + 'I', 即可得到[「字节跳动内推」链接的二维码及链接](https://bytedance.feishu.cn/docx/doxcnXREso6pznDttWehPFIBieh), 我已在改链接为你准备很多优质的信息, 你会不虚此行的
    - 变更: Byte::NoDance默认跳转链接变更为[「字节跳动内推」福利链接](https://bytedance.feishu.cn/docx/doxcnXREso6pznDttWehPFIBieh), 在任意空的文本界面, 按下'cmd' + 'alt' + 'shift' + 'N', 即可得到「字节跳动内推」链接的二维码及链接, 我已在改链接为你准备很多优质的信息, 你会不虚此行的
    - 修复: JSONGroovy::Enhance('cmd' + 'alt' + 'shift' + 'I') 格式化BUG修复, 现在能胜任更多的复杂JSON数据场景

- 3.4
    - 新增: JSONGroovy::Enhance 支持JSON字符串转为JSON对象, 'cmd' + 'alt' + 'shift' + 'I'
    - 修复: Camel::Underline('cmd' + 'alt' + 'shift' + 'U') 驼峰转换现在支持'-'和'_'分隔

- 2.6
    - 新增: Time::Calculate时间推算功能, 'cmd' + 'alt' + 'shift' + 'H', 其中场景之一是方便推算Redis缓存是什么时刻写入的, 精度支持到ms级别
    - 本人期望: 本项目坚持开源8个版本了, 实属不易, 而项目才几个🌟, 请老铁们为[项目](https://github.com/caofanCPU/LaoYouTiao) 打🌟并分享给更多的朋友, 让他们也爽一爽'一键'
        - 基础语法1: '+'是推算未来时间, 计算时会用当前时间加上输入数据; '-'(默认: 同时没有'+'或'-')是推算过去时间, 计算会用当前时间减去输入数据
        - 基础语法2: 时间单位定义: 'Y'=Year, 'M'=Month, 'd'=day, 'h'=hour, 'm'=minute, 's'=second, millisecond(默认) 不需要时间单位标识
        - 基础语法3: 支持时间单位任意组合, 即YMdhms之间是没有顺序的(但是建议顺序), 此外也不需要都出现
        - 示例1: +10Y9M8d7h6m54s321, 代表当前时间加上10年9月8天7小时6分钟54秒321毫秒
        - 示例2: -34h67m89s999999, 代表当前时间减去34小时67分钟89秒999999毫秒
        - 示例3: -5s1Y321000, 代表当前时间减去1年5秒321000毫秒
        - 注意1: 如果你需要计算毫秒数据, 请最后输入毫秒数据
        - 注意2: 解析规则限定同一个时间单位先输入的为有效值, 后输入的会被忽略, 例如: '2d3m4d5d9m'结果只会是'2d3m'
        - 话不多说, [上图](http://file.debuggerpowerzcy.top/power/Timer.gif)
- 2.5
    - 新增: QRCode::Link生成二维码, 'cmd' + 'alt' + 'shift' + 'K'
        - 基础语法: '@=@'为生成二维码的关键分割符号
        - 示例: 空白文本中输入, 帝八哥@=@https://github.com/caofanCPU/LaoYouTiao
        - 将生成访问作者的二维码(用于手机扫码)和浏览器跳转的'帝八哥'
        - 更多功能, 空白文本中输入'help', 将获取更过关键字, 其中包含大量高质量技术文章和技术大佬, 等你来发掘!
        - 话不多说, [上图](http://file.debuggerpowerzcy.top/power/QRCode.gif)
- 2.4
    - 优化: Graph::Easy保留用户输入原始语句, 再生成图形化文本代码注释, 方便后续调整, 'cmd' + 'alt' + 'shift' + 'T'
        - 基础语法: '.'为元素关键符号
        - 示例: A.文本.B 其含义为'A'节点指向'B'节点, 箭头上的注释为'文本'
        - 注意: 文本强烈建议使用英文, 中文由于编码问题会导致图形无法对齐
        - 话不多说, [上图](http://file.debuggerpowerzcy.top/power/HERE.gif)
- 2.3
    - 新增: Graph::Easy现在全力支持一键生成图形化文本代码注释, 'cmd' + 'alt' + 'shift' + 'T'
        - 基础语法: '.'为元素关键符号
        - 示例: A.文本.B 其含义为'A'节点指向'B'节点, 箭头上的注释为'文本'
        - 注意: 文本强烈建议使用英文, 中文由于编码问题会导致图形无法对齐
        - 话不多说, [上图](http://file.debuggerpowerzcy.top/power/HERE.gif)
- 2.2 更新: 重做图标([试一试?](https://github.com/caofanCPU/ImageMagick))
- 2.1
    - 修复: Beautiful::JSON在美化时支持'null'字段
    - RoadMap参见[DSP(D8ger Series Plan)](https://www.processon.com/view/5f96a5f35653bb06ef1870e8)
- 2.0
    - 新增[Graph::Easy](http://debuggerpowerzcy.top/home/2020/04/25/MacOS%E8%BD%AF%E4%BB%B6%E5%88%9D%E5%A7%8B%E5%8C%96/)语法简化支持, 默认快捷键`alt` + `shift` + `cmd` + `T`
    - 菜单工具栏调整
        - D8ger重命名为ByteCry
        - BeautifulJSON重命名为Beautiful::JSON
        - 新增Graph::Easy
        - CamelUnderlineConvert重命名为Camel::Underline
        - SimplifyOneLine重命名为Simplify::OneLine
        - BeautifulMySQL重命名为Beautiful::MySQL
        - D8gerNote重命名为Byte::NoDance
- 1.1
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
