package com.kg.vista.zedtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employment {

@SerializedName("name")
@Expose
private String name;
@SerializedName("position")
@Expose
private String position;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getPosition() {
return position;
}

public void setPosition(String position) {
this.position = position;
}

}