data class Likes(
    var countLike: Int, // число лайков
    val canLike: Boolean,// возможность "лайкать"
)

data class Comment(
    var countComment: Int, // количество комментарий
    val canCommentPost: Boolean, // возможность комментирования
    val canCommentOpen: Boolean, // возможность просмотра
)