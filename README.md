# log4j2_Sample_Maven

## 実行方法

```
mvn clean compile
mvn exec:java -Dexec.mainClass=sample.log4j2.App
```

### 出力ログ

```
cat logs/testlog.log 
```

```
2020/07/17 22:57:23.480 [sample.log4j2.App.main()] TRACE  sample.log4j2.App Start
2020/07/17 22:57:23.486 [sample.log4j2.App.main()] DEBUG  sample.log4j2.App debug
2020/07/17 22:57:23.490 [sample.log4j2.App.main()] INFO   sample.log4j2.App info=1
2020/07/17 22:57:23.491 [sample.log4j2.App.main()] WARN   sample.log4j2.App warn=1,=2
2020/07/17 22:57:23.492 [sample.log4j2.App.main()] ERROR  sample.log4j2.App error=null
2020/07/17 22:57:23.493 [sample.log4j2.App.main()] TRACE  sample.log4j2.App End
```


## 参考

[ITSakura : Java log4j2でテキストにログを出力するサンプル](https://itsakura.com/java-log4j2-sample)  
[Qiita : Log4j 2.0を使用してみる](https://qiita.com/mato-599/items/979e10135c1cb54ceda9)
