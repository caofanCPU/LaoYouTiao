# LaoYouTiao

<a href="https://github.com/caofanCPU/LaoYouTiao"><img alt="GitHub commit activity" src="https://img.shields.io/github/commit-activity/m/caofanCPU/LaoYouTiao"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/stargazers"><img src="https://badgen.net/github/stars/caofanCPU/LaoYouTiao" alt="stars"></a>
<a href="https://plugins.jetbrains.com/plugin/15255-laoyoutiao"><img src="https://img.shields.io/jetbrains/plugin/d/15255"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao"><img src="https://img.shields.io/github/v/release/caofanCPU/LaoYouTiao"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/issues"><img src="https://badgen.net/github/open-issues/caofanCPU/LaoYouTiao" alt="issues"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/pulls"><img src="https://badgen.net/badge/PRs/welcome/cyan" alt="PRs Welcome"></a>
<a href="https://github.com/D8ger"><img src="https://badgen.net/badge/organization/join%20us/cyan" alt="open-source-organization"></a>
<a href="https://github.com/caofanCPU/LaoYouTiao/blob/master/LICENCE"><img src="https://badgen.net/github/license/caofanCPU/LaoYouTiao?color=green" alt="license"></a>

## IDEA Code Plugin • `For Common Version`  
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/LaoYouTiao-V3.png" /> 
</div>

> [中文说明](./README_CN.md)

## Attention
The latest version is **2.6** which is submitted and under the official approval on 10th, March.   
If you can't fetch it, then [click here](https://github.com/caofanCPU/LaoYouTiao/releases/tag/2.6) to download ~~.zip~~ file.  
By the way, I hope you use happy and give me a 🌟, thx!  
NEXT Developing plan is [DSP(D8ger Series Plan)](https://www.processon.com/view/5f96a5f35653bb06ef1870e8).

### Preface
As JetBrains' said, I believe that you should be good use of tools will save you precious hours on your busing work.

I always wonder, "If someone else has already solved the repeating work, why do I need to repeat it again?"

Well, that's a valid question for my drive to find the repeat parts at daily work and develop this plugin to save my time.  

### Convention
- The general problem provides standard solutions
- The personalized problem only provides example solutions

### Original design intention
- Remove the fixed duplication coding for improving efficiency in development  
- Provide available code templates that can be used without modification  
- Support code directory configuration, only by self-guided package intelligent programming can be done in one-click  
- Support user-defined configuration, you can specify which file to be generated  

### Features
- Camel-Underline-Uppercase-Uncapitalize-Lowercase can be converted to each other by shortcut `alt` + `shift` + `cmd` + `U`, even timestamp-datetime convert
- JSON formatting and single line text conversion, supporting section and whole document, default shortcut `alt`+`shift`+`cmd`+`J` | `S`
- MySQL formatting, supporting section and whole document, default shortcut `alt`+`shift`+`cmd`+`J` | `B`
- Reserve easter eggs, edit the blank file in IDEA and enter `nasa` to get the NASA configuration file template. This is very useful and efficient for handling multi-lines, especially SQL field naming processing.
- Reserve easter eggs, edit the blank file in IDEA and enter `regex` to get some commonly used regular expressions. Other code Easter eggs will be added later.  
- Reserve easter eggs, you can try to edit the blank file in IDEA and type `ohmyzsh` to get some useful shell commands and functions  

### Using manual
1. JSON formatting and Text simplify
    - Select the specified text string in any file, press `alt` + `shift` + `cmd` + `J`, then complete JSON conversion
    - Select the specified text string in any file, press `alt` + `shift` + `cmd` + `S`, then remove blank characters: line breaks, tabs, spaces
    - If nothing is being select, the whole file content will be handled with shortcut `alt` + `shift` + `cmd` + `J`(or 'S')
    - For text in non-JSON format, no changes will be made

2. Camel-Underline-Uppercase-Uncapitalize-Lowercase circle convert by one-click
    - Choose word text in any editing file, press `alt` + `shift` + `cmd` + `U`, you`ll find the changed word
    - If not satisfied just press the shortcut again and again util you are.
    - Here is the welfare, for the datetime and timestamp conversion, the operation is the same as above, and the supported formats:
        - 'yyyy-MM-dd HH:mm:ss'      -> timestamp, 2020-09-14 15:45:57      -> 1600069557000
        - 'yyyy-MM-dd HH:mm:ss:SSS'  -> timestamp, 2020-09-14 15:45:57:000  -> 1600069557000
        - 'yyyy-MM-dd HH:mm:ss.SSS'  -> timestamp, 2020-09-14 15:45:57.000  -> 1600069557000
        - 'yyyy年MM月dd日HH时mm分ss秒' -> timestamp, 2020年09月14日15时45分57秒 -> 1600069557000
        - timestamp -> 'yyyy-MM-dd HH:mm:ss.SSS',  1600069557000 -> 2020-09-14 15:45:57.000

3. MySQL formatting:
    - Select the specified text string in any file, press `alt` + `shift` + `cmd` + `B`, then complete convert
    - If nothing is being select, the whole file content will be handled with shortcut `alt` + `shift` + `cmd` + `B`
    - For text in non-SQL format, no changes will be made

4. Easter egg:
   - Regex template
      - Choose any blank file, Type `regex` and click on `Tools`-> `D8ger`-> `D8gerMore`, and you will find some surprise
   - NASA template for easter egg:
       - Choose any blank file, Type `nasa` and click on` Tools`-> `D8ger`-> `D8gerMore`, and you will get the NASA manual
       - Follow the manual, custom your config and write your own multi-lines need to be batch handled, then you will find some surprise
   - Shell commands and functions, Type `ohmyzsh` and click on` Tools`-> `D8ger`-> `D8gerMore`, and you will get the surprise

5. QRCode for creating QRCode, 'cmd' + 'alt' + 'shift' + 'K'
    - Basic grammar: '@=@' is the key symbol of grammar parsing
    - For example: **D8GER**@=@**https://github.com/caofanCPU/LaoYouTiao**
    - Then you'll see a window showing [QRCode](https://github.com/caofanCPU/LaoYouTiao)
    - Talk seems cheap, so show you a [gif](http://file.debuggerpowerzcy.top/power/QRCode.gif)

6. Time::Calculate for time estimating
    - For example 1: +10Y9M8d7h6m54s321, means the current time should execute: +10years+9months+8days+7hours+6minutes+54seconds+321milliseconds
    - For example 2: -34h67m89s999999, means the current time should execute: -34hours-67minutes-89seconds-999999milliseconds
    - For example 3: -5s1Y321000, means the current time should execute:-1year-5seconds-321000milliseconds Talk seems cheap, [gif](http://file.debuggerpowerzcy.top/power/Timer.gif)

> By the way, these default shortcuts used in Mac OS, if you use Windows just take `cmd` into `ctrl`.

### How to install

- `Preference` --> `Plugins` --> `Marketplace` --> type `LaoYouTiao` --> install
- [IDEA official plugin library installation](https://plugins.jetbrains.com/plugin/15255-laoyoutiao)
- As for `Source installation` requires you're familiar with Gradle, I will add more details about how to develop a plugin by ***Gradle*** later

### Bug & Question

[No one util now, but wait for you](https://github.com/caofanCPU/D8gerAutoCode/issues)

### VersionRoadHistory
If you like LaoYouTiao, please 🌟 [the source project](https://github.com/caofanCPU/LaoYouTiao) and [download plugin](https://plugins.jetbrains.com/plugin/15255-laoyoutiao) for supporting me, thanks!

- 2.6
    - Add: Time::Calculate for time estimate, 'cmd' + 'alt' + 'shift' + 'H', one of the scenarios is to easily calculate when the Redis cache is written, and the accuracy is supported to the ms level
    - My expectation: It is not easy to insists on open source about 8 versions, but there are only a few 🌟 for this project, so I ask for your help: [Give me a star](https://github.com/caofanCPU/LaoYouTiao) 🌟, and share it with more friends about the funny from one-click!<br>
        - Basic grammar 1: '+' for estimating the future time, the current time will add the input data when calculating; '-'(default: non '+' nor '-') for estimating the past time, the current time will subtract the input data when calculating
        - Basic grammar 2: Time unit definition: 'Y'=Year, 'M'=Month, 'd'=day, 'h'=hour, 'm'=minute, 's'=second, millisecond(default) with no time unit mark
        - Basic grammar 3: Support any combination of time units, which is no order between 'YMdhms'(but I recommended maintain order), besides, it doesn't need to appear all the time utils, just use what you need
        - For example 1: +10Y9M8d7h6m54s321, means the current time should execute: +10years+9months+8days+7hours+6minutes+54seconds+321milliseconds
        - For example 2: -34h67m89s999999, means the current time should execute: -34hours-67minutes-89seconds-999999milliseconds
        - For example 3: -5s1Y321000, means the current time should execute:-1year-5seconds-321000milliseconds
        - Attention 1: The millisecond data must be put to the end if you need it
        - Attention 2: The parsing rules limit the first input of the same time unit as a valid value, and the later data input will be ignored, for example: '2d3m4d5d9m' will only be parsed as '2d3m'
        - Talk seems cheap, [gif](http://file.debuggerpowerzcy.top/power/Timer.gif)

- 2.5
    - Add: QRCode::Link for creating QRCode, 'cmd' + 'alt' + 'shift' + 'K'
        - Basic grammar: '@=@' is the key symbol of grammar parsing
        - For example: D8GER@=@https://github.com/caofanCPU/LaoYouTiao
        - Then you'll see a window showing QRCode with the link: https://github.com/caofanCPU/LaoYouTiao
        - Talk seems cheap, so show you a [gif](http://file.debuggerpowerzcy.top/power/QRCode.gif)
- 2.4
    - Optimize: Graph::Easy will keep the user's original sentence, and then generate graphical text code comments, which is convenient for subsequent adjustments, 'cmd' + 'alt' + 'shift' + 'T'
    - Update: Graph::Easy now fully supports one-click generation of graphical text code comments, 'cmd' + 'alt' + 'shift' + 'T'
        - Basic grammar: '.' is the key symbol of grammar parsing
        - For example: A.some text.B means that node 'A' points node 'B' and the comment upper the arrow is 'some text'
        - Talk seems cheap, so show you a [gif](http://file.debuggerpowerzcy.top/power/HERE.gif)
- 2.3
    - Update: Graph::Easy now fully supports one-click generation of graphical text code comments, 'cmd' + 'alt' + 'shift' + 'T'
        - Basic grammar: '.' is the key symbol of grammar parsing
        - For example: A.some text.B means that node 'A' points node 'B' and the comment upper the arrow is 'some text'
        - Talk seems cheap, so show you a [gif](http://file.debuggerpowerzcy.top/power/HERE.gif)
- 2.2
    - Update: Redo icon([Have a try?](https://github.com/caofanCPU/ImageMagick))<br>
- 2.1
    - BugFix: Beautiful::JSON now support 'null' field for reserving origin text
    - About [DSP(D8ger Series Plan)](https://www.processon.com/view/5f96a5f35653bb06ef1870e8)
- 2.0
    - Add: Support [Graph::Easy](http://debuggerpowerzcy.top/home/2020/04/25/MacOS%E8%BD%AF%E4%BB%B6%E5%88%9D%E5%A7%8B%E5%8C%96/) for easier DSL, default shortcut is `alt` + `shift` + `cmd` + `T`
    - Adjust tool menus
    - D8ger renamed to ByteCry
    - BeautifulJSON renamed to Beautiful::JSON
    - Add new tool item named Graph::Easy
    - CamelUnderlineConvert renamed to Camel::Underline
    - SimplifyOneLine renamed to Simplify::OneLine
    - BeautifulMySQL renamed to Beautiful::MySQL
    - D8gerNote renamed to Byte::NoDance
    - About [DSP(D8ger Series Plan)](https://www.processon.com/view/5f96a5f35653bb06ef1870e8)
- 1.1
    - Camel-Underline-Uppercase-Uncapitalize-Lowercase can be converted to each other by shortcut `alt` + `shift` + `cmd` + `U`, even timestamp-datetime convert
    - JSON formatting and single line text conversion, supporting section and whole document, default shortcut `alt`+`shift`+`cmd`+`J` | `S`
    - MySQL formatting, supporting section and whole document, default shortcut `alt`+`shift`+`cmd`+`J` | `B`
    - Reserve easter eggs, edit the blank file in IDEA and enter `nasa` to get the NASA configuration file template. This is very useful and efficient for handling multi-lines, especially SQL field naming processing.
    - Reserve easter eggs, edit the blank file in IDEA and enter `regex` to get some commonly used regular expressions. Other code Easter eggs will be added later.
    - Reserve easter eggs, you can try to edit the blank file in IDEA and type `ohmyzsh` to get some useful shell commands and functions

### Contribute
- Please give me a 🌟
- Raise demand, write the repetitive problems you often handled at daily work in [issue](https://github.com/caofanCPU/D8gerAutoCode/issues)
- Invite me to sit at the 🍦 shop
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

### Thanks
<a href="https://www.jetbrains.com/idea">
    <img src="http://file.debuggerpowerzcy.top/power/jetbrains-variant-4.svg" style="width: 40px;"><br>
    <sub>With JetBrains team's open source certificate supporting, this project will continue to develop in the spirit of open source</sub>
</a>
