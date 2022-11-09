package nLayeredHomework.entities;

public class Category {
	private int caegoryId;
	private String categoryName;
	
	public Category(int caegoryId, String categoryName) {
		super();
		this.caegoryId = caegoryId;
		this.categoryName = categoryName;
	}

	public int getCaegoryId() {
		return caegoryId;
	}

	public void setCaegoryId(int caegoryId) {
		this.caegoryId = caegoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
