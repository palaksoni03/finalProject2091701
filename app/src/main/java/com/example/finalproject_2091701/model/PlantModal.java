
package com.example.finalproject_2091701.model;

import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlantModal implements Parcelable
{

    @SerializedName("plants")
    @Expose
    private List<Plant> plants = null;
    public final static Creator<PlantModal> CREATOR = new Creator<PlantModal>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PlantModal createFromParcel(android.os.Parcel in) {
            return new PlantModal(in);
        }

        public PlantModal[] newArray(int size) {
            return (new PlantModal[size]);
        }

    }
    ;

    protected PlantModal(android.os.Parcel in) {
        in.readList(this.plants, (Plant.class.getClassLoader()));
    }

    public PlantModal() {
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(plants);
    }

    public int describeContents() {
        return  0;
    }

}
