<h1>J-SWAPI</h1>
<p>J(ava)-SWAPI, this is an API for <a href="https://swapi.dev/">SWAPI</a> written completely in java. It allows you to retrieve data from the Star Wars API for any applications in need of Star Wars data.</p>

<h1>Dependencies</h1>
<ul>
<li><a href="https://github.com/FasterXML/jackson">Jackson</a> - For parsing JSON.</li>
<li><a href="https://github.com/square/okhttp>">OkHttp</a> - HTTP Client.</li>
</ul>

<h1>Getting started.</h1>

```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
    }
}
```

From here, we can all specific resources that we want to retrieve. We retrieve the following resources from what SWAPI offers:
<b>People, Films, Starships, Vehicles, Species, Planets.</b>

For example, if we want to retrieve a specific person via <b>ID</b> we can call the following people action:
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var person = api.people().getById(3); // The URL forming here is: https://swapi.dev/api/people/3/?format=json
        System.out.println(person.getName()); // This would print R2-D2, thanks to Jackson JSON parsing.
    }
}
```

This API does allow search querying, or retrieving all data for specific resources. All resource(s) have the following methods tied to them:
<br/>
<b>Resource#getById(Int)</b>
<br/>
<b>List&lt;Resource&gt;#getBySearch(String)</b>
</br>
<b>List&lt;Resource&gt;#getAll()</b>

You can find more examples here: <a href="https://github.com/JacobDevelopment/j-swapi/tree/master/src/test/java/io/jking/jswapi">Examples</a>

<h1>Todo</h1>
| Item # | Description            | Done? |
| ------ | -----------------------| ------|
| #1     | Finish other resources.| [ ]   |
| #2     | Get rid of Executor.   | [ ]   |