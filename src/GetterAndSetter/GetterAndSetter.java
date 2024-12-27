package GetterAndSetter;

class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("12345");
        System.out.println(category.getId());
    }
}
