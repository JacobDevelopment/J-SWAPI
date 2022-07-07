<h1>J-SWAPI</h1>
<p>J(ava)-SWAPI is a helper library for <a href="https://swapi.dev/">SWAPI</a>, which is short for Star Wars API. It allows you to retrieve data relating to the following: 
<b>People, Films, Starships, Vehicles, Species, and Planets.</b>
</p>

<h1>Table of contents</h1>
<ul>
<li><a href="gettingstarted">Getting Started</a></li>
<li><a href="gettingbyid">Get Resource By ID</a></li>
<li><a href="gettingall">Get All Resources</a></li>
<li><a href="gettingbysearch">Get Resources by search</a></li>
<li><a href="gettingbyfilter">Get resources by filter</a></li>
<li><a href="gettingfirstbysearch">Get first resource by search</a></li>
<li><a href="dependecies">Dependencies</a></li>
<li><a href="knownissues">Known Issues</a></li>
<li><a href="todolist">Todo List</a></li>
</ul>

<h1>Please note before using:</h1>
<p>
This API does not handle rate limiting, and according to the SWAPI website it allows <b>10,000 API requests per day.</b>
You can find that information documented <a href="https://swapi.dev/documentation#rate">here</a>.

It should also be noted that no authentication is required per the website as well.
</p>

<h1 id="#gettingstarted">Getting Started:</h1>

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

All resources
extend <b><a href="https://github.com/JacobDevelopment/J-SWAPI/blob/master/src/main/java/io/jking/jswapi/action/RequestAction.java">
RequestAction&lt;T extends BaseResource&gt;</b></a>.

<p>
<b>T</b> is defined as our resource. So via our core SWAPI class, we have static action methods that return the desired resource we want. 
</p>


<h3 id="gettingbyid">Getting Resource By ID:</h3>

`RequestAction#getById(Int)` -> `T`

```java
class GettingStarted {
    public static void main(String[] args) {
        var person = SWAPI.person().getById(2);
    }
}
```

<h3 id="#gettingall">Getting All Of Resource Type:</h3>

`RequestAction#getAll()` -> `List<T>`

```java
class GettingStarted {
    public static void main(String[] args) {
        List<Films> films = SWAPI.films().getAll();
    }
}
```

<h3 id="gettingbysearch">Getting resources by search query:</h3>

`ReuestAction#getBySearch(String)` -> `List<T>`

```java
class GettingStarted {
    public static void main(String[] args) {
        List<Person> people = SWAPI.people().getBySearch("anakin skywalker");
    }
}
```

<p>Spaces are allowed via the search querying method, they are replaced for the URL automatically so using them is alright.</p>

<h3 id="gettingbyfilter">Getting resources by filter:</h3>

`RequestAction#getByFilter(Predicate<T>` -> `List<T>`

```java
class GettingStarted {
    public static void main(String[] args) {
        List<Starships> starshipsList = SWAPI.starships().getByFilter(
                starship -> Double.parseDouble(starship.getHyperdriveRating()) >= 2.0
        );
    }
}
```

<h3 id="gettingfirstbysearch">Getting first result via search:</h3>
`RequestAction#getFirstBySearch(String)` -> `Optional<T>`

```java
class GettingStarted {
    public static void main(String[] args) {
        SWAPI.films().getFirstBySearch("hope").ifPresent(System.out::println);
    }
}
```

<h3>All methods are static and can be called from our core SWAPI class.</h3>
`SWAPI.(resource).getAll()`
<br/>
`SWAPI.(resource).getById(Int)`
<br/>
`SWAPI.(resource).getBySearch(String)`
<br/>
`SWAPI.(resource).getFirstBySearch(String)`
<br/>
`SWAPI.(resource).getByFilter(Predicate<T>)`

<h1 id="dependencies">Dependencies</h1>
<ul>
<li>
<a href="https://github.com/FasterXML/jackson">Jackson</a> - Reading & Parsing JSON.
</li>
</ul>

<h1 id="#knownissues">
Known Issues
</h1>
<p>
Elements skip certain indexes, read <a href="https://github.com/Juriy/swapi/issues/49">here</a>
</p>

<h1 id="#todolist">
Todolist
</h1>
<p>
Nothing currently.
</p>