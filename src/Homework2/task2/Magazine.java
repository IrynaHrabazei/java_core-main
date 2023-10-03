package Homework2.task2;

public class Magazine extends Book{
    private int width;

    public Magazine() {
    }

    public Magazine(int width) {
        this.width = width;
    }

    public Magazine(int pages, int width) {
        super(pages);
        this.width = width;
    }

    public Magazine(int size, int pages, int width) {
        super(size, pages);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "width=" + width +
                '}'+ super.toString();
    }
}
