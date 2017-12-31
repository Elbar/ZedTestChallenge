package com.kg.vista.zedtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MockyModel {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("email")
@Expose
private String email;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("ip_address")
@Expose
private String ipAddress;
@SerializedName("photo")
@Expose
private String photo;
@SerializedName("employment")
@Expose
private Employment employment;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getIpAddress() {
return ipAddress;
}

public void setIpAddress(String ipAddress) {
this.ipAddress = ipAddress;
}

public String getPhoto() {
return photo;
}

public void setPhoto(String photo) {
this.photo = photo;
}

public Employment getEmployment() {
return employment;
}

public void setEmployment(Employment employment) {
this.employment = employment;
}

}