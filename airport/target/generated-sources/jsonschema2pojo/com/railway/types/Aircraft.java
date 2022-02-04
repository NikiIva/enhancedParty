
package com.railway.types;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Самолет
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "runway",
    "product"
})
@Generated("jsonschema2pojo")
public class Aircraft {

    /**
     * посадочная полоса
     * 
     */
    @JsonProperty("runway")
    @JsonPropertyDescription("\u043f\u043e\u0441\u0430\u0434\u043e\u0447\u043d\u0430\u044f \u043f\u043e\u043b\u043e\u0441\u0430")
    private String runway;
    @JsonProperty("product")
    private Product product;

    /**
     * посадочная полоса
     * 
     */
    @JsonProperty("runway")
    public String getRunway() {
        return runway;
    }

    /**
     * посадочная полоса
     * 
     */
    @JsonProperty("runway")
    public void setRunway(String runway) {
        this.runway = runway;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Aircraft.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("runway");
        sb.append('=');
        sb.append(((this.runway == null)?"<null>":this.runway));
        sb.append(',');
        sb.append("product");
        sb.append('=');
        sb.append(((this.product == null)?"<null>":this.product));
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
        result = ((result* 31)+((this.runway == null)? 0 :this.runway.hashCode()));
        result = ((result* 31)+((this.product == null)? 0 :this.product.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Aircraft) == false) {
            return false;
        }
        Aircraft rhs = ((Aircraft) other);
        return (((this.runway == rhs.runway)||((this.runway!= null)&&this.runway.equals(rhs.runway)))&&((this.product == rhs.product)||((this.product!= null)&&this.product.equals(rhs.product))));
    }

}
