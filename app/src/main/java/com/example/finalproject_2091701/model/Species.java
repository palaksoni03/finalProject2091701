
package com.example.finalproject_2091701.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Species implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<Species> CREATOR = new Creator<Species>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Species createFromParcel(android.os.Parcel in) {
            return new Species(in);
        }

        public Species[] newArray(int size) {
            return (new Species[size]);
        }

    }
    ;

    protected Species(android.os.Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Species() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
