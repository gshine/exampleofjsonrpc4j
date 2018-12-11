# example of jsonrpc4j with spring boot
an example of using jsonrpc4j with integration to spring boot

## usage

### server
```
mvn spring-boot:run
```

### client

```
curl -X POST "localhost:9090/hello" -H 'Content-Type: application/json' -d'
{
   "jsonrpc":2,"method":"hello","params":[],"id":1
}
'
```
输出
```
{"jsonrpc":"2","id":1,"result":"hello"}
```