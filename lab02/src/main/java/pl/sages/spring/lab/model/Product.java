package pl.sages.spring.lab.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Product extends BaseEntity{
    private String catalogNumber;
    private String name;
    private String description;
    private String descriptionLink;
    private long stockCount;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<ProductPrice> prices;

    @ManyToMany(fetch = FetchType.LAZY,  cascade = CascadeType.ALL)
    @JoinTable(name = "PRODUCT_CATEGORIES", joinColumns=@JoinColumn(name="PRODUCT_ID"), inverseJoinColumns = @JoinColumn(name="CATEGORY_ID"))
    private Collection<Category> categories;

    @OneToOne
    @JoinColumn(name = "MANUFACTURER_ID")
    private Manufacturer manufacturer;

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLink() {
        return descriptionLink;
    }

    public void setDescriptionLink(String descriptionLink) {
        this.descriptionLink = descriptionLink;
    }

    public Set<ProductPrice> getPrices() {
        return prices;
    }

    public void setPrices(Set<ProductPrice> prices) {
        this.prices = prices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (stockCount != product.stockCount) return false;
        if (catalogNumber != null ? !catalogNumber.equals(product.catalogNumber) : product.catalogNumber != null)
            return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (descriptionLink != null ? !descriptionLink.equals(product.descriptionLink) : product.descriptionLink != null)
            return false;
        if (prices != null ? !prices.equals(product.prices) : product.prices != null) return false;
        if (categories != null ? !categories.equals(product.categories) : product.categories != null) return false;
        return !(manufacturer != null ? !manufacturer.equals(product.manufacturer) : product.manufacturer != null);

    }

    @Override
    public int hashCode() {
        int result = catalogNumber != null ? catalogNumber.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (descriptionLink != null ? descriptionLink.hashCode() : 0);
        result = 31 * result + (int) (stockCount ^ (stockCount >>> 32));
        result = 31 * result + (prices != null ? prices.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}
