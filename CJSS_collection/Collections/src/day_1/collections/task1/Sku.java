package day_1.collections.task1;

public class Sku {
	 int skuId;
	 String skuSize;
	 double price;
	 
	public int getSkuId() {
		return skuId;
	}
	
	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}
	
	public String getSkuSize() {
		return skuSize;
	}
	
	public void setSkuSize(String skuSize) {
		this.skuSize = skuSize;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sku [skuId=" + skuId + ", skuSize=" + skuSize + ", price=" + price + "]";
	} 
	 
	
}
