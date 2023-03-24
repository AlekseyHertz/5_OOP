data class Likes(
    var count: Int, // число лайков
    val canLike: Boolean,// возможность "лайкать"
)

data class Comment(
    var count: Int, // количество комментарий
    val canCommentPost: Boolean, // возможность комментирования
    val canCommentOpen: Boolean, // возможность просмотра
)

data class Post(
    var id: Int, // индентификатор записи
    val ownerId: Int, // идентификатор владельца стены
    val fromId: Int, // идентификатор владельца
    val date: Int, // дата
    val text: String, // текст
    val commentCount: Comment, // количество комментарий
    val likesCount: Likes, // число лайков
)

object WallService {
    private var posts = emptyArray<Post>()
    private var comment = emptyArray<Comment>()
    private var lastId = 0

    fun addPosts(post: Post): Post {
        posts += post.copy(id = lastId++)
        return posts.last()
    }

    fun upDate(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == newPost.id) {
                posts[index] = newPost.copy(likesCount = post.likesCount.copy())
                return true
            }
        }
        return false
    }

    fun addComment(post: Post): Comment {
        comment += post.commentCount.copy(count = lastId++)
        return comment.last()
    }

    fun printTextPost(newPost: Post) {
        for (post in posts)
            println(post.text)
    }

    fun printPost(newPost: Post) {
        for (post in posts)
            println(post)
    }
}

fun main() {
    val post =
        Post (0, 0, 0, 0, " ", commentCount = Comment(0, true, true), likesCount = Likes(0, true))
    val likes = Likes(0, true)
    val comment = Comment(0, true, true)
    WallService.addPosts(Post(7, 3, 7, 19_03_2023, " This wall is awsome", commentCount = comment, likes))
    WallService.printPost(post)
    WallService.printTextPost(post)
}