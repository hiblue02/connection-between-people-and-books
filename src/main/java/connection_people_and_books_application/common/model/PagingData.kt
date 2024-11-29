package connection_people_and_books_application.common.model

import org.springframework.data.domain.Page

data class PagingData<T>(
    val pageSize:Int,
    val pageNumber:Int,
    val hasNext:Boolean,
    val content:List<T>
) {
    constructor(page: Page<T>) : this(
        pageSize = page.size,
        pageNumber = page.number,
        hasNext = !page.isLast,
        content = page.content
    )
}
