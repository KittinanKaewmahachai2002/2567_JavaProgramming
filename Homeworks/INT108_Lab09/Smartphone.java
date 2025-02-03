
public class Smartphone {
	
	private String brand,model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 512;
	
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	
	public void setBrand(String brand) {
		if(brand.length()>=2) {
			this.brand = brand;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public void setModel(String model) {
		if(model.length()>=2) {
			this.model = model;
		}else {
			System.out.println("Error: Model must have at least 2 characters!");
		}
	}
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity>=1 && storageCapacity<=512) {
			this.storageCapacity = storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	
	public void increaseStorage(int additionalStorage){
		if(additionalStorage>0) {
			if(this.storageCapacity+additionalStorage<=512) {
				this.storageCapacity+=additionalStorage;
			}else {
				System.out.println("Error: Storage capacity cannot exceed 512 GB!");
			}
		}else {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	
	public int getRemainingStorage(int usedStorage) {
		if(usedStorage>=0 && usedStorage<=this.storageCapacity) {
			return this.storageCapacity - usedStorage;
		}else {
			System.out.println("Error: Used storage must be between 0 and 512 GB!");
			return -1;
		}
	}
	
	public void printDetails(){
		System.out.println("Smartphone Details:");
		System.out.println("Brand: "+this.brand);
		System.out.println("Model: "+this.model);
		System.out.println("Storage Capacity: "+this.storageCapacity);
	}
	
}
