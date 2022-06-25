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
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var film = api.films().getById(3); // The URL forming here is: https://swapi.dev/api/films/3/?format=json
        System.out.println(film.getTitle()); // This would print Return of the Jedi.
    }
}
```
<br/>

<b>List&lt;Resource&gt;#getBySearch(String)</b>
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var person = api.people().getBySearch("anakin skywalker"); // The URL forming here is: https://swapi.dev/api/people/?search=Anakin%20Skywalker&format=json
        System.out.println(person.getHairColor()); // This would print blond.
    }
}
```
<br/>

<b>List&lt;Resource&gt;#getAll()</b>
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var movies = api.films().getAll(); // The URL forming here is: https://swapi.dev/api/films/?format=json
        for (Films film : movies) {
            System.out.print(film.getEpisodeId() + " ");
        } 
        // Prints 4 5 6 1 2 3  (Unordered for whatever reason!).
    }
}
```
<br/>

<b>List&lt;Resource&gt;#getByFilter(Predicate&lt;Resource&gt;)</b>
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var filtered  = api.films().getByFilter(
          film -> Integer.parseInt(film.getEpisodeId()) <= 3      
        );
//         Forms URL:  https://swapi.dev/api/films/?format=json
//         It then just sorts utilizing streams filter methods.
        filtered.forEach(film -> System.out.println(film.getTitle()));
//        Outputs:
//        The Phantom Menace
//        Attack of the Clones
//        Revenge of the Sith
    }
}
```
<br/>

<b>Optional&lt;Resource&gt;#getFirstBySearch(String)</b>.
```java
class Started {
    public static void main(String[] args) {
        API api = new API.Builder().build();
        var person = api.people().getFirstBySearch("darth vader").orElse(null); // URL forming here is: The URL forming here is: https://swapi.dev/api/people/?search=darth%20vader&format=json
        System.out.println(person.getHairColor()); // This would print none because he is bald.
    }
}
```

You can find more examples here: <a href="https://github.com/JacobDevelopment/j-swapi/tree/master/src/test/java/io/jking/jswapi">Examples</a>

<h1>Todo</h1>

| Item #1 | Description                  | Done? |
|---------|------------------------------|-------|
| #1      | Finish other resources.      | [ ]   |
| #2      | Get rid of executor service. | [X]   |