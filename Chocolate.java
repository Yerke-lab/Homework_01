public class Chocolate extends Product {
    private final String cacaoContent;
    public Chocolate(String name, double cost, String cacaoContent) {
        super(name, cost);
        this.cacaoContent = cacaoContent;
    }

    @Override
    public String toString() {
        return super.toString() + " cacaoContent: " + cacaoContent;
    }

    public String getCacaoContent() {
        return cacaoContent;
    }
}
