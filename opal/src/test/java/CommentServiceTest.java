import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CommentServiceTest {
    @Test
    public void testOk() throws Exception {
        Assert.assertTrue(true);
    }

    @Test
    public void should_create_comment_to_dao_when_comment_service_create_it_by_mock() throws Exception {
        CommentDao dao = Mockito.mock(CommentDao.class);

        CommentService commentService = new CommentService();
        commentService.setCommentDao(dao);

        Comment comment = new Comment(1);

        commentService.createComment(comment);

        Mockito.verify(dao).create(comment);
    }

    @Test
    public void should_find_comment_with_id_by_stub() throws Exception {
        CommentDao dao = Mockito.mock(CommentDao.class);
        CommentService commentService = new CommentService();
        commentService.setCommentDao(dao);

        Comment comment = new Comment(1);

        Mockito.when(dao.findById(1)).thenReturn(comment);

        Comment expectedComment = commentService.find(1);

        assertEquals(1, expectedComment.getId());
    }
}
