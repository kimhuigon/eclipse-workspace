package emp;

// DTO - Data Transfer Object
public class Point {
	int id;
	String title;
	double lat;
	double lng;

	@Override
	public String toString() {
		return "Point [id=" + id + ", title=" + title + ", lat=" + lat + ", lng=" + lng + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
}
