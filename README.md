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
    <img src="http://file.debuggerpowerzcy.top/power/LaoYouTiao-V1.png" /> 
</div>

> [中文说明](./README_CN.md)

## Attention
The latest version is **1.1** which is submitted on 26th, October under approving.  
If you can't fetch it, then [click here](https://github.com/caofanCPU/LaoYouTiao/releases/tag/1.1) to download ~~.zip~~ file.  
By the way, I hope you use happy and give me a 🌟, thx!

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


> By the way, these default shortcuts used in Mac OS, if you use Windows just take `cmd` into `ctrl`.

### How to install
- `Preference` --> `Plugins` --> `Marketplace` --> type `LaoYouTiao` --> install
- [IDEA official plugin library installation](https://plugins.jetbrains.com/plugin/15255-laoyoutiao)  
- As for `Source installation` requires you're familiar with Gradle, I will add more details about how to develop a plugin by ***Gradle*** later

### Bug & Question
- Known issues
> The icon of plugin shows error like this: red square with a cross
<div align="center">
    <img src="http://file.debuggerpowerzcy.top/power/W-D8ger.png" /> 
</div>

```
Solution
1.This issue is caused by Intellij IDEA of new version feature.
2.Try to upgrade the version of Intellij util 2019.3.*(greater than 2019.2.*), you'll fix it.
```

[Other issues, please come to join room](https://github.com/caofanCPU/D8gerAutoCode/issues)

### VersionRoadHistory
If you like LaoYouTiao, please star <a href="https://github.com/caofanCPU/LaoYouTiao">the source project</a> for supporting me, thanks!
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
