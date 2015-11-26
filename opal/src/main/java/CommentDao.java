public interface CommentDao {
    void create(Comment comment);

    public Comment findById(int i);
}
