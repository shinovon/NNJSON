# cc.nnproject.json
JSON library for Java, compatible with CLDC 1.1 & JDK 1.1 

## Usage example:

`JSON`:
```
JSONObject json = JSON.getObject(str);
System.out.println(json.getArray("messages").getObject(0).getNullableString("text"));
```

`JSONArray`, `JSONObject`:
```
JSONArray objects = new JSONArray();

JSONObject object1 = new JSONObject();
object1.put("some", "Example text");
objects.add(object1);

JSONObject object2 = new JSONObject();
object2.put("n", 292);
objects.add(object2);

System.out.println(objects.build());
```

`JSONStream`:
```
JSONStream stream = JSONStream.getStream(connection.openInputStream());
try {
	stream.expectNextTrim('{');
	
	if(!stream.jumpToKey("response")) return;
	stream.expectNextTrim('{');
	
	if(!stream.jumpToKey("items")) return;
	stream.expectNextTrim('[');
	
	if(!stream.skipArrayElements(3)) return;
	stream.expectNextTrim('{');
	
	if(!stream.jumpToKey("date")) return;
	
	System.out.println(stream.nextValue());
} finally {
	stream.close();
}
```
