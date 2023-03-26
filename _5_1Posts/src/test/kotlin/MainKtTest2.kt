import org.junit.Test
import org.junit.Assert.*

object WallServiceTest {
    private var posts = emptyArray<Post>()
    private var comment = emptyArray<Comment>()
    private var lastId = 0

    @Test
    fun addPosts(post: Post): Post {
        posts += post.copy(id = lastId++)
        return posts.last()

        val result = post.id

        assertEquals(0, result)
    }

    @Test
    fun upDateIsTrue(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likesCount = post.likesCount.copy())
                return true
            }
        }
        return false

        val result = true
        assertTrue("true", result)
    }

    fun upDateIsFalse(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likesCount = post.likesCount.copy())
                return true
            }
        }
        return false

        val result = false
        assertTrue("false", result)
    }
}