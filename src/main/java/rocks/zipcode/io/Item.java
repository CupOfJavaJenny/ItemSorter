package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
/*Write method definitions for Item class.
(11-13)DECLARE all fields as private fields,
(15-18)INITIALIZE those parameters in the constructor
 along with getters & setters because fields are private
USE N/A
 */
public class Item {
    private String name;
    private Long id;
    private Double price;

    public Item() {
        this.name="";
        this.id = 0L;
        this.price=0.01;

    }

    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
