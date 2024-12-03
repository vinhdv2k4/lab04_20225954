package hust.soict.dsai.aims.media;

public abstract class Media {
    protected int id;
    protected  String title;
    protected   String category;
    protected  float cost;
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost= cost;
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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Media)) return false;
        Media ohter = (Media) obj;
        return  this.title != null && this.title .equals(ohter.title) ;
    }
    @Override
    public int hashCode() {
        return this.title != null ? this.title.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }
    

}