package hust.soict.dsai.aims.media;
import java.util.Comparator;
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
    public Media(String title, String category, float cost){
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
    int result = (title != null ? title.hashCode() : 0);
    result = 31 * result + id;
    return result;
}

    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }
   
    public static final Comparator<Media> COMPARE_BY_TITLE_COST= new MediaTitleComparatorByTiltleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaTitleComparatorByCostTitle();


}