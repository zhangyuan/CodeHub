public class CommentService {
    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    CommentDao commentDao;

    public void createComment(Comment comment) {
        commentDao.create(comment);
    }

    public Comment find(int id) {
        return commentDao.findById(id);
    }
}
