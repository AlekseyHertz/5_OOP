import org.junit.Assert.*
import org.junit.Test
import org.junit.Before
import WallService

object WallServiceTest {

    @Before
    fun refresh() {
        WallService.clear()
        WallService.addPosts(Post(0,0,0,0,"",Comment(0,true,true),true,true,Likes(5, true),true))
    }
    @Test
    fun addPosts() {

        assertEquals(0,0)
    }

    @Test
    fun upDateIsTrue() {

        val newPost = Post(0,0,0,0,"",Comment(0,true,true),true,true,Likes(5, true),true)
        val result = WallService.upDate(newPost)

        assertTrue(result)
    }

    @Test
    fun upDateIsFalse() { //покапытается провести может вопросы какие-то //


        val newPost = Post(1,0,0,0,"",Comment(0,true,true),true,true,Likes(5, true),true)

        val result = WallService.upDate(newPost)

        assertFalse(result)
    }
}