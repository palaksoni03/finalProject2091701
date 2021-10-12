
package com.example.finalproject_2091701.model;

import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plant implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("habit")
    @Expose
    private String habit;
    @SerializedName("lifespan")
    @Expose
    private String lifespan;
    @SerializedName("exposure")
    @Expose
    private String exposure;
    @SerializedName("water")
    @Expose
    private String water;
    @SerializedName("features")
    @Expose
    private String features;
    @SerializedName("species")
    @Expose
    private List<Species> species = null;
    public final static Creator<Plant> CREATOR = new Creator<Plant>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Plant createFromParcel(android.os.Parcel in) {
            return new Plant(in);
        }

        public Plant[] newArray(int size) {
            return (new Plant[size]);
        }

    }
    ;

    protected Plant(android.os.Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.habit = ((String) in.readValue((String.class.getClassLoader())));
        this.lifespan = ((String) in.readValue((String.class.getClassLoader())));
        this.exposure = ((String) in.readValue((String.class.getClassLoader())));
        this.water = ((String) in.readValue((String.class.getClassLoader())));
        this.features = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.species, (Species.class.getClassLoader()));
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(image);
        dest.writeValue(habit);
        dest.writeValue(lifespan);
        dest.writeValue(exposure);
        dest.writeValue(water);
        dest.writeValue(features);
        dest.writeList(species);
    }

    public int describeContents() {
        return  0;
    }

}
