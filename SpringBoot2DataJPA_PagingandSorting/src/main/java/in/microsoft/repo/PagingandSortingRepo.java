package in.microsoft.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.microsoft.entity.Book;

public interface PagingandSortingRepo extends PagingAndSortingRepository<Book, Integer> {

}
