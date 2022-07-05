<h1>J-SWAPI</h1>
<p>J(ava)-SWAPI is a helper library for <a href="https://swapi.dev/">SWAPI</a>, which is short for Star Wars API. It allows you to retrieve data relating to the following: 
<b>People, Films, Starships, Vehicles, Species, and Planets.</b>
</p>

<h1>Table of contents</h1>
<ul>
<li><a href="##gettingstarted">Getting Started</a></li>
<li><a href="##gettingstarted">Get Resource By ID</a></li>
<li><a href="##gettingstarted">Get All Resources</a></li>
<li><a href="##gettingstarted">Get Resources by search</a></li>
<li><a href="##gettingstarted">Get resources by filter</a></li>
<li><a href="##gettingstarted">Get first resource by search</a></li>
<li><a href="##gettingstarted">Dependencies</a></li>
<li><a href="##gettingstarted">Known Issues</a></li>
<li><a href="##gettingstarted">Todo List</a></li>
</ul>

<h1>Please note before using:</h1>
<p>
This API does not handle rate limiting, and according to the SWAPI website it allows <b>10,000 API requests per day.</b>
You can find that information documented <a href="https://swapi.dev/documentation#rate">here</a>.

It should also be noted that no authentication is required per the website as well. 
</p>

<h1 id="#gettingstarted">Getting Started:</h1>

```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
    }
}
```

<h3>Provide own OkHttpClient:</h3>
<p>If you want to provide your own OkHttpClient with custom configurations, you can use the following builder methods:</p>

```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder()
                .setHttpClient(new OkHttpClient())
                .build();
    }
}
```

From here, we can retrieve the following resources that were mentioned above:
<ul>
<li>People</li>
<li>Films</li>
<li>Starships</li>
<li>Vehicles</li>
<li>Species</li>
<li>Planets</li>
</ul>

All resources provide the same routes, allowing you to retrieve via the following ways:
<b>SEARCH, ID, ALL, PAGE.</b>

All resources extend <b><a href="https://github.com/JacobDevelopment/J-SWAPI/blob/master/src/main/java/io/jking/jswapi/action/RequestAction.java">RequestAction&lt;T extends BaseResource&gt;</b></a>.

<p>
<b>T</b> is defined as our resource. So via our core SWAPI class, we have action methods that return the desired resource we want.
</p>

<h3>Example:</h3>
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        var person = swapi.person().getById(2);
    }
}
```
<p>
The <b>person()</b> method calls the PersonAction class which extends our RequestAction. This applies to all resources, but we will denote the generic methods that all resources provide below.
</p>
<h3>Getting Resource By ID:</h3>

`RequestAction#getById(Int)` -> `T`
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        var person = swapi.person().getById(2);
    }
}
```

<h3>Getting All Of Resource Type:</h3>

`RequestAction#getAll()` -> `List<T>`
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        List<Films> films = swapi.films().getAll();
    }
}
```

<h3>Getting resources by search query:</h3>

`ReuestAction#getBySearch(String)` -> `List<T>`
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        List<Person> people = swapi.people().getBySearch("anakin skywalker");
    }
}
```
<p>Spaces are allowed via the search querying method, they are replaced for the URL automatically so using them is alright.</p>

<h3>Getting resources by filter:</h3>

`RequestAction#getByFilter(Predicate<T>` -> `List<T>`
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        List<Starships> starshipsList = swapi.starships().getByFilter(
                starship -> Double.parseDouble(starship.getHyperdriveRating()) >= 2.0
        );
    }
}
```

<h3>Getting first result via search:</h3>
`RequestAction#getFirstBySearch(String)` -> `Optional<T>`
```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI swapi = new SWAPI.Builder().build();
        swapi.films().getFirstBySearch("hope").ifPresent(System.out::println);
    }
}
```

