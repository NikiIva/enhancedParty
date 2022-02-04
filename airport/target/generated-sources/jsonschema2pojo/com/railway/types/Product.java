
package com.railway.types;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "index"
})
@Generated("jsonschema2pojo")
public class Product {

    /**
     * Адрес
     * 
     */
    @JsonProperty("address")
    @JsonPropertyDescription("\u0410\u0434\u0440\u0435\u0441")
    private String address;
    /**
     * Индекс
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("\u0418\u043d\u0434\u0435\u043a\u0441")
    private Integer index;

    /**
     * Адрес
     * 
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Адрес
     * 
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Индекс
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Индекс
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.index == null)? 0 :this.index.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return (((this.index == rhs.index)||((this.index!= null)&&this.index.equals(rhs.index)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))));
    }

}
