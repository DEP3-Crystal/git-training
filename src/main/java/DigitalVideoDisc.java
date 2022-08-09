public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private double cost;
    private int length;


    public DigitalVideoDisc(String title, String category, String director, double cost, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = length;
    }

    public DigitalVideoDisc() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "title '" + title + "'" +
                ", category '" + category + "'" +
                ", director '" + director + "'" +
                ", cost " + cost +
                ", length " + length +
                '}';
    }
}
