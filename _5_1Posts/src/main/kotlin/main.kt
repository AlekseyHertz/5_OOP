data class Post(
    var id: Int, // индентификатор записи
    val ownerId: Int, // идентификатор владельца стены
    val fromId: Int, // идентификатор владельца
    val date: Int, // дата
    val text: String, // текст
    val commentCount: Comment, // количество комментарий
    val canCommentPost: Boolean, // возможность комментирования
    val canCommentOpen: Boolean, // возможность просмотра
    val likesCount: Likes, // число лайков
    val canLike: Boolean,// возможность "лайкать"
)


fun main() {
    val post =
        Post(0, 0, 0, 0, " ", commentCount = Comment(0, true, true), true, true, likesCount = Likes(0, true), true)
    WallService.addPosts(
        Post(
            7,
            3,
            7,
            19_03_2023,
            " This wall is awsome",
            commentCount = Comment(0, true, true), true, true, likesCount = Likes(0, true), true
        )
    )
    WallService.printTextPost(newPost = post)
    WallService.printPost(post)

}