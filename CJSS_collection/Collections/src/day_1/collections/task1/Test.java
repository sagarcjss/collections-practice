package day_1.collections.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		Sku sku1 = new Sku();
		sku1.setSkuId(101);
		sku1.setSkuSize("s");
		sku1.setPrice(500.0);
		
		Sku sku2 = new Sku();
		sku2.setSkuId(102);
		sku2.setSkuSize("m");
		sku2.setPrice(600.0);
		
		Sku sku3 = new Sku();
		sku3.setSkuId(103);
		sku3.setSkuSize("l");
		sku3.setPrice(650.0);
		
		Sku sku4 = new Sku();
		sku4.setSkuId(104);
		sku4.setSkuSize("xl");
		sku4.setPrice(700.50);
		
		Sku sku5 = new Sku();
		sku5.setSkuId(105);
		sku5.setSkuSize("s");
		sku5.setPrice(1500.50);
		
		Sku sku6 = new Sku();
		sku6.setSkuId(106);
		sku6.setSkuSize("m");
		sku6.setPrice(780.50);
		
		Sku sku7 = new Sku();
		sku7.setSkuId(107);
		sku7.setSkuSize("l");
		sku7.setPrice(1299.50);
		
		Sku sku8 = new Sku();
		sku8.setSkuId(108);
		sku8.setSkuSize("xl");
		sku8.setPrice(990.50);
		
		List<Sku> skuList1 = new ArrayList<>();
		skuList1.add(sku1);
		skuList1.add(sku2);
		skuList1.add(sku3);
		skuList1.add(sku4);
		
		List<Sku> skuList2 = new ArrayList<>();
		skuList1.add(sku5);
		skuList1.add(sku6);
		skuList1.add(sku7);
		skuList1.add(sku8);
		
		
		Product prod1 = new Product();
		prod1.setProductId(1001);
		prod1.setProductName("t-shirt");
		prod1.setSkus(skuList1);
		
		Product prod2 = new Product();
		prod2.setProductId(1002);
		prod2.setProductName("shirt");
		prod2.setSkus(skuList2);
		
		List<Product> products = new ArrayList<>();
		products.add(prod1);
		products.add(prod2);
		
		products.forEach(pro -> {
			System.out.println("Product Id: " + pro.productId + " Product Name: " + pro.productName);
			pro.skus.forEach(p -> System.out.println("Sku id: " + p.skuId + " sku Name: " + p.skuSize + " Sku Price: " + p.price));
		});
	}
}
