package models;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Product {
    // ********************** PROPERTIES *************************
    private Integer productId;
    private String productName;
    private Integer price;
    private Float weight;
    private Integer quantity;
    private Integer sold;
    private String description;
    private String pic;
    // private Integer userId;
    private User user;

    // *********************** CONSTRUCTOR ****************************
    public Product() {

    }

    public Product(Integer productId, String productName, Integer price, Float weight, Integer quantity, Integer sold, String description, String pic, User user) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.sold = sold;
        this.description = description;
        this.pic = pic;
        this.user = user;
    }

    // ####################### OTHER METHODS ###########################
    public static ArrayList<Product> collectAllProducts(Integer userId) {
        ArrayList<Product> products = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authenticatedb?user=root&password=1234");

            String query = "select * from products where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, userId);

            ResultSet rst = ps.executeQuery();

            while(rst.next()) {
                int productId = rst.getInt("product_id");
                String productName = rst.getString("product_name");
                int price = rst.getInt("price");
                float weight = rst.getFloat("weight");
                int quantity = rst.getInt("quantity");
                int sold = rst.getInt("sold");
                String description = rst.getString("description");
                String pic = rst.getString("pic");
                User user = new User(rst.getInt("user_id"));

                products.add(new Product(productId, productName, price, weight, quantity, sold, description, pic, user));
                
            }

            con.close();

        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return products;
    }


    // ************************ Getter - Setter ***************************
    public void setproductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getproductId() {
        return productId;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getproductName() {
        return productName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getWeight() {
        return weight;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getSold() {
        return sold;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}