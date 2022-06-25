package io.jking.jswapi.resources;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.jking.jswapi.resources.BaseResource;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "next",
        "previous",
        "results"
})
@Generated("jsonschema2pojo")
public class GeneralQuery<T extends BaseResource> {

    @JsonProperty("count")
    private int count;
    @JsonProperty("next")
    private Object next;
    @JsonProperty("previous")
    private Object previous;
    @JsonProperty("results")
    private List<T> results = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public GeneralQuery() {
    }

    /**
     *
     * @param next
     * @param previous
     * @param count
     * @param results
     */
    public GeneralQuery(int count, Object next, Object previous, List<T> results) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(int count) {
        this.count = count;
    }

    @JsonProperty("next")
    public Object getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(Object next) {
        this.next = next;
    }

    @JsonProperty("previous")
    public Object getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    @JsonProperty("results")
    public List<T> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<T> results) {
        this.results = results;
    }

}