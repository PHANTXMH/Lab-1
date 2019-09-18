//MARCAL HARRISON 1703882
												
public class Photo
{
	private int id, size;
	
	
	public Photo(int id, int size) {
		super();
		this.id = id;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", size=" + size + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getsize() {
		return size;
	}

	public void setsize(int size) {
		this.size = size;
	}
	
	
}
