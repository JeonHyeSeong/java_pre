package Day21;

public class Sale_Generic<K,V> {
	
	// 멤버 변수 menu, price
	private K menu;
	private V price;
	
	public Sale_Generic() {}
	public Sale_Generic(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sale_Generic [menu=" + menu + ", price=" + price;
	}
	
	
	
}
