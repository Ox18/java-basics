package task;

public class Serie {

	private String title;
	private int seasons = 3;
	private boolean isDeliver = false;
	private String gender;
	private String creator;
	
	public Serie(String title, String creator, String gender, int seasons, boolean isDeliver) {
		this.title = title;
		this.isDeliver = isDeliver;
		this.creator = creator;
		this.gender = gender;
		this.seasons = seasons;
	}
	public Serie(String title, String creator) {
		this.title = title;
		this.creator = creator;
	}
	public Serie(String title, String creator, String gender, int seasons) {
		this.title = title;
		this.creator = creator;
		this.gender = gender;
		this.seasons = seasons;
	}

	public String getGender() {
		return gender;
	}
	public String genderToString() {
		return this.gender;
	}
	public String creatorToString() {
		return this.creator;
	}
	public String seasonsToString() {
		return Integer.toString(this.seasons);
	}
	public String isDeliver() {
		return Boolean.toString(this.isDeliver);
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private int getSeasons() {
		return seasons;
	}

	private void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	

}
