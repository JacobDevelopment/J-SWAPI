package io.jking.jswapi.resources.impl;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.jking.jswapi.resources.BaseResource;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "model",
        "manufacturer",
        "cost_in_credits",
        "length",
        "max_atmosphering_speed",
        "crew",
        "passengers",
        "cargo_capacity",
        "consumables",
        "vehicle_class",
        "pilots",
        "films",
        "created",
        "edited",
        "url"
})
@Generated("jsonschema2pojo")
public class Vehicles extends BaseResource {

    @JsonProperty("name")
    private String name;
    @JsonProperty("model")
    private String model;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("cost_in_credits")
    private String costInCredits;
    @JsonProperty("length")
    private String length;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("passengers")
    private String passengers;
    @JsonProperty("cargo_capacity")
    private String cargoCapacity;
    @JsonProperty("consumables")
    private String consumables;
    @JsonProperty("vehicle_class")
    private String vehicleClass;
    @JsonProperty("pilots")
    private List<Object> pilots = null;
    @JsonProperty("films")
    private List<String> films = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("url")
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Vehicles() {
    }

    /**
     *
     * @param films
     * @param passengers
     * @param pilots
     * @param edited
     * @param consumables
     * @param created
     * @param length
     * @param costInCredits
     * @param cargoCapacity
     * @param url
     * @param manufacturer
     * @param maxAtmospheringSpeed
     * @param crew
     * @param name
     * @param vehicleClass
     * @param model
     */
    public Vehicles(String name, String model, String manufacturer, String costInCredits, String length, String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables, String vehicleClass, List<Object> pilots, List<String> films, String created, String edited, String url) {
        super();
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.costInCredits = costInCredits;
        this.length = length;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.vehicleClass = vehicleClass;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("cost_in_credits")
    public String getCostInCredits() {
        return costInCredits;
    }

    @JsonProperty("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    @JsonProperty("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    @JsonProperty("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    @JsonProperty("passengers")
    public String getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("cargo_capacity")
    public String getCargoCapacity() {
        return cargoCapacity;
    }

    @JsonProperty("cargo_capacity")
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @JsonProperty("consumables")
    public String getConsumables() {
        return consumables;
    }

    @JsonProperty("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    @JsonProperty("vehicle_class")
    public String getVehicleClass() {
        return vehicleClass;
    }

    @JsonProperty("vehicle_class")
    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    @JsonProperty("pilots")
    public List<Object> getPilots() {
        return pilots;
    }

    @JsonProperty("pilots")
    public void setPilots(List<Object> pilots) {
        this.pilots = pilots;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", costInCredits='" + costInCredits + '\'' +
                ", length='" + length + '\'' +
                ", maxAtmospheringSpeed='" + maxAtmospheringSpeed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", pilots=" + pilots +
                ", films=" + films +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}