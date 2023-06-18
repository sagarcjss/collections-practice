package day_1.collections.task1;

import java.util.List;

public class Product {
	int productId;
	String productName;
	List<Sku> skus;
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public List<Sku> getSkus() {
		return skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", skus=" + skus + "]";
	}
	
	
}
