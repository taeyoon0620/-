class Article {
    int id;
    String title;
    String body;

    //생성자
    Article(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("{id : %d, title : \"%s\", body : \"%s\"}", id, title ,body);
    }
}